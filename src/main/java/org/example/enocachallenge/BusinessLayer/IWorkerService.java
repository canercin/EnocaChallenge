package org.example.enocachallenge.BusinessLayer;

import org.example.enocachallenge.Entities.Worker;

import java.util.List;

public interface IWorkerService {
    List<Worker> getAllWorkers();
    void insertWorker(Worker worker);
    void updateWorker(Worker worker);
    void deleteWorker(Worker worker);
    Worker getWorkerByID(int workerID);
}
