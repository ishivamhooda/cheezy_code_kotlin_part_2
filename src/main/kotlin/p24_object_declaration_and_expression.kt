/*
object declaration

earlier we first make class ,then declare objects but in kotlin we can direct delcaere objects

class and its single object is created at once
no constrcutors are allowerd (in it block is allowed)

singleton pattern

you can inherit class/interface


singleton pattern means we can create only single object of a class
eg liking on different social media website


object expression

using objects as an expression
anonymous objects using object keyword
replacement of java's anonymous inner class
 */

fun main(){

    println(A1.num)
    println(B1.test())

    println()

    SharingWidget.incremenentTwitterLike()
    SharingWidget.incremenentTwitterLike()
    SharingWidget.incremenentTwitterLike()
    SharingWidget.incrementFBLikes()
    SharingWidget.display()


    //object expression

    var testObj=object {
        val x:Int=10
        fun method(){
            println("i am object expression")
        }
    }

    println(testObj.method())


var obj=object :Cloneable{
    override fun clone() {
        println("i am clone")
    }


}

    var obj2=object :Person("CHEZZY CODE"){
        override fun fullName() {
            super.fullName()
            println("anonymous - $name")
        }
    }
    obj2.fullName()
}



object A1{
    val num:Int=10
}

object B1{
    val p:Int=20
    fun test(){
        println("I am object b ")
    }
}

object SharingWidget{
    private var twitterLikes=0           //must be private else koi aur chnage kar da ga
    private var fblikes=0

    fun incremenentTwitterLike() = twitterLikes++
    fun incrementFBLikes()= fblikes++
    fun display()=println("facebook - $fblikes--Twitter- $twitterLikes")


}

interface Cloneable{
    fun clone()
}

open class Person(val name:String){
    open fun fullName()=println("Full name - $name")
}