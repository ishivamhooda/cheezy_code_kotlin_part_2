/*
visibility modifiers :kisi chiz ki visibility hum kaam ya jada kar rha ha ,kis file ma vo viisbile hogi kisma nhi
public,internal , protected , private

1.public
this are called top level declaration

by default all fun ,varibale ,class are public
ie they can be accessed from any file ,module


2.internal
the class ,file,varibale will be accessible only to same module file

so internal beahves like public but only for same module


3.private :

the class ,file,varibale will be accessible only to same class ,File


4.protected
is not used for top level declaration so ignore it

protected can be used only for class memebers ,it will be available only in sub classes ,not anyhwere
 */
 fun main(){
     Player.JustForVisibilityModifier()
    //we called this fun which was public and is in p21
    var objB=B()
    objB.test()
 }
open class A{
    public var p=10
    private var q=20
    internal var r=30
    protected var s=40
}
class B:A(){
    fun test(){
        println(p)
      //  println(q) //this will show eroor boz q is private in class A ,so it cant be used in any other class
        println(r)
        println(s)  //no error in protected

    }
}
