package com.everis.SavingAccMS.DTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class SavingAccountDTO
{
    private String number;

    private String currency;

    public SavingAccountDTO(String number, String currency)
    {
        this.number = number;
        this.currency = currency;
    }

    public SavingAccountDTO(){};
}