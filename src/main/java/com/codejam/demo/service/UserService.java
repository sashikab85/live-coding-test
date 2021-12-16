package com.codejam.demo.service;

import com.codejam.demo.client.RestClient;
import com.codejam.demo.model.PersonalInformation;
import com.codejam.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    RestClient restClient;

    public User getUser(String id) {
        return restClient.getUser(id);
    }

    public PersonalInformation gerIdolPersonalInfo () {
        return null;
    }
}
