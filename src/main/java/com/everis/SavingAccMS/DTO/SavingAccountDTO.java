package com.everis.SavingAccMS.DTO;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class SavingAccountDTO
{
    private String number;

    private String currency;
}