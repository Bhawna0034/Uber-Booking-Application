package com.bhawna.project.uber.uberApp.services;

import com.bhawna.project.uber.uberApp.entities.Ride;
import com.bhawna.project.uber.uberApp.entities.User;
import com.bhawna.project.uber.uberApp.entities.Wallet;
import com.bhawna.project.uber.uberApp.entities.enums.TransactionMethod;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount,
                            String transactionId, Ride ride,
                            TransactionMethod transactionMethod);

    Wallet deductMoneyFromWallet(User user, Double amount,
                                 String transactionId, Ride ride,
                                 TransactionMethod transactionMethod);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walletId);

    Wallet createNewWallet(User user);

    Wallet findByUser(User user);
}
