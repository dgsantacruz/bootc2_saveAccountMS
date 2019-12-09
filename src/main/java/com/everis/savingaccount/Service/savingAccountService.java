package com.everis.savingaccount.Service;

import com.everis.savingaccount.Model.savingAccount;
import com.everis.savingaccount.Repository.savingAccountRepo;

import org.springframework.beans.factory.annotation.Autowired;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class savingAccountService implements savingAccountInterface {

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
