package org.example.enocachallenge.BusinessLayer;

import org.example.enocachallenge.DataAccessLayer.IJobDAL;
import org.example.enocachallenge.Entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class JobService implements IJobService{
    private IJobDAL jobDAL;

    @Autowired
    public JobService(IJobDAL jobDAL) {
        this.jobDAL = jobDAL;
    }

    @Override
    @Transactional
    public List<Job> getAllJobs() {
        return this.jobDAL.getAllJobs();
    }

    @Override
    @Transactional
    public void insertJob(Job job) {
        this.jobDAL.insertJob(job);
    }

    @Override
    @Transactional
    public void updateJob(Job job) {
        this.jobDAL.updateJob(job);
    }

    @Override
    @Transactional
    public void deleteJob(Job job) {
        this.jobDAL.deleteJob(job);
    }

    @Override
    @Transactional
    public Job getJobByID(int jobID) {
        return this.jobDAL.getJobByID(jobID);
    }
}
