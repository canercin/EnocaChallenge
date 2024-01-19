package org.example.enocachallenge.BusinessLayer;

import org.example.enocachallenge.Entities.Job;

import java.util.List;

public interface IJobService {
    List<Job> getAllJobs();
    void insertJob(Job job);
    void updateJob(Job job);
    void deleteJob(Job job);
    Job getJobByID(int jobID);
}
