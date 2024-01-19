package org.example.enocachallenge.API;

import org.example.enocachallenge.BusinessLayer.IJobService;
import org.example.enocachallenge.Entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {
    private IJobService jobService;

    @Autowired
    public JobController(IJobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getAllJobs")
    public List<Job> getAllJobs(){
        return this.jobService.getAllJobs();
    }

    @PostMapping("/insertJob")
    public void insertJob(@RequestBody Job job){
        this.jobService.insertJob(job);
    }

    @PostMapping("/updateJob")
    public void updateJob(@RequestBody Job job){
        this.jobService.updateJob(job);
    }

    @PostMapping("/deleteJob")
    public void deleteJob(@RequestBody Job job){
        this.jobService.deleteJob(job);
    }

    @GetMapping("/getJobByID/{jobID}")
    public Job getJobByID(@PathVariable int jobID){
        return this.jobService.getJobByID(jobID);
    }

}
