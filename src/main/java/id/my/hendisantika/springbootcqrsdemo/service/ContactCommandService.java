package id.my.hendisantika.springbootcqrsdemo.service;

import id.my.hendisantika.springbootcqrsdemo.model.Contact;
import id.my.hendisantika.springbootcqrsdemo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:35
 * To change this template use File | Settings | File Templates.
 */
@Slf4j
@Transactional
@Service
@RequiredArgsConstructor
public class ContactCommandService {
    private final ContactRepository contactRepository;

    public Long create(Contact contact) {
        return contactRepository.create(contact);
    }

    public void update(Contact contact) {
        contactRepository.update(contact);
    }
}
