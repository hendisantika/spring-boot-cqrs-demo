package id.my.hendisantika.springbootcqrsdemo.service;

import id.my.hendisantika.springbootcqrsdemo.model.Contact;
import id.my.hendisantika.springbootcqrsdemo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:37
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class ContactQueryService {
    private final ContactRepository contactRepository;

    public Optional<Contact> findById(long id) {
        return contactRepository.findById(id);
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }
}
