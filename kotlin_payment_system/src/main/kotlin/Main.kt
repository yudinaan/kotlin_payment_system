fun main(args: Array<String>) {
    val paymentSystem = PaymentSystem()
    val account1 = Account("1234567890", 1000.0)
    val account2 = Account("0987654321", 100.0)
    paymentSystem.addAccount(account1)
    paymentSystem.addAccount(account2)

    val payment1 = Payment(account1, account2, 500.0)
    val payment2 = Payment(account2, account1, 100.0)
    payment1.process()
    payment2.process()
    paymentSystem.addPayment(payment1)
    paymentSystem.addPayment(payment2)

    account1.withdraw(100.0)
    account2.deposit(300.0)

    paymentSystem.getAccount("1234567890")
    paymentSystem.getAccounts()
    paymentSystem.getPayments()

}