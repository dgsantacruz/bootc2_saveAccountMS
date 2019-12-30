package com.everis.SavingAccMS.DTO.Movement;

import lombok.Data;

@Data
public class MoneyOperationDTO
{
    private String moneyOrigin;

    private String moneyDestination;

    private String operation;

    private String currency;

    private double amount;
}