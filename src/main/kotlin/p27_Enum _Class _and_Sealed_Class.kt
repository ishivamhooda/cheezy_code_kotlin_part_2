/*

enum claases
when we want ki a variable should have value from set of vlues
we use enum classes
example gender : can have value male ,female or other so gender class can be enum


in enum classes , values are instances ,so jo ek baar bann ga , vo banga

in case of enum  class we restrict the value
in case of sealed class we restrict the type


enum class=making games  of different color only
sealed = making games of different color pa b different symbols
 */

 fun main(){
val day=Day.Sunday
    println(day)
    println(day.number)

    for(i in Day.values()){
        println(i)
    }

     val day1=Day.Sunday
     day.printFormattedDay()






     //for sealed classes
     val tile=Red("Mushroom",25)
     val tile2=Red("Fire",30)
     println("${tile.points}- ${tile.type}")


     val tile1: Tile = Red("Mushroom",25)
     val points=when(tile1){
         is Red -> tile.points *2
         is Blue -> tile.points *5
     }
     println(points)
}


enum class Day (val number:Int){
    Sunday(1),
    Moday(2),
    Tueday(3),
    Wednsday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);

    fun printFormattedDay(){
        println("Day is $this")
    }

}

sealed class Tile
class Red (val type:String,val points:Int):Tile()
class Blue(val points:Int):Tile()