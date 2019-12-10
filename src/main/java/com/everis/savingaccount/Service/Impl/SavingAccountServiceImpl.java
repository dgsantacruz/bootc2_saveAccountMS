package com.everis.savingaccount.Service.Impl;

import com.everis.savingaccount.Model.SavingAccount;
import com.everis.savingaccount.Repository.SavingAccountRepo;
import com.everis.savingaccount.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {

    @Autowired
    private SavingAccountRepo repo;

    @Override
    public Flux<SavingAccount> findAllAccounts() {
        return repo.findAll();
    }

    @Override
    public Mono<SavingAccount> findByNumber(String number) {
        return repo.findById(number);
    }

    @Override
    public Mono<SavingAccount> addAccount(SavingAccount account) {
        return repo.save(account);
    }

    @Override
    public Mono<Void> delAccount(SavingAccount account) {
        return repo.delete(account);
    }
    
}
