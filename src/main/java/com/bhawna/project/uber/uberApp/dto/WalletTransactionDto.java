package com.bhawna.project.uber.uberApp.dto;

import com.bhawna.project.uber.uberApp.entities.Ride;
import com.bhawna.project.uber.uberApp.entities.Wallet;
import com.bhawna.project.uber.uberApp.entities.enums.TransactionMethod;
import com.bhawna.project.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
public class WalletTransactionDto {

    private Long id;

    private Double amount;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    private RideDto ride;

    private String transactionId;

    private WalletDto wallet;

    private LocalDateTime timeStamp;
}
