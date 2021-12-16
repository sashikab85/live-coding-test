
package com.codejam.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


//@RestController
//@RequiredArgsConstructor
//@RequestMapping(path = "demo")
public class DemoController {


    @GetMapping(path = "/unit-test")
    ResponseEntity<Integer> getUnitTestResult() throws Exception{
        return null;
    }

}

