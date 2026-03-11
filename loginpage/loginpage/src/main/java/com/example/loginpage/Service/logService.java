package com.example.loginpage.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.loginpage.Model.logData;
import com.example.loginpage.Respository.logRepo;

@Service
public class logService {

    logRepo repo;

    logService(logRepo repo){
        this.repo = repo;
    }

    // posting data
    public String post(logData user_Data) {

        repo.save(user_Data);
        return "Login Data Saved Successfully";
    }

    // getting data

    public logData get(String email) {

        return repo.findByEmail(email);
    }

    // deleting data
    public String delete(long id) {
        repo.deleteById(id);
        return "Login Data Deleted Successfully";
    }

    // updating data
    public String post(long id, logData user_Data) {
        logData db_user_data = repo.findById(id).orElseThrow();

        if(user_Data.getEmail() != null){
            db_user_data.setEmail(user_Data.getEmail());
        }
        if(user_Data.getPassword() != null){
            db_user_data.setPassword(user_Data.getPassword());
        }

        repo.save(db_user_data);
        return "Updated User Data Successfully";
    }

}
