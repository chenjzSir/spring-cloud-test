package feign.consumer.demo.controller;

import feign.consumer.demo.feign.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cjz
 * @date 2019-03-18 15:09
 **/
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    //实际项目遇到过  ，是自己用controller实现feign接口，然后通过因包使用
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hiByFeign")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }
}

