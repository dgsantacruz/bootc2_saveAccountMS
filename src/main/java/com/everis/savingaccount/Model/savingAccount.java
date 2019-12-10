package com.everis.savingaccount.Model;

import java.util.List;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "savingaccdb")
public class SavingAccount
{
    @Id
    private String id;

    @NotBlank
    private String number;

    @NotBlank
    private List<String> owners;

    @NotBlank
    private String currency;

    @NotBlank
    private int balance;
}