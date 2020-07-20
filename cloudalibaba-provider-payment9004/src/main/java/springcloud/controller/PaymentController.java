package springcloud.controller;

import com.yeafel.springcloud.entities.CommonResult;
import com.yeafel.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author Yeafel
 * 2020/7/15 20:26
 * Do or Die,To be a better man!
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    public static HashMap<Long, Payment> hashMap = new HashMap<>();

    static {
        hashMap.put(1L, new Payment(1L, "28a8c1e3bc2747d8848569891fb42181"));
        hashMap.put(2L, new Payment(2L, "57dec1e3bc2747d8848569891fb42737"));
        hashMap.put(3L, new Payment(3L, "98a8c1e3bc2747d8848569891fb47484"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        Payment payment = hashMap.get(id);
        CommonResult commonResult = new CommonResult(200, "from mysql,serverPort:  " + serverPort, payment);
        return commonResult;
    }
}
