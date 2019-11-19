package eureka.ha.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author cjz
 * @date 2018-11-08 13:47
 * 启动一个时候报错不用管，因为注册另外一个不能注册
 * 修改active: peer1 为 peer2 一个一个启动即可
 * 使用命令话：要打jar
 * java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer1
 * java -jar eureka-server-ha-0.0.1-SNAPSHOT.jar - -spring.profiles.active=peer2
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaHAServerAPP {

    public static void main(String[] args){
        SpringApplication.run(EurekaHAServerAPP.class,args);
    }

}
