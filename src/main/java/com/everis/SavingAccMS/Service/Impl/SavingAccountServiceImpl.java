package com.everis.SavingAccMS.Service.Impl;

import com.everis.SavingAccMS.DTO.SavingAccountDTO;
import com.everis.SavingAccMS.Model.SavingAccount;
import com.everis.SavingAccMS.Repository.SavingAccountRepo;
import com.everis.SavingAccMS.Service.SavingAccountService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SavingAccountServiceImpl implements SavingAccountService 
{

    Logger logger = LoggerFactory.getLogger(SavingAccountServiceImpl.class);

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
    public Flux<SavingAccountDTO> findAllAccountsDTO() 
    {
        return repo.findAll().map(account -> new SavingAccountDTO(account.getNumber(), account.getCurrency()));
    }

    //Get account by Number
    @Override
    public Mono<SavingAccount> findByNumber(String number) 
    {
        return repo.findByNumber(number);
    }

    //Get account by Number DTO
    @Override
    public Mono<SavingAccountDTO> findByNumberDTO(String number) 
    {
        return repo.findByNumber(number).map(account -> new SavingAccountDTO(account.getNumber(), account.getCurrency()));
    }

    //Get account by Owner Dni
    @Override
    public Mono<SavingAccount> findByOwnerDni(String dni) 
    {
        return repo.findByOwner_Dni(dni);
    }

    //Get account by Owner Dni DTO
    @Override
    public Mono<SavingAccountDTO> findByOwnerDniDTO(String dni) 
    {
        return repo.findByOwner_Dni(dni).map(account -> new SavingAccountDTO(account.getNumber(), account.getCurrency()));
    }

    //Create Account
    @Override
    public Mono<SavingAccount> addAccount(SavingAccount account) 
    {
        //Added validation to avoid creating an account when a user already have it. Still dont know how to throw an error.
        return repo.findByOwner_Dni(account.getOwner().getDni())
                    .switchIfEmpty(repo.save(account));
                    
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
