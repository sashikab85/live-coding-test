package com.codejam.demo.client;

import com.codejam.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class RestClient {

    @Autowired
    RestTemplate restTemplate;

    private final String USERS_URI = "https://jsonplaceholder.typicode.com/todos/{id}";

    public User getUser(String id) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("id", "1");
        User user = restTemplate.getForObject(USERS_URI, User.class, params);
        return user;
    }
}
