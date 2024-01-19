package org.example.enocachallenge.DataAccessLayer;

import org.example.enocachallenge.Entities.Job;

import java.util.List;

public interface IJobDAL {
    List<Job> getAllJobs();
    void insertJob(Job job);
    void updateJob(Job job);
    void deleteJob(Job job);
    Job getJobByID(int jobID);
}
