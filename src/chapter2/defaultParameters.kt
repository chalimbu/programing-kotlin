package chapter2

class defaultParameters {
}

fun main(){
    fun greeting(name: String) = "hello $name"

    println(greeting("sebas"))
    //change so allow this, with default parameter
    //println(greeting("sebas","greetin"))
}