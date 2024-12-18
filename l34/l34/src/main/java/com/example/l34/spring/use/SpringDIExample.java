package com.example.l34.spring.use;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class LoggerServiceSpring {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

@Component
class NotificationServiceSpring {
    private final LoggerServiceSpring loggerServiceSpring;

    @Autowired
    public NotificationServiceSpring(LoggerServiceSpring loggerServiceSpring) {
        this.loggerServiceSpring = loggerServiceSpring;
    }

    public void sendNotification(String message) {
        loggerServiceSpring.log("Sending notification: " + message);
        System.out.println("Notification sent: " + message);
    }
}

@Component
class AccountServiceSpring {
    private final NotificationServiceSpring notificationServiceSpring;

    @Autowired
    public AccountServiceSpring(NotificationServiceSpring notificationServiceSpring) {
        this.notificationServiceSpring = notificationServiceSpring;
    }

    public void debitAccount(String accountId, double amount) {
        System.out.println("Debiting account: " + accountId + " with amount: " + amount);
        notificationServiceSpring.sendNotification("Account debited: " + accountId);
    }
}

@Component
class TransactionServiceSpring {
    private final AccountServiceSpring accountServiceSpring;

    @Autowired
    public TransactionServiceSpring(AccountServiceSpring accountServiceSpring) {
        this.accountServiceSpring = accountServiceSpring;
    }

    public void processTransaction(String accountId, double amount) {
        accountServiceSpring.debitAccount(accountId, amount);
        System.out.println("Transaction processed for account: " + accountId);
    }
}

@Component
class SpringDIEExample {
    @Autowired
    private TransactionServiceSpring transactionServiceSpring;

    public void makePayment(String accountId, double amount) {
        transactionServiceSpring.processTransaction(accountId, amount);
        System.out.println("Payment made to account: " + accountId);
    }
}
