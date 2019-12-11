package com.everis.savingaccount.Controller;

import com.everis.savingaccount.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.everis.savingaccount.Model.SavingAccount;

import reactor.core.publisher.Flux;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController()
@RequestMapping("/savingacc")
public class savingAccountController
{
    @Autowired
    private SavingAccountService service;

    //Get all accounts
    @GetMapping("/account/all")
    public Flux<SavingAccount> getAllAccounts()
    {
        return service.findAllAccounts();
    }

    @GetMapping("/test")
    public String testing()
    {
        return "Test";
    }

    //Get account by number

    //Create account

    //Delete account
}