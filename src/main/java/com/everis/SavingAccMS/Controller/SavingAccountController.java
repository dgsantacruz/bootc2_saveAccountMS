package com.everis.SavingAccMS.Controller;

import com.everis.SavingAccMS.Service.Impl.SavingAccountServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController()
@RequestMapping("/savingacc")
public class SavingAccountController
{
    @Autowired
    private SavingAccountServiceImpl service;

    @GetMapping("/test")
    public String testing()
    {
        return "Test";
    }

    //Get account by number

    //Create account

    //Delete account
}