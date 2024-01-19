package org.example.enocachallenge.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "job", schema = "enoca")
public class Job {
    @Id
    @Column(name = "jobID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int jobID;

    @Column(name = "jobname", nullable = false)
    private String jobName;

    @OneToMany(mappedBy = "job")
    private Set<Worker> worker;

    public Job(int jobID, String jobName) {
        this.jobID = jobID;
        this.jobName = jobName;
    }
    public Job() {}

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
