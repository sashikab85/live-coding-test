package com.codejam.demo;

import com.codejam.demo.model.PersonalInformation;
import com.codejam.demo.service.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

    private UserService userService;

    @Before
    public void setup() {
        userService = new UserService ();
    }

    @Test
    public void test_IdolPersonalInfo_nominal() {
        PersonalInformation personalInformation = userService.gerIdolPersonalInfo ();
        Assert.assertFalse("idol status should not be in - active!", personalInformation.getIdolStatus().equalsIgnoreCase("in-active"));
    }
}
