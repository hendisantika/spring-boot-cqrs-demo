package id.my.hendisantika.springbootcqrsdemo.controller;

import jakarta.persistence.NoResultException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:39
 * To change this template use File | Settings | File Templates.
 */
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = NoResultException.class)
    public ResponseEntity handleContactNotFound() {
        return new ResponseEntity<>("Contact not found!", HttpStatus.NOT_FOUND);
    }
}
