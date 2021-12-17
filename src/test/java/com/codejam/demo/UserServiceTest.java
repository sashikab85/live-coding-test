package com.codejam.demo;

import com.codejam.demo.client.RestClient;
import com.codejam.demo.model.PersonalInformation;
import com.codejam.demo.repository.PersonalInformationRepository;
import com.codejam.demo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    @Mock
    private PersonalInformationRepository personalInformationRepository;

    @Mock
    private RestClient restClient;

    private UserService userService;

    @Before
    public void setup() {

        userService = new UserService(restClient, personalInformationRepository);
    }

    @Test
    public void test_IdolPersonalInfo_nominal() {
        Mockito.when(personalInformationRepository.findById(Mockito.anyInt())).thenReturn(this.getIdolPersonalInformation());
        PersonalInformation personalInformation = userService.gerIdolPersonalInfo();
        Assert.assertTrue("idol status should not be in - active!", personalInformation.getIdolStatus().equalsIgnoreCase("active"));
    }

    private com.codejam.demo.entity.PersonalInformation getIdolPersonalInformation() {
        return new com.codejam.demo.entity.PersonalInformation(1, "rahimi", "remy", "Malaysia", "ACTIVE");
    }
}
