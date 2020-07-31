class Account(ID: String, accno: Int, b: Double) {
  def ID: Any = ID
  def accountnumber = accno
  def balance = b
  
}

object Q4 extends App {

 def main(args:Array[String]) {
  
  val overdraft = (bank: List[Account]) => bank.filter(x => x.balance < 0)
  val Accbalance = (bank: List[Account]) =>bank.reduce((x, y) => new Account("V000000000", 1000, x.balance + y.balance))
  val interest = (bank: List[Account]) =>bank.map(y =>(if (y.balance > 0) y.balance * 1.0005d else y.balance * 1.001d))

 
    val a1 = new Account("962342503v", 51, 1000.00);
    val a2 = new Account("978655032v", 54, 10000.33);
    val a3 = new Account("992007802v", 57, -1200.00);
    val a4 = new Account("784546138v", 58, -1000.00);
    val a5 = new Account("796535802v", 59, 60000.00);
    val a6 = new Account("682356412v", 56, 6962.00);

    val bank: List[Account] = List(a1, a2, a3, a4, a5, a6)

    //  question 1

    println("Ques1:- List of accounts with negative balances :")
    var overdraftlist = overdraft(bank)
    overdraftlist.foreach(x => print(x.accountnumber + "   "));
     println(" ")

    //qustion 2
   
    var sum = Accbalance(bank)
    println(" ")
    println("Ques2:-  Total balance of the Accounts: " + sum.balance)

    //question 3
    println(" ")
    println("Ques3:- Account balance adding Interest :")
    var interestlist = interest(bank)
    interestlist.foreach(i => print(i + " "))

 }

  
}