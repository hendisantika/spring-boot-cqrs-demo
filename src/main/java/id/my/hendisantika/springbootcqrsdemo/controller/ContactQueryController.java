package id.my.hendisantika.springbootcqrsdemo.controller;

import id.my.hendisantika.springbootcqrsdemo.service.ContactQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:40
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/contacts")
@RequiredArgsConstructor
public class ContactQueryController {
    private final ContactQueryService contactQueryService;
}
