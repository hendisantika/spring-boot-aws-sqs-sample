package id.my.hendisantika.springbootawssqssample.config;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.model.GetQueueUrlResult;
import com.fasterxml.jackson.databind.ObjectMapper;
import id.my.hendisantika.springbootawssqssample.model.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aws-sqs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 18.47
 * To change this template use File | Settings | File Templates.
 */
@Service
@Log4j2
@RequiredArgsConstructor
public class Publisher {

    private final AmazonSQS amazonSQSClient;
    private final ObjectMapper objectMapper;

    @Value("${aws.queueName}")
    private String queueName;

    public void publishMessage(String id) {
        try {
            GetQueueUrlResult queueUrl = amazonSQSClient.getQueueUrl(queueName);
            var message = Message.builder()
                    .id(id)
                    .content("message")
                    .createdAt(new Date()).build();
            var result = amazonSQSClient.sendMessage(queueUrl.getQueueUrl(), objectMapper.writeValueAsString(message));
        } catch (Exception e) {
            log.error("Queue Exception Message: {}", e.getMessage());
        }

    }
}
