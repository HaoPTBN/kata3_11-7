package qsoft.dao.impl;

import org.springframework.orm.jpa.support.JpaDaoSupport;
import qsoft.dao.TransactionDao;
import qsoft.entity.BankAccount;
import qsoft.entity.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: haopt
 * Date: 7/10/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDaoImpl extends JpaDaoSupport implements TransactionDao {
    EntityManagerFactory entityManagerFactory;

    public TransactionDaoImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("JpaPersistenceUnit", System.getProperties());
        super.setEntityManagerFactory(entityManagerFactory);
    }

    public Transaction save(Transaction transaction) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();

        return null;
    }

    public List<Transaction> findAllByAccountNumber(String accountNumber) {
        return null;
    }
}
