package com.everis.savingaccount.Service.Impl;

import com.everis.savingaccount.Model.savingAccount;
import com.everis.savingaccount.Repository.savingAccountRepo;
import com.everis.savingaccount.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {

    @Autowired
    private savingAccountRepo repo;

    @Override
    public Flux<savingAccount> findAllAccounts() {
        return repo.findAll();
    }

    @Override
    public Mono<savingAccount> findByNumber(String number) {
        return repo.findById(number);
    }

    @Override
    public Mono<savingAccount> addAccount(savingAccount account) {
        return repo.save(account);
    }

    @Override
    public Mono<Void> delAccount(savingAccount account) {
        return repo.delete(account);
    }
    
}
