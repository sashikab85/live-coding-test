
package com.codejam.demo.controller;


import com.codejam.demo.exception.CustomException;
import com.codejam.demo.model.PersonalInformation;
import com.codejam.demo.model.User;
import com.codejam.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
@CrossOrigin
public class DemoController {

    @Autowired
    UserService userService;


    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<String> getUnitTestResult() throws Exception {
        return ResponseEntity.ok(new String(" <<<<<<<<< Test Spring Filters <<<<<<<"));
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User getUser(String id) {
        try {
            return userService.getUser(id);
        } catch (Exception ex) {
            throw new CustomException("Internal Server error !",
                    HttpStatus.INTERNAL_SERVER_ERROR, true);
        }
    }

    @RequestMapping(value = "/idol-info", method = RequestMethod.GET)
    public PersonalInformation getIdolPersonalInfo() {
        try {
            return userService.gerIdolPersonalInfo();
        } catch (Exception ex) {
            throw new CustomException("Internal Server error !",
                    HttpStatus.INTERNAL_SERVER_ERROR, true);
        }
    }

}

