package com.everis.SavingAccMS.Model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Owners")
public class Owner
{
    @NotBlank
    private String dni;

    @NotBlank
    private String name;
}