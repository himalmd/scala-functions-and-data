object rationals{
  val x = new Rational(1,3)

}

class Rational(x: Int, y:Int){
  require(y!=0, "Denominator must be non-zero")
  
  def this(x: Int) = this(x,1)
  def numer = x
  def denom = y
  
  def add(that: Rational) =
    new Rational(
    numer * that.denom + that.numer * denom, denom * that.denom
    )
  
  def neg: Rational = new Rational(-numer, denom) 
  
  def sub(that: Rational) = add(that.neg)
}