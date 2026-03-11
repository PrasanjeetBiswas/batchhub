package com.example.batchApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.batchApi.model.batchData;
import com.example.batchApi.service.batchService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@CrossOrigin("http://localhost:3000/")
@RestController
public class batchController {
batchService ser;
batchController(batchService ser){
    this.ser = ser;
}

@GetMapping("/get-all-batchs")
public List<batchData> getMethodName() {
    return ser.getAll();
}

@PostMapping("/post-batch-data")
public String postMethodName(@RequestBody batchData batch) {
return ser.postData(batch);
}


}
