package id.my.hendisantika.springbootcqrsdemo.controller;

import id.my.hendisantika.springbootcqrsdemo.dto.ContactCommandDto;
import id.my.hendisantika.springbootcqrsdemo.model.Contact;
import id.my.hendisantika.springbootcqrsdemo.service.ContactCommandService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:38
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@RestController
@RequestMapping(value = "/api/contacts")
@RequiredArgsConstructor
public class ContactCommandController {
    private final ContactCommandService contactCommandService;

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody ContactCommandDto contactDto) {
        Contact contact = new Contact(contactDto.getId(), contactDto.getName(), contactDto.getEmail(), contactDto.getPhone());
        long savedContactId = contactCommandService.create(contact);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedContactId).toUri();
        return ResponseEntity.created(location).build();
    }
}
