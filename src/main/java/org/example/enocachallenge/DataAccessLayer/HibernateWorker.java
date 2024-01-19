package org.example.enocachallenge.DataAccessLayer;

import jakarta.persistence.EntityManager;
import org.example.enocachallenge.Entities.Worker;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateWorker implements IWorkerDAL{
    private EntityManager entityManager;
    @Autowired
    public HibernateWorker(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Worker> getAllWorkers() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("select j from Worker j", Worker.class).getResultList();
    }

    @Override
    @Transactional
    public void insertWorker(Worker worker) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(worker);
    }

    @Override
    @Transactional
    public void updateWorker(Worker worker) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(worker);
    }

    @Override
    @Transactional
    public void deleteWorker(Worker worker) {
        Session session = entityManager.unwrap(Session.class);
        Worker workerToDelete = session.get(Worker.class, worker.getWorkerID());
        session.delete(workerToDelete);
    }

    @Override
    @Transactional
    public Worker getWorkerByID(int workerID) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Worker.class, workerID);
    }
}
