fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (row in 1 .. b) {
        for (column in 1 .. a) {
            print("*")
        }
        print("\n")
    }
}