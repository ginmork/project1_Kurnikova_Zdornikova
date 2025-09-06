fun main(args: Array<String>) {
    print("Введите строку символов: ")
    var line = readln()
    println()

    var result = ""
    var count = 1

    for (i in line.indices) {
        if (i < line.length - 1 && line[i] == line[i+1]) { // Проверяем есть ли след. символ и что он такой же как текущий
            count++
        }
        else {
            result += line[i] // Иначе добавляем символ в рез-т
            if (count > 1) {
                result += count // Если символ дублировался, то добавляем кол-во повторов
            }
            count = 1 // Сброс для след. проверки
        }
    }
        println("Result -> $result")
}