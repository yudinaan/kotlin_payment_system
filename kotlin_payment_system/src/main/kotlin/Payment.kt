class Payment (val fromAccount: Account, val toAccount: Account, val amount: Double ) {
    fun process() {
        if (fromAccount.balance >= amount) {
            toAccount.deposit(amount)
            fromAccount.withdraw(amount)
        } else {
            println("Недостаточно средств")
        }
    }
}