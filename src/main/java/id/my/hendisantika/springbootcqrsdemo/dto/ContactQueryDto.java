package id.my.hendisantika.springbootcqrsdemo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:30
 * To change this template use File | Settings | File Templates.
 */

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactQueryDto {

    private final long id;
    private final String name;
    private final String email;
    private final String phone;

    @JsonCreator
    public ContactQueryDto(@JsonProperty("id") long id,
                           @JsonProperty("name") String name,
                           @JsonProperty("email") String email,
                           @JsonProperty("phone") String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

}
