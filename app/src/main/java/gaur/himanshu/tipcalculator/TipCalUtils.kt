package gaur.himanshu.tipcalculator

import java.text.DecimalFormat


fun getTipAmount(userAmount: String, tipPercentage: Float): String {
    return when {
        userAmount.isEmpty() -> {
            "0"
        }
        else -> {
            val amount = userAmount.toFloat()
            (amount * tipPercentage.div(100)).toString()
        }
    }
}

fun getTotalHeaderAmount(amount: String, personCounter: Int, tipPercentage: Float): String {

    return when {
        amount.isEmpty() -> {
            "0"
        }
        else -> {
            val userAmount = amount.toFloat()
            val tipAmount = userAmount * tipPercentage.div(100)
            val perHeadAmount = (userAmount + tipAmount).div(personCounter)
            perHeadAmount.toString()
        }
    }

}


fun formatTwoDecimalPoints(str: String): String {

    return if (str.isEmpty()) {
        ""
    } else {
        val format = DecimalFormat("######################.##")
        format.format(str.toFloat())
    }

}