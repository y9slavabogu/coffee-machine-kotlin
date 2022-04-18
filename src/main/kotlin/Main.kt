class InTheCoffeeMachine {
    var waterInTheCoffeeMachine = 400
    var milkInTheCoffeeMachine = 540
    var beansInTheCoffeeMachine = 120
    var cupsInTheCoffeeMachine = 9
    var moneyInTheCoffeeMachine = 550
}

class ForDifferentSortsOfCoffee {
    class ForEspresso {
        val waterForEspresso = 250
        val milkForEspresso = 0
        val beansForEspresso = 16
        val cupForEspresso = 1
        val costOfEspresso = 4
    }

    class ForLatte {
        val waterForLatte = 350
        val milkForLatte = 75
        val beansForLatte = 20
        val cupForLatte = 1
        val costOfLatte = 7
    }

    class ForCappuccino {
        val waterForCappuccino = 200
        val milkForCappuccino = 100
        val beansForCappuccino = 12
        val cupForCappuccino = 1
        val costOfCappuccino = 6
    }
}

class Input {
    var actionsInput = ""
    var sortOfCoffeeInput = ""
}

class Add {
    var addWater = 0
    var addMilk = 0
    var addBeans = 0
    var addCups = 0
}

class Enough {
    var enoughOfEverything = false
    var enoughWater = false
    var enoughMilk = false
    var enoughBeans = false
    var enoughCups = false
}

fun checking(
    input: Input,
    inTheCoffeeMachine: InTheCoffeeMachine,
    forEspresso: ForDifferentSortsOfCoffee.ForEspresso,
    forLatte: ForDifferentSortsOfCoffee.ForLatte,
    forCappuccino: ForDifferentSortsOfCoffee.ForCappuccino,
    enough: Enough
) {
    if (input.sortOfCoffeeInput == "1") {
        if (
            inTheCoffeeMachine.waterInTheCoffeeMachine >= forEspresso.waterForEspresso &&
            inTheCoffeeMachine.milkInTheCoffeeMachine >= forEspresso.milkForEspresso &&
            inTheCoffeeMachine.beansInTheCoffeeMachine >= forEspresso.beansForEspresso &&
            inTheCoffeeMachine.cupsInTheCoffeeMachine >= forEspresso.cupForEspresso
        ) {
            enough.enoughWater = true
            enough.enoughMilk = true
            enough.enoughBeans = true
            enough.enoughCups = true
            enough.enoughOfEverything = true
            println("I have enough resources, making you a coffee!")
        } else {
            when {
                !enough.enoughWater -> println("Sorry, not enough water!")
                !enough.enoughMilk -> println("Sorry, not enough milk!")
                !enough.enoughBeans -> println("Sorry, not enough beans!")
                !enough.enoughCups -> println("Sorry, not enough cups!")
            }
        }
    }

    if (input.sortOfCoffeeInput == "2") {
        if (
            inTheCoffeeMachine.waterInTheCoffeeMachine >= forLatte.waterForLatte &&
            inTheCoffeeMachine.milkInTheCoffeeMachine >= forLatte.milkForLatte &&
            inTheCoffeeMachine.beansInTheCoffeeMachine >= forLatte.beansForLatte &&
            inTheCoffeeMachine.cupsInTheCoffeeMachine >= forLatte.cupForLatte
        ) {
            enough.enoughWater = true
            enough.enoughMilk = true
            enough.enoughBeans = true
            enough.enoughCups = true
            enough.enoughOfEverything = true
            println("I have enough resources, making you a coffee!")
        } else {
            when {
                !enough.enoughWater -> println("Sorry, not enough water!")
                !enough.enoughMilk -> println("Sorry, not enough milk!")
                !enough.enoughBeans -> println("Sorry, not enough beans!")
                !enough.enoughCups -> println("Sorry, not enough cups!")
            }
        }
    }

    if (input.sortOfCoffeeInput == "3") {

        if (
            inTheCoffeeMachine.waterInTheCoffeeMachine >= forCappuccino.waterForCappuccino &&
            inTheCoffeeMachine.milkInTheCoffeeMachine >= forCappuccino.milkForCappuccino &&
            inTheCoffeeMachine.beansInTheCoffeeMachine >= forCappuccino.beansForCappuccino &&
            inTheCoffeeMachine.cupsInTheCoffeeMachine >= forCappuccino.cupForCappuccino
        ) {
            enough.enoughWater = true
            enough.enoughMilk = true
            enough.enoughBeans = true
            enough.enoughCups = true
            enough.enoughOfEverything = true
            println("I have enough resources, making you a coffee!")
        } else {
            when {
                !enough.enoughWater -> println("Sorry, not enough water!")
                !enough.enoughMilk -> println("Sorry, not enough milk!")
                !enough.enoughBeans -> println("Sorry, not enough beans!")
                !enough.enoughCups -> println("Sorry, not enough cups!")
            }
        }
    }
}

fun remaining(inTheCoffeeMachine: InTheCoffeeMachine) {
    println("The coffee machine has:")
    println("${inTheCoffeeMachine.waterInTheCoffeeMachine} ml of water")
    println("${inTheCoffeeMachine.milkInTheCoffeeMachine} ml of milk")
    println("${inTheCoffeeMachine.beansInTheCoffeeMachine} g of coffee beans")
    println("${inTheCoffeeMachine.cupsInTheCoffeeMachine} disposable cups")
    println("$${inTheCoffeeMachine.moneyInTheCoffeeMachine} of money")
}

