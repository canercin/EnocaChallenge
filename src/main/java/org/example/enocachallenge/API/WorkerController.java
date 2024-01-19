package org.example.enocachallenge.API;

import org.example.enocachallenge.BusinessLayer.IWorkerService;
import org.example.enocachallenge.BusinessLayer.WorkerService;
import org.example.enocachallenge.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WorkerController {
    private IWorkerService workerService;

    @Autowired
    public WorkerController(IWorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/getAllWorkers")
    public List<Worker> getAllWorkers(){
        return this.workerService.getAllWorkers();
    }

    @PostMapping("/insertWorker")
    public void insertWorker(@RequestBody Worker worker){
        this.workerService.insertWorker(worker);
    }

    @PostMapping("/updateWorker")
    public void updateWorker(@RequestBody Worker worker){
        this.workerService.updateWorker(worker);
    }

    @PostMapping("/deleteWorker")
    public void deleteWorker(@RequestBody Worker worker){
        this.workerService.deleteWorker(worker);
    }

    @GetMapping("/getWorkerByID/{workerID}")
    public Worker getWorkerByID(@PathVariable int workerID){
        return  this.workerService.getWorkerByID(workerID);
    }
}
