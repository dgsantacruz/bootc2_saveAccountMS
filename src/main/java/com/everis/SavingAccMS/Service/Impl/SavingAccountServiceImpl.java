package com.everis.SavingAccMS.Service.Impl;

import com.everis.SavingAccMS.Model.SavingAccount;
import com.everis.SavingAccMS.Repository.SavingAccountRepo;
import com.everis.SavingAccMS.Service.SavingAccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingAccountServiceImpl implements SavingAccountService 
{

    @Autowired
    private SavingAccountRepo repo;

    //Get All Accounts
    @Override
    public Flux<SavingAccount> findAllAccounts() 
    {
        return repo.findAll();
    }

    //Get all accounts DTO
    @Override
    public Flux<SavingAccount> findAllAccountsDTO() 
    {
        return null;
    }

    //Get account by Number
    @Override
    public Mono<SavingAccount> findByNumber(String number) 
    {
        return repo.findByNumber(number);
    }

    //Get account by Number DTO
    @Override
    public Mono<SavingAccount> findByNumberDTO(String number) 
    {
        return null;
    }

    //Get account by Owner Dni
    @Override
    public Mono<SavingAccount> findByOwnerDni(String dni) 
    {
        return repo.findByOwner_Dni(dni);
    }

    //Get account by Owner Dni DTO
    @Override
    public Mono<SavingAccount> findByOwnerDniDTO(String dni) 
    {
        return repo.findByOwner_Dni(dni);
    }

    //Create Account
    @Override
    public Mono<SavingAccount> addAccount(SavingAccount account) 
    {
        return repo.save(account);
    }

    //Update account data
    @Override
    public Mono<SavingAccount> updateAccount(SavingAccount account) 
    {
        return null;
    }

    //Delete Account
    @Override
    public Mono<Void> delAccount(SavingAccount account) 
    {
        return repo.delete(account);
    }
}
