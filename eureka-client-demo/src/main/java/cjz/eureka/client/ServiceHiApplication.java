package cjz.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 * @author cjz
 * @date 2019-03-18 14:21
 **/
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run( ServiceHiApplication.class, args );
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }


    @RequestMapping("/test")
    public String info(){
        System.out.println("calling trace service-hi");

        return "i'm service-hi";

    }

    @RequestMapping("/pojo")
    public BaseResponse<BookBO> pojo(){
        System.out.println("calling trace service-hi");
        BookBO book = new BookBO();
        book.setId(1L);
        book.setAuthor("cjz");
        book.setName("cjzName");
        return BaseResponse.newSuccResponse(book);

    }
}
