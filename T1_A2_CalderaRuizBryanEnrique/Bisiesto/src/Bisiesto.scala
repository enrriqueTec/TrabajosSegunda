import scala.io.StdIn._

object Bisiesto {
  
  def calcularBisiesto(numero : Int) : String ={
    var bisiesto = ""
    if(numero % 4 == 0 && numero % 100 != 0 ){
      bisiesto = "El a�o " + numero + " es a�o bisiesto"
    }
    else{
      bisiesto = "El a�o " + numero + " NO es a�o bisiesto"
    }
    bisiesto 
  }
  def main(args: Array[String]): Unit = {
    println("Inserta a�o: ")
    val numero = readInt()
    
    println(calcularBisiesto(numero))
  }
}