package id.my.hendisantika.springbootawssqssample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-aws-sqs-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/06/24
 * Time: 18.48
 * To change this template use File | Settings | File Templates.
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String id;
    private String content;
    private Date createdAt;
}
