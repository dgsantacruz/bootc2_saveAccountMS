package com.everis.SavingAccMS.Service;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountService
{
    //Get All accounts
    public Flux<SavingAccount> findAllAccounts();

    //Get account by number
    public Mono<SavingAccount> findByNumber(String number);

    // //Get account by owner
    // public Flux<SavingAccount> findByOwner(String owner);

    //Create account data
    public Mono<SavingAccount> addAccount(SavingAccount account);

    //Update account data
    public Mono<SavingAccount> updateAccount(SavingAccount account);

    //Delete account data
    public Mono<Void> delAccount(SavingAccount account);


}