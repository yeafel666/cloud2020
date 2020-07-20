package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Yeafel
 * 2020/7/14 15:26
 * Do or Die,To be a better man!
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPaymentMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(NacosPaymentMain9002.class, args);
    }
}
