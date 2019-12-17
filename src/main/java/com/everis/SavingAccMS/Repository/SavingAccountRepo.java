package com.everis.SavingAccMS.Repository;

import com.everis.SavingAccMS.Model.SavingAccount;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountRepo extends ReactiveMongoRepository<SavingAccount, String>
{
    Mono<SavingAccount> findByNumber(String number);

    Flux<SavingAccount> findByOwner(String owner);
}