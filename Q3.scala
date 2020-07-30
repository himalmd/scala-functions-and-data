class Account (ID:String,accno:Int,bl:Double) {
  def ID : Any = ID
  def accnum = accno
  def balance = bl
  
  def transfer(m:Double)=
  { this.balance + m }
  
 
  override def toString ="["+ID+":"+accnum +":"+ balance+"]" 
 }

object Q3 extends App {
  val a = new Account ("112233",231,10000.00)
  val b = new Account ("223344",322,8000.33)
 
  val m:Double=2000.00
  val n:Double=1000.00
  
  println("Account: "+a)
  println("Transferred value :"+m)
  println("Final Balance: "+a.transfer(m))
  
  println(" ")
  println("Account: "+b)
  println("Transferred value :"+n)
  println("Final Balance: "+b.transfer(n))
 

}

