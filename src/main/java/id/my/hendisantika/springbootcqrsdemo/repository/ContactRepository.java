package id.my.hendisantika.springbootcqrsdemo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-cqrs-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 4/30/24
 * Time: 06:33
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class ContactRepository {
    @PersistenceContext
    private EntityManager entityManager;
}
