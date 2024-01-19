package org.example.enocachallenge.DataAccessLayer;

import org.example.enocachallenge.Entities.Worker;

import java.util.List;

public interface IWorkerDAL {
    List<Worker> getAllWorkers();
    void insertWorker(Worker worker);
    void updateWorker(Worker worker);
    void deleteWorker(Worker worker);
    Worker getWorkerByID(int workerID);

}
