fun main(args: Array<String>) {
    //task 4
    //Print on the screen and prompts
    //the user to enter a number
    print("Enter a number: ")

    //read line from standard input - keyboard
    //and !! operator ensures the input is not null
    val stringInput = readLine()!!

    //converts the string input to integer
    var integer:Int = stringInput.toInt()99

    //println() prints the following lineto the output screen
    println("You entered: $integer")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}