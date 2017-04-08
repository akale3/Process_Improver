package edu.process.improver.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Aditya on 19-02-2017.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping(value = "/loginUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody void loginUser() {
        try {
            System.out.println("In login controller");
        } catch (Exception e) {
            System.out.println("Error in getting data for Mortality in US");
        }
    }
}
