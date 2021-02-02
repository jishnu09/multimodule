package com.multimodule.controller;

import com.multimodule.database.connector.DatabaseConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class LoginController {
    @Autowired
    private DatabaseConnector databaseConnector;

    @RequestMapping(value = "/simpleAuth",method = RequestMethod.GET)
    public String simpleAuth(){
        databaseConnector.connectDatabase();
        return "Swarnendu";
    }

}
