package com.example.batchApi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.batchApi.Repository.batchRepo;
import com.example.batchApi.model.batchData;

@Service
public class batchService {
batchRepo repo;
batchService(batchRepo repo){
    this.repo = repo;
}
public List<batchData> getAll() {

    return repo.findAll();
}
public String postData(batchData batch) {
    repo.save(batch);
return "Added Data Successfully";
}


}
