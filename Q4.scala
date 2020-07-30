class Account(ID: String, accno: Int, b: Double) {
  def ID: Any = ID
  def accNum = accno
  def balance = b

  def withdraw(l: Double) = {
    this.balance - l
  }
  def deposit(n: Double) = {
    this.balance + n
  }

  def transfer(a: Account, m: Double) = {
    this.withdraw(m)
    a.deposit(m)
    println("A balance :" + this.withdraw(m))
    println("B balance :" + a.withdraw(m))
  }

  override def toString = "[" + ID + ":" + accNum + ":" + balance + "]"
}

object Q4 extends App {

  val a = new Account("12344", 101, 2000.00)
  val b = new Account("43222", 102, 10000.33)
  val c = new Account("23532", 103, -500.00)
  val d = new Account("85346", 104, -1000.00)
  val e = new Account("86356", 106, 30000.00)

  val bank: List[Account] = List(a, b, c, d, e)
  
  val overdraft = (bank: List[Account]) => bank.filter(x => x.balance < 0)
  println("List of accounts with negative balances :")
  println(" ")
  println(overdraft(bank))
  
  val balance =(b:List[Account])=>Double={b.reduce((x,y)=>(x.balance) + (y.balance))}
  println("Total balance of the Accounts: "+balance(bank)) 
  
  val f1 =(b:List[Account])=>for(i<-b){if(b(i).balance<0) b(i).balance *1.0005  else b(i).balance* 1.001}
  val interest=(b:List[Account])=>b.map(f1)
  println("After addition of interest :") 
  println(interest(bank))                               

}