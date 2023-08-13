class PaymentSystem {
    private val accounts: MutableList<Account> = mutableListOf()
    private val payments: MutableList<Payment> = mutableListOf()
    fun addAccount ( account: Account ){
        accounts.add(account)
    }
    fun getAccount ( accountNumber: String ) {
        val accout = accounts.find { it.accountNumber == accountNumber }
        if (accout != null) {
            println("Номер аккаунта: ${accout.accountNumber}\n Баланс: ${accout.balance}")
        } else println("Аккаунт не найден")
    }
    fun getAccounts () {
        println("Иформация об аккаунтах:")
        accounts.forEach { account ->
            println("Номер аккаунта: ${account.accountNumber}\n Баланс: ${account.balance}")
        }
    }
    fun addPayment(payment: Payment) {
        payments.add(payment)
    }

    fun getPayments() {
        println("Иформация о платежах:")
        payments.forEach { payment ->
            println("Аккаунт отправителя: ${payment.fromAccount.accountNumber}\n Аккаунт получателя: ${payment.toAccount.accountNumber}\n Сумма: ${payment.amount}")
        }
    }

}