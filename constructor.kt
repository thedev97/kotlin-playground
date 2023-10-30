// Constructor means Intialize the objects
// Primary, Secondary, Default

fun main() {
    var audi = AutoMobile("Audi", "Petrol")
    audi.drive();

    /*var person1 = Person1()
    person1.name = "Soumya";
    println(person1.name)*/

    /*val ford = Car1("Mustang", true)
    ford.details()*/

    /*val perosn2 = Person2("Soumya", 18)
    perosn2.details()*/

    /*val person3 = Person3("Soumya", "Mishra")
    person3.name()*/

    /*val calculator = Claculator()
    println(calculator.add(5, 8))*/
}

// Default Constructor (Parameter less)
class Person1(){
    var name:String = ""
    var age:Int = 0
}

class Claculator{
    fun add(a:Int, b:Int) = a+b
}

// Primary Constructor
class Car1(val name:String, hasAirBags: Boolean){
    var airBags = hasAirBags
    fun details() = print("$name")
}

class Person2(nameParm:String, ageParm:Int){
    val name:String = nameParm
    val age:Int = ageParm
    fun details() = println("$name has $age years old")
}

// Secondary Constructor
class Person3 {
    val fullName:String

    constructor (firstName: String, lastName:String){
        fullName = "$firstName $lastName"
    }

    fun name() = println("$fullName")
}

// Primary - Secondary Constructor
class AutoMobile(val name:String, val engine:String, val maxSeat:Int, val type:Int) {
    init{
        println("$name is created")
    }

    init{
        println("2nd constructor is intialized")
    }

    constructor(name:String, engine:String): this(name, engine, 4,3)

    fun drive() = println("$name driving") 
}