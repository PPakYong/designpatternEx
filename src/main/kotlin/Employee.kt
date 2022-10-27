import com.google.gson.Gson

open class currencyState {
    val wonPerDollor = 1418
    val yenPerDollor = 147
    val yenPerWon = 10
}

abstract class Nexon : currencyState() {
    val company: String = this.javaClass.name

    abstract var pay: Long
    var currencyType: String = "dollor"

    override fun toString(): String {
        return Gson().toJson(this)
    }

    fun exchange(returnCurrencyType: String): Long {
        when (returnCurrencyType) {
            "dollor" -> {
                when (currencyType) {
                    "won" -> return pay / wonPerDollor
                    "yen" -> return pay / yenPerDollor
                }
            }

            "won" -> {
                when (currencyType) {
                    "dollor" -> return pay * wonPerDollor
                    "yen" -> return pay / yenPerWon
                }
            }

            "yen" -> {
                when (currencyType) {
                    "dollor" -> return pay * yenPerDollor
                    "won" -> return pay * yenPerWon
                }
            }
        }
        return -1
    }
}

class NexonKorea : Nexon() {
    override var pay: Long = 50000000
        get() = field
        set(value) {
            field = value
        }
}

class NexonJapan : Nexon() {
    override var pay: Long = 7000000
        get() = field
        set(value) {
            field = value
        }
}

class NexonAmerica : Nexon() {
    override var pay: Long = 40000
        get() = field
        set(value) {
            field = value
        }
}