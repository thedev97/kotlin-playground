fun main() {
    var p4 = Person4("Soumya", 26)
    //p4.age = -26
    println(p4.name)
    println(p4.age)
}

class Person4(nameParm:String, ageParm:Int) {
    var name:String = nameParm
    get(){
        return field.uppercase()
    }
    var age:Int = ageParm
    set(value){
        if(value > 0){
            field = value
        }else{
            println("Number isn't valid")
        }
    }
}