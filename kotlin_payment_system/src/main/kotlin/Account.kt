class Account ( val accountNumber: String, var balance: Double = 0.0 ) {
    fun deposit ( amount: Double ){
        if (amount <= 0){
            println("Невыполнимая операция")
        }
        balance = if(amount > 0.0) {
            balance += amount
            balance
            }
            else balance
        }
    fun withdraw ( amount: Double ){
        if (amount <= 0){
            println("Невыполнимая операция")
        }
        balance = when {
            amount > 0 -> (balance - amount).also { balance = it
            }
            else -> balance
        }
    }

}