package com.everis.SavingAccMS.Service.Impl;

import com.everis.SavingAccMS.Model.SavingAccount;
import com.everis.SavingAccMS.Repository.SavingAccountRepo;
import com.everis.SavingAccMS.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {

    @Autowired
    private SavingAccountRepo repo;

    //Create Account
    @Override
    public Mono<SavingAccount> addAccount(SavingAccount account) 
    {
        return repo.save(account);
    }

    //Delete Account
    @Override
    public Mono<Void> delAccount(SavingAccount account) 
    {
        return repo.delete(account);
    }

    //Get All Accounts
    @Override
    public Flux<SavingAccount> findAllAccounts() {
        return repo.findAll();
    }





    
}
