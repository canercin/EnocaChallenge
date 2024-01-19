package org.example.enocachallenge.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "worker", schema = "enoca")
public class Worker {
    @Id
    @Column(name = "workerID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int workerID;

    @ManyToOne
    @JoinColumn(name = "jobID")
    private Job job;

    @Column(name = "fullname", nullable = false)
    private String workerName;

    @Column(name = "salary", nullable = false)
    private float salary;

    public Worker(int workerID, Job job, String workerName, float salary) {
        this.workerID = workerID;
        this.job = job;
        this.workerName = workerName;
        this.salary = salary;
    }

    public Worker() {
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job jobID) {
        this.job = jobID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
