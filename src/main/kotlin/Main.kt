import kotlin.math.ln

fun main(args: Array<String>) {
    while (true) {
        println("Введите номер задачи (1-6, 0 - выход): ")
        var choice = readln()
        when (choice) {
            "1" -> {
                task1()
            }

            "2" -> {
                task2()
            }

            "3" -> {
                task3()
            }

            "4" -> {
                task4()
            }

            "5" -> {
                task5()
            }

            "6" -> {
                task6()
            }

            "0" -> return
            else -> println("Введено неправильное значение")
        }
    }
}

private fun task6() {
    println("Введите первое число:")
    var num1: String = readln()
    println("Введите второе число:")
    var num2: String = readln()
    var result: String = ""

    if (num1.toInt() % 2 == 0 && num2.toInt() % 2 == 0)
        println("Нечетного числа не существует")
    else if (num1.toInt() % 2 != 0)
        result = num2 + num1
    else if (num2.toInt() % 2 != 0)
        result = num1 + num2
    println("Нечетное число из введенных цифр = " + result)
}

private fun task5() {
    println("Введите целое число N и основание степени X: ")

    var n = readln().toDouble()
    var x = readln().toDouble()
    var y = ln(n) / ln(x)
    var result = Math.pow(x, y)

    if (y % 1 == 0.0) {
        println("Целочисленный показатель = ${y.toInt()}")
    } else {
        println("Целочисленный показатель не существует")
        return
    }

    if (result.toString().endsWith(".0")) {
        println("Ответ: ${result.toInt()}")
    } else {
        println("Ответ: $result")
    }
}

private fun task4() {
    println("Введите 1 число, 2 число и оператор (+, -, *, / ): ")
    var num1 = readln().toDouble()
    var num2 = readln().toDouble()
    var oper = readln()

    if (num1 == null || num2 == null) {
        println("Введено некоррктное значение")
        return
    }

    if (oper != "+" && oper != "-" && oper != "*" && oper != "/") {
        println("Введено некоррктное значение")
        return
    }

    val result = when (oper) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) {
            num1 / num2
        } else {
            println("Делить на ноль нельзя")
            return
        }

        else -> 0.0
    }

    if (result.toString().endsWith(".0")) {
        println("Ответ: ${result.toInt()}")
    } else {
        println("Ответ: $result")
    }
}

private fun task3() {
    println("Введите натуральное число ")
    var input = readln()
    var number = input.toInt()

    if (number < 0) {
        println("Ошибка. Введено не натуральное число")
    }

    var binaryNumber = ""

    while (number > 0) {
        binaryNumber = (number % 2).toString() + binaryNumber
        number /= 2
    }

    println("Двоичное представление введенного числа: $binaryNumber")
}

private fun task2() {
    println("Enter line -> ")
    var line = readln()
    println()

    if (line.isEmpty()) {
        print("Error")
    }

    var count = IntArray(256)

    for (i in line) {
        count[i.toInt()]++
    }
    for (i in count.indices) {
        if (count[i] > 0) {
            println("${i.toChar()} - ${count[i]}")
        }
    }
}

private fun task1() {
    println("Введите строку символов: ")
    var line = readln()
    println()

    var result = ""
    var count = 1

    if (line.isEmpty()) {
        print("Error")
    }

    for (i in line.indices) {
        if (i < line.length - 1 && line[i] == line[i + 1]) {
            count++
        } else {
            result += line[i]
            if (count > 1) {
                result += count
            }
            count = 1
        }
    }
    println("Result -> $result")
}