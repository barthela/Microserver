package systems.javaware.datamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by aba on 20.11.16.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class Microserver {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Microserver.class, args);
    }

}
