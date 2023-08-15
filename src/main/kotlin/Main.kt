import java.time.temporal.TemporalAmount

fun main(args: Array<String>) {
    println("Задание 1")
    val amount =1000
    println(task1(amount))

    println("Задание 2")
    val likes = 61
    println(task2(likes))
}
fun task1(sum: Int): Double {
    val sum = 10000*100 //1000 в копейках
    var tax = 0.0
    val taxPercent = 0.75
    if ((((sum/100)*taxPercent)/100)<35){
        tax = 35.0
    }else tax = ((sum/100)*taxPercent)/100
    return(tax)
}
fun task2(like: Int): String {
    var ans = ""
    if (like % 10 == 1 && like % 10!= 11){
        ans="человеку"
    }else {
        ans = "людям"
    }
    return ("Понравилось $like $ans")
}

