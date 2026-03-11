package com.example.batchApi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.batchApi.model.batchData;

@Repository
public interface batchRepo extends JpaRepository<batchData, Long>{

}
