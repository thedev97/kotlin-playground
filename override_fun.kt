fun main() {
    var samsung = Samsung("Smartphone")
    samsung.dispaly()

    println(samsung.toString())
}

open class Mobile(val type:String) {
   open val name:String = ""
   open fun dispaly() = println("Smartphone Display")
}

class Samsung(typeParm:String): Mobile(typeParm){
   override val name:String = "Samsung galaxy"
   override fun dispaly(){
    super.dispaly()
    println("Samsung Display")
   }

   override fun toString():String{
    return "Name - $name"
   }
}