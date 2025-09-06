fun main(args: Array<String>) {
    print("Введите строку символов: ")
    var line = readln()
    println()

    if (line.isEmpty()) {
        println("Строка пуста")
        return
    }

    var result = ""
    var count = 1

    for (i in 1 until line.length)
        if (line[i] == line[i - 1]) {
            count++
        }
        result += line.last() + (if (count > 1) count.toString() else "")
        println("Result -> $result")



}