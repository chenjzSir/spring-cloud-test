package cjz.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cjz
 * @date 2018-11-08 13:47
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerAPP {

    public static void main(String[] args){
        SpringApplication.run(EurekaServerAPP.class,args);
    }

}
