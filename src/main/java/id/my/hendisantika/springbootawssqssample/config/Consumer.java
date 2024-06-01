package id.my.hendisantika.springbootawssqssample.config;

import com.amazonaws.services.sqs.AmazonSQS;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aws-sqs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 18.49
 * To change this template use File | Settings | File Templates.
 */
@Service
@Log4j2
@RequiredArgsConstructor
public class Consumer {

    private final AmazonSQS amazonSQSClient;
    @Value("${aws.queueName}")
    private String queueName;
}
