package com.everis.savingaccount.Repository;

import com.everis.savingaccount.Model.SavingAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SavingAccountRepo extends ReactiveMongoRepository<SavingAccount, String>
{
    
}