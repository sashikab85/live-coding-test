package com.codejam.demo.service;

import com.codejam.demo.client.RestClient;
import com.codejam.demo.model.PersonalInformation;
import com.codejam.demo.model.User;
import com.codejam.demo.repository.PersonalInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Date;

@Service
public class UserService {
    @Autowired
    RestClient restClient;

    @Autowired
    PersonalInformationRepository  personalInformationRepository;

    public User getUser(String id) {
        return restClient.getUser(id);
    }

    public PersonalInformation gerIdolPersonalInfo () {
        Integer randomNumber = this.generateRandomInteger(1,1);
        com.codejam.demo.entity.PersonalInformation personalInfo = personalInformationRepository
                .findById(randomNumber);
        return new PersonalInformation(personalInfo.getId(),
                personalInfo.getRealName(),
                personalInfo.getIdolName(),
                personalInfo.getAddress(),
                personalInfo.getIdolStatus());
    }

    public int generateRandomInteger(int min, int max) {
        SecureRandom rand = new SecureRandom();
        rand.setSeed(new Date().getTime());
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
