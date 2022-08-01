package online.k12code.server.controller;

import com.alibaba.csp.sentinel.EntryType;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import online.k12code.server.fallback.Fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */
@RestController
public class DegradeService {
    private static final String RES="d1";


    @GetMapping("d1/{id}")
    @SentinelResource(value = "info",blockHandler ="exceptionHandler" )
    public String d1(@PathVariable Integer id) throws InterruptedException{
        throw new RuntimeException("ds");
//        return "d1"+id;
    }

    public String exceptionHandler(Integer id, BlockException e){
        e.printStackTrace();
        return "熔断降级："+id;
    }

    @PostConstruct  //熔断控制
    public void initDegradeRule()  {
        List<DegradeRule> rules = new ArrayList<>();
        DegradeRule rule = new DegradeRule();
        rule.setResource("info");
        // set threshold RT, 10 ms
        rule.setCount(2);
        //设置规则测率：异常数
        rule.setGrade(RuleConstant.DEGRADE_GRADE_EXCEPTION_COUNT);
        //触发熔断异常数 2
        rule.setCount(2);
        //触发熔断最小请求数
        rule.setMinRequestAmount(2);
        //统计单位时间  单位ms  一分钟
        rule.setStatIntervalMs(60*1000);
        //熔断一旦触发，再次请求对应的接口就会直接调用 降级方法
        //10秒过了后--半开状态：恢复接口请求调用，如果第一次请求就异常，直接再次熔断
        rule.setTimeWindow(30);

        rules.add(rule);
        DegradeRuleManager.loadRules(rules);
    }
}
