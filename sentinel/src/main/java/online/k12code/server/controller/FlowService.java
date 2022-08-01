package online.k12code.server.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.RuleConstant;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRule;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeRuleManager;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import online.k12code.server.fallback.Fallback;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author 阿威
 * @Date 2022/7/30
 */
@RestController
public class FlowService {

    private static final String RES="s1";



    @SentinelResource(value = RES,blockHandler = "exceptionHandler",fallback = "fallback",fallbackClass = {Fallback.class})
    @GetMapping("s1/{id}")
    public String s1(@PathVariable Integer id){
//        int z=1/0;
        return "ds"+id;
    }

    public String exceptionHandler(Integer id, BlockException e){
        e.printStackTrace();
        return "这是分流处理的函数"+id;
    }
    //spring 初始化方法
    @PostConstruct   //流量控制
    private static void initFlowRules(){
        List<FlowRule> rules = new ArrayList<>();
        FlowRule rule = new FlowRule();
        rule.setResource(RES);//定义的资源名
        rule.setGrade(RuleConstant.FLOW_GRADE_QPS);
        // Set limit QPS to 3每秒最多三次请求
        rule.setCount(3);
        rules.add(rule);
        FlowRuleManager.loadRules(rules);
    }


}
