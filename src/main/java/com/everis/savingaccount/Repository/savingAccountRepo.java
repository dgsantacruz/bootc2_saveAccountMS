package com.everis.savingaccount.Repository;

import com.everis.savingaccount.Model.savingAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface savingAccountRepo extends ReactiveMongoRepository<savingAccount, String>
{
    
}