fun actions(
    input: Input,
    inTheCoffeeMachine: InTheCoffeeMachine,
    forEspresso: ForDifferentSortsOfCoffee.ForEspresso,
    forLatte: ForDifferentSortsOfCoffee.ForLatte,
    forCappuccino: ForDifferentSortsOfCoffee.ForCappuccino,
    add: Add,
    enough: Enough
) {
    while (true) {
        println("Write action (buy, fill, take, remaining, exit):")
        input.actionsInput = readln()

        if (input.actionsInput == "buy") {
            buy(
                input, inTheCoffeeMachine, forEspresso, forLatte, forCappuccino, enough
            )
            continue
        }

        if (input.actionsInput == "fill") {
            fill(add, inTheCoffeeMachine)
            continue
        }

        if (input.actionsInput == "take") {
            take(inTheCoffeeMachine)
            continue
        }

        if (input.actionsInput == "remaining") {
            remaining(inTheCoffeeMachine)
            continue
        }

        if (input.actionsInput == "exit") {
            break
        } else {
            println("Try again!")
            continue
        }
    }
}

fun buy(
    input: Input,
    inTheCoffeeMachine: InTheCoffeeMachine,
    forEspresso: ForDifferentSortsOfCoffee.ForEspresso,
    forLatte: ForDifferentSortsOfCoffee.ForLatte,
    forCappuccino: ForDifferentSortsOfCoffee.ForCappuccino,
    enough: Enough
) {
    while (true) {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
        input.sortOfCoffeeInput = readln()

        checking(
            input, inTheCoffeeMachine, forEspresso, forLatte, forCappuccino, enough
        )

        if (!enough.enoughOfEverything) {
            break
        }

        if (enough.enoughOfEverything) {
            if (input.sortOfCoffeeInput == "1") {
                inTheCoffeeMachine.waterInTheCoffeeMachine - forEspresso.waterForEspresso
                inTheCoffeeMachine.milkInTheCoffeeMachine - forEspresso.milkForEspresso
                inTheCoffeeMachine.beansInTheCoffeeMachine - forEspresso.beansForEspresso
                inTheCoffeeMachine.cupsInTheCoffeeMachine - forEspresso.cupForEspresso
                inTheCoffeeMachine.moneyInTheCoffeeMachine + forEspresso.costOfEspresso

                enough.enoughWater = false
                enough.enoughMilk = false
                enough.enoughBeans = false
                enough.enoughCups = false
                enough.enoughOfEverything = false
                break
            }

            if (input.sortOfCoffeeInput == "2") {
                inTheCoffeeMachine.waterInTheCoffeeMachine - forLatte.waterForLatte
                inTheCoffeeMachine.milkInTheCoffeeMachine - forLatte.milkForLatte
                inTheCoffeeMachine.beansInTheCoffeeMachine - forLatte.beansForLatte
                inTheCoffeeMachine.cupsInTheCoffeeMachine - forLatte.cupForLatte
                inTheCoffeeMachine.moneyInTheCoffeeMachine + forLatte.costOfLatte

                enough.enoughWater = false
                enough.enoughMilk = false
                enough.enoughBeans = false
                enough.enoughCups = false
                enough.enoughOfEverything = false
                break
            }

            if (input.sortOfCoffeeInput == "3") {
                inTheCoffeeMachine.waterInTheCoffeeMachine - forCappuccino.waterForCappuccino
                inTheCoffeeMachine.milkInTheCoffeeMachine - forCappuccino.milkForCappuccino
                inTheCoffeeMachine.beansInTheCoffeeMachine - forCappuccino.beansForCappuccino
                inTheCoffeeMachine.cupsInTheCoffeeMachine - forCappuccino.cupForCappuccino
                inTheCoffeeMachine.moneyInTheCoffeeMachine + forCappuccino.costOfCappuccino

                enough.enoughWater = false
                enough.enoughMilk = false
                enough.enoughBeans = false
                enough.enoughCups = false
                enough.enoughOfEverything = false
                break
            }
        }

        if (input.sortOfCoffeeInput == "back") {
            break
        } else {
            println("Try again!")
            continue
        }
    }
}

fun fill(add: Add, inTheCoffeeMachine: InTheCoffeeMachine) {
    println("Write how many ml of water do you want to add:")
    add.addWater = readln().toInt()
    inTheCoffeeMachine.waterInTheCoffeeMachine + add.addWater

    println("Write how many ml of milk do you want to add:")
    add.addMilk = readln().toInt()
    inTheCoffeeMachine.milkInTheCoffeeMachine + add.addMilk

    println("Write how many grams of coffee beans do you want to add:")
    add.addBeans = readln().toInt()
    inTheCoffeeMachine.beansInTheCoffeeMachine + add.addBeans

    println("Write how many disposable cups do you want to add:")
    add.addCups = readln().toInt()
    inTheCoffeeMachine.cupsInTheCoffeeMachine + add.addCups
}

fun take(inTheCoffeeMachine: InTheCoffeeMachine) {
    println("I gave you $${inTheCoffeeMachine.moneyInTheCoffeeMachine}")
    inTheCoffeeMachine.moneyInTheCoffeeMachine = 0
}

fun main() {
    actions(
        Input(),
        InTheCoffeeMachine(),
        ForDifferentSortsOfCoffee.ForEspresso(),
        ForDifferentSortsOfCoffee.ForLatte(),
        ForDifferentSortsOfCoffee.ForCappuccino(),
        Add(),
        Enough()
    )
}