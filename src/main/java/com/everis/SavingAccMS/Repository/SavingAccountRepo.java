package com.everis.SavingAccMS.Repository;

import com.everis.SavingAccMS.Model.SavingAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SavingAccountRepo extends ReactiveMongoRepository<SavingAccount, String>
{
    
}