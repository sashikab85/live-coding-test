
package com.codejam.demo.controller;


import com.codejam.demo.model.User;
import com.codejam.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
@CrossOrigin
public class DemoController {

    @Autowired
    UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<String> getUnitTestResult() throws Exception{
        return ResponseEntity.ok(new String(" <<<<<<<<< Test Spring Filters <<<<<<<"));
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(String id) {
        return userService.getUser(id);
    }

}

