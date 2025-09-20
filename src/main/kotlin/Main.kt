fun main(args: Array<String>) {
    print("Введите строку символов: ")
    var line = readln()
    println()

    var result = ""
    var count = 1

    if (line.isEmpty()) {
        print("Error")
        return
    }

    for (i in line.indices) {
        if (i < line.length - 1 && line[i] == line[i+1]) {
            count++
        }
        else {
            result += line[i]
            if (count > 1) {
                result += count
            }
            count = 1
        }
    }
        println("Result -> $result")
}