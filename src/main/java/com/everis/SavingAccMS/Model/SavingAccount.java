package com.everis.SavingAccMS.Model;

import javax.validation.constraints.NotBlank;

import com.everis.SavingAccMS.Model.Owner;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "SavingAccs")
public class SavingAccount
{
    @Id
    private String id;

    @NotBlank
    private String number;

    private Owner owner;

    @NotBlank
    private String currency;

    @NotBlank
    private double balance = 0.00;

    @NotBlank
    private String status;
}