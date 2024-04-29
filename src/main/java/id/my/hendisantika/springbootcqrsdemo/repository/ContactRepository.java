package id.my.hendisantika.springbootcqrsdemo.repository;

import id.my.hendisantika.springbootcqrsdemo.model.Contact;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    public Optional<Contact> findById(long id) {
        return entityManager.createQuery("select c from Contact c where c.id = :id", Contact.class)
                .setParameter("id", id)
                .setMaxResults(1)
                .getResultList()
                .stream()
                .findFirst();
    }

    public List<Contact> findAll() {
        return entityManager.createQuery("from Contact c", Contact.class).getResultList();
    }

    public long create(Contact contact) {
        entityManager.persist(contact);
        entityManager.flush();
        return contact.getId();
    }

    public void update(Contact contact) {
        Query query = entityManager.createQuery("update Contact c set c.name = :name, c.email = :email, c.phone = :phone where c.id = :id");
        query.setParameter("id", contact.getId());
        query.setParameter("name", contact.getName());
        query.setParameter("email", contact.getEmail());
        query.setParameter("phone", contact.getPhone());
        query.executeUpdate();
    }
}
