package org.example.enocachallenge.BusinessLayer;

import org.example.enocachallenge.DataAccessLayer.IWorkerDAL;
import org.example.enocachallenge.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WorkerService implements IWorkerService{

    private IWorkerDAL workerDAL;

    @Autowired
    public WorkerService(IWorkerDAL workerDAL) {
        this.workerDAL = workerDAL;
    }

    @Override
    @Transactional
    public List<Worker> getAllWorkers() {
        return this.workerDAL.getAllWorkers();
    }

    @Override
    @Transactional
    public void insertWorker(Worker worker) {
        this.workerDAL.insertWorker(worker);
    }

    @Override
    @Transactional
    public void updateWorker(Worker worker) {
        this.workerDAL.updateWorker(worker);
    }

    @Override
    @Transactional
    public void deleteWorker(Worker worker) {
        this.workerDAL.deleteWorker(worker);
    }

    @Override
    @Transactional
    public Worker getWorkerByID(int workerID) {
        return this.workerDAL.getWorkerByID(workerID);
    }
}
