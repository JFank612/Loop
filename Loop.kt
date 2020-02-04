fun main(arg: Array<String>) {

    var options = 0

    do {
        println("1. Hamburger")
        println("2. Cheeseburger")
        println("3. Bacon Cheeseburger")
        println("4. Hot Dog")
        println("5. Chili Cheese Dog")
        println("6. Exit")

        print("Make your selection: ")
        options = readLine()!!.toInt()
        println("You have selected $options")
    }while (options != 6)

}