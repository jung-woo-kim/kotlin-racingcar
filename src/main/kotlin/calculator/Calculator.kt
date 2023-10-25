package calculator

class Calculator {
    fun calculate(formula: String): Int {
        val elements = formula.split(" ")

        var result = elements[0].toInt()

        for (i in 1 until elements.size step 2) {
            val operator = elements[i]
            val operand = elements[i + 1].toInt()

            result = Operator.from(operator).calculate(result, operand)
        }

        return result
    }
}
