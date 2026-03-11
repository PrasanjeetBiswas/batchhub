package com.example.loginpage.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.loginpage.Model.logData;
import com.example.loginpage.Service.logService;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin ("http://localhost:3000/")
@RestController
public class logController {

    logService ser;
    logController(logService ser){
        this.ser = ser;
    }

    @GetMapping("/get-user/{email}")
    public logData getMethodName(@PathVariable String email) {
        return ser.get(email);
    }

    @PostMapping("/post-user")
    public String postMethodName(@RequestBody logData user_Data) {
        //TODO: process POST request
        
        return ser.post(user_Data);
    }
    
    @DeleteMapping("/delete-user/{id}")
    public String deleteMethod(@PathVariable long id){
        return ser.delete(id);
    }

    @PutMapping("/update-user-data/{id}")
    public String putMethodName(@PathVariable long id, @RequestBody logData user_Data) {
        //TODO: process PUT request
        
        return ser.post(id,user_Data);
    }
}
