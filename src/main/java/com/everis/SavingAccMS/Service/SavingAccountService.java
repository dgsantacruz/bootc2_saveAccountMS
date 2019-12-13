package com.everis.SavingAccMS.Service;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountService
{
    //Create account
    public Mono<SavingAccount> addAccount(SavingAccount account);

    //Delete account
    public Mono<Void> delAccount(SavingAccount account);

    //Find All accounts
    public Flux<SavingAccount> findAllAccounts();
}