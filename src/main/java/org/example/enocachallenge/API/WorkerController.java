package org.example.enocachallenge.API;

import org.example.enocachallenge.BusinessLayer.IWorkerService;
import org.example.enocachallenge.BusinessLayer.WorkerService;
import org.example.enocachallenge.Entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> insertWorker(@RequestBody Worker worker){
        this.workerService.insertWorker(worker);
        return new ResponseEntity<>("Worker added successfully", HttpStatus.OK);
    }

    @PostMapping("/updateWorker")
    public ResponseEntity<String> updateWorker(@RequestBody Worker worker){
        this.workerService.updateWorker(worker);
        return new ResponseEntity<>("Worker updated successfully", HttpStatus.OK);
    }

    @PostMapping("/deleteWorker")
    public ResponseEntity<String> deleteWorker(@RequestBody Worker worker){
        this.workerService.deleteWorker(worker);
        return new ResponseEntity<>("Worker deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/getWorkerByID/{workerID}")
    public Worker getWorkerByID(@PathVariable int workerID){
        return  this.workerService.getWorkerByID(workerID);
    }
}
