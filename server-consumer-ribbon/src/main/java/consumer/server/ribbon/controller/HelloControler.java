package consumer.server.ribbon.controller;

import consumer.server.ribbon.server.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cjz
 * @date 2019-03-18 14:51
 **/
@RestController
public class HelloControler {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hiRibbon")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}

