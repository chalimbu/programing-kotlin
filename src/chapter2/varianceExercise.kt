package chapter2

data class Sloth(val name: String, val isTwoFingered: Boolean) {
    fun eat(){}
    fun sleep(){}
}

data class Panda(val name:String){
    fun eat(){}
    fun sleep(){}
}

fun feedCrew(crew: List<Sloth>){
    crew.forEach{
        it.eat()
        println(it.name + " ate some rad leaves!")
    }
}
//define a way so the method feedCrew works both for pandas and sloths
//and explain if this is using covariance or contravariance
fun main(){
    val sloth: Sloth
    val slothCrew=listOf(
        Sloth("Jerry", false),
        Sloth("Bae",true),
        Sloth("Alex",false)
    )
    feedCrew(slothCrew)

    val pandaCrew = listOf(
        Panda("Teggan"),
        Panda("Peggy")
    )
    feedCrew(pandaCrew)


}