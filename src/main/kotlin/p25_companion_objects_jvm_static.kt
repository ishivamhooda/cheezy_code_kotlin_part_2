/*
companion : someone jiska sath you spend time and Share things

we can have only 1 companion in one class ,as we have only 1 in life

companion is like static

companion is used for factory pattern
 factory patter is something jisma you pass paramter and it return objects
 matlab vo objects ki factory ha t
 */

fun main(){
    MyCLASS.MyObject.f()
    MyCLASS.AnotherObject.g()

    //now i want MyCLASS.f()  direct
    //so i need to declare object  as companion
    MyCLASS.f()

}


class MyCLASS{
    companion object  MyObject{
        fun f(){
            println("hello i am f from objects")
        }

    }

    object  AnotherObject{
        fun g(){
            println("hello i am f from objects")
        }

    }
}