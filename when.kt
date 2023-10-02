fun main() {
    // When statement -1
    /*val animal = "Dog";
    val result = when(animal){
        "Dog" -> "Dog"
        "Cat" -> "Cat"
        else -> "Unkonwn"
    }
    println(result);*/

    // When Statement -2
    val age = 26;
    val result = when(age){
        12 -> "Small Kids"
        18 -> "Mature Kids"
        in 19..30 -> "Experince"
        else -> "Expert"
    }
    println(result); // Experince
}