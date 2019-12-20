package com.everis.SavingAccMS.Service;

import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountService
{
    //Get All accounts
    public Flux<SavingAccount> findAllAccounts();

    //Get all accounts DTO
    public Flux<SavingAccount> findAllAccountsDTO();

    //Get account by number
    public Mono<SavingAccount> findByNumber(String number);

    //Get account by number DTO
    public Mono<SavingAccount> findByNumberDTO(String number);

    //Get account by Owner Dni
    public Mono<SavingAccount> findByOwnerDni(String dni);

    //Get account by Owner Dni DTO
    public Mono<SavingAccount> findByOwnerDniDTO(String dni);

    //Create account data
    public Mono<SavingAccount> addAccount(SavingAccount account);

    //Update account data
    public Mono<SavingAccount> updateAccount(SavingAccount account);

    //Delete account data
    public Mono<Void> delAccount(SavingAccount account);


}