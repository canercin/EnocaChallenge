package org.example.enocachallenge.API;

import org.example.enocachallenge.BusinessLayer.IJobService;
import org.example.enocachallenge.Entities.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> insertJob(@RequestBody Job job){
        this.jobService.insertJob(job);
        return new ResponseEntity<>("Job added successfully", HttpStatus.OK);
    }

    @PostMapping("/updateJob")
    public ResponseEntity<String> updateJob(@RequestBody Job job){
        this.jobService.updateJob(job);
        return new ResponseEntity<>("Job updated successfully", HttpStatus.OK);
    }

    @PostMapping("/deleteJob")
    public ResponseEntity<String> deleteJob(@RequestBody Job job){
        this.jobService.deleteJob(job);
        return new ResponseEntity<>("Job deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/getJobByID/{jobID}")
    public Job getJobByID(@PathVariable int jobID){
        return this.jobService.getJobByID(jobID);
    }

}
