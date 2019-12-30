package com.everis.SavingAccMS.Service;

import com.everis.SavingAccMS.DTO.SavingAccountDTO;
import com.everis.SavingAccMS.DTO.Movement.MoneyOperationDTO;
import com.everis.SavingAccMS.Model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountService
{
    //Get All accounts
    public Flux<SavingAccount> findAllAccounts();

    //Get all accounts DTO
    public Flux<SavingAccountDTO> findAllAccountsDTO();

    //Get account by number
    public Mono<SavingAccount> findByNumber(String number);

    //Get account by number DTO
    public Mono<SavingAccountDTO> findByNumberDTO(String number);

    //Get account by Owner Dni
    public Mono<SavingAccount> findByOwnerDni(String dni);

    //Get account by Owner Dni DTO
    public Mono<SavingAccountDTO> findByOwnerDniDTO(String dni);

    //Create account data
    public Mono<SavingAccount> addAccount(SavingAccount account);

    //Update account data
    public Mono<SavingAccount> updateAccount(String number, SavingAccount account);

    //Delete account data
    public Mono<Void> delAccount(SavingAccount account);

    //Deposit
    public Mono<MoneyOperationDTO> deposit(MoneyOperationDTO deposit);


}