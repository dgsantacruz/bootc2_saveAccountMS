package com.everis.SavingAccMS.Service;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountService
{
    //Find All accounts
    public Flux<SavingAccount> findAllAccounts();

    //Find account by number
    public Mono<SavingAccount> findByNumber(String number);

    //Create account
    public Mono<SavingAccount> addAccount(SavingAccount account);
    
    //Delete all accounts
    public Mono<Void> delAccount(SavingAccount account);
}