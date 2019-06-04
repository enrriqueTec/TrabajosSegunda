import scala.io.StdIn._

object Bisiesto {
  
  def calcularBisiesto(numero : Int) : String ={
    var bisiesto = ""
    if(numero % 4 == 0 && numero % 100 != 0 ){
      bisiesto = "El año " + numero + " es año bisiesto"
    }
    else{
      bisiesto = "El año " + numero + " NO es año bisiesto"
    }
    bisiesto 
  }
  def main(args: Array[String]): Unit = {
    println("Inserta año: ")
    val numero = readInt()
    
    println(calcularBisiesto(numero))
  }
}