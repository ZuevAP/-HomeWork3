package ru.netology

const val VK_PAY = "Vk Pay"
const val MASTERCARD = "Mastercard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "Мир"

fun moneyTransferCommission(moneyTransfer: Int, typeCard: String = VK_PAY, transferAmounts: Int = 0): Number {

    return when (typeCard) {

        VK_PAY -> 0

        MASTERCARD, MAESTRO -> if (moneyTransfer < 75000_00 && transferAmounts < 75000_00) {0}
        else {moneyTransfer * 0.006 + 2000}

        VISA, MIR -> if ((moneyTransfer * 0.076) > 3500) {moneyTransfer * 0.0075}
        else {3500}

        else -> error("Ошибка распознования карты")
    }
}

fun main() {

    println("Комиссия за перевод составит: " + moneyTransferCommission(100_000_00) + " копеек.")
}




