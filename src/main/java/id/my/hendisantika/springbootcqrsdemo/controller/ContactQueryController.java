package id.my.hendisantika.springbootcqrsdemo.controller;

import id.my.hendisantika.springbootcqrsdemo.dto.ContactQueryDto;
import id.my.hendisantika.springbootcqrsdemo.model.Contact;
import id.my.hendisantika.springbootcqrsdemo.service.ContactQueryService;
import jakarta.persistence.NoResultException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping("/{id}")
    public Contact getContact(@PathVariable long id) {
        return contactQueryService
                .findById(id)
                .orElseThrow(NoResultException::new);
    }

    @GetMapping
    public List<ContactQueryDto> getContacts() {
        return contactQueryService.findAll().stream()
                .map(con -> new ContactQueryDto(con.getId(), con.getName(), con.getEmail(), con.getPhone()))
                .collect(Collectors.toList());
    }
}
