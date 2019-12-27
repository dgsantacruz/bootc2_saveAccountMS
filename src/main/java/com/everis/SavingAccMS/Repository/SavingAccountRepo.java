package com.everis.SavingAccMS.Repository;

import com.everis.SavingAccMS.Model.Owner;
import com.everis.SavingAccMS.Model.SavingAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Mono;

public interface SavingAccountRepo extends ReactiveMongoRepository<SavingAccount, String>
{
    
    Mono<SavingAccount> findByNumber(String number);

    Mono<SavingAccount> findByOwner_Dni(String dni);
}