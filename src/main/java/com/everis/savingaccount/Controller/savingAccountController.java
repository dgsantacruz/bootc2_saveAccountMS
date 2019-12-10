package com.everis.savingaccount.Controller;

import com.everis.savingaccount.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.everis.savingaccount.Model.SavingAccount;

import reactor.core.publisher.Flux;

@RestController
public class savingAccountController
{
    @Autowired
    private SavingAccountService service;

    //Get all accounts
    public Flux<SavingAccount> getAllAccounts()
    {
        return service.findAllAccounts();
    }

    //Get account by number

    //Create account

    //Delete account
}