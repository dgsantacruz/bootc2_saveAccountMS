package com.everis.SavingAccMS.Controller;

import com.everis.SavingAccMS.Service.Impl.SavingAccountServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController()
public class SavingAccountController
{
    @Autowired
    private SavingAccountServiceImpl service;

    //Create new Account
    @PostMapping("/savingacc/create")
    public Mono<SavingAccount> createNewAccount(SavingAccount account) {
        return service.addAccount(account);
    }

    //Delete Account
    @DeleteMapping("/savingacc/delete")
    public Mono<Void> deleteAccount(SavingAccount account) {
        return service.delAccount(account);
    }

    //Get All Accounts
    @GetMapping("/savingacc/all")
    public Flux<SavingAccount> getAllAccounts() {
        return service.findAllAccounts();
    }
    
    
    
}