package com.everis.SavingAccMS.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Owners")
public class Owner
{
    private String dni;

    private String name;
}