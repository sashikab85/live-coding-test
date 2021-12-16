
package com.codejam.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/demo")
@CrossOrigin
public class DemoController {


    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<String> getUnitTestResult() throws Exception{
        return ResponseEntity.ok(new String(" <<<<<<<<< Test Spring Filters <<<<<<<"));
    }

}

