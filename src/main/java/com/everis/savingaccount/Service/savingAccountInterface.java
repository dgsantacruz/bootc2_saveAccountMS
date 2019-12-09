package com.everis.savingaccount.Service;

import com.everis.savingaccount.Model.savingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface savingAccountInterface
{
    //Find All accounts
    public Flux<savingAccount> findAllAccounts();

    //Find account by number
    public Mono<savingAccount> findByNumber(String number);

    //Create account
    public Mono<savingAccount> addAccount(savingAccount account);
    
    //Delete all accounts
    public Mono<Void> delAccount(savingAccount account);
}