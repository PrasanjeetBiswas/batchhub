package com.example.loginpage.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loginpage.Model.logData;
import java.util.List;


@Repository
public interface logRepo extends JpaRepository<logData , Long> {
logData findByEmail(String email);
}
