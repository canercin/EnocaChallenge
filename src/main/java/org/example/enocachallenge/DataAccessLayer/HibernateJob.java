package org.example.enocachallenge.DataAccessLayer;

import jakarta.persistence.EntityManager;
import org.example.enocachallenge.Entities.Job;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class HibernateJob implements IJobDAL{

    private EntityManager entityManager;

    @Autowired
    public HibernateJob(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<Job> getAllJobs() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("select j from Job j", Job.class).getResultList();
    }

    @Override
    @Transactional
    public void insertJob(Job job) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(job);
    }

    @Override
    public void updateJob(Job job) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(job);
    }

    @Override
    public void deleteJob(Job job) {
        Session session = entityManager.unwrap(Session.class);
        Job jobToDelete = session.get(Job.class, job.getJobID());
        session.delete(jobToDelete);
    }

    @Override
    public Job getJobByID(int jobID) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Job.class, jobID);
    }
}
