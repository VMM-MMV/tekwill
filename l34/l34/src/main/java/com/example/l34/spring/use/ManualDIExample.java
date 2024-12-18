package com.example.l34.spring.use;

class LoggerService {
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

class NotificationService {
    private final LoggerService loggerService;

    public NotificationService(LoggerService loggerService) {
        this.loggerService = loggerService;
    }

    public void sendNotification(String message) {
        loggerService.log("Sending notification: " + message);
        System.out.println("Notification sent: " + message);
    }
}

class AccountService {
    private final NotificationService notificationService;

    public AccountService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void debitAccount(String accountId, double amount) {
        System.out.println("Debiting account: " + accountId + " with amount: " + amount);
        notificationService.sendNotification("Account debited: " + accountId);
    }
}

class TransactionService {
    private final AccountService accountService;

    public TransactionService(AccountService accountService) {
        this.accountService = accountService;
    }

    public void processTransaction(String accountId, double amount) {
        accountService.debitAccount(accountId, amount);
        System.out.println("Transaction processed for account: " + accountId);
    }
}

class PaymentService {
    private final TransactionService transactionService;

    public PaymentService(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    public void makePayment(String accountId, double amount) {
        transactionService.processTransaction(accountId, amount);
        System.out.println("Payment made to account: " + accountId);
    }
}

public class ManualDIExample {
    public static void main(String[] args) {
        // Manually wiring dependencies
        LoggerService loggerService = new LoggerService();
        NotificationService notificationService = new NotificationService(loggerService);
        AccountService accountService = new AccountService(notificationService);
        TransactionService transactionService = new TransactionService(accountService);
        PaymentService paymentService = new PaymentService(transactionService);

        // Using the final service to make a payment
        paymentService.makePayment("12345", 200.0);
    }
}

//var svc = new ShippingService(new ProductLocator(),
//                                new PricingService(),
//                                new InventoryService(new Example1(new Example5(new Example8), new Example6(Example9(), new Example10())), new Example2(), Example3()),
//                                new TrackingRepository(new ConfigProvider()),
//                                new Logger(new EmailLogger(new ConfigProvider())));
