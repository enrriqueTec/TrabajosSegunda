import scala.io.StdIn._

object DescuentoTiendaPantalones {
  
  def totalPagar(pantalones : Int) : Double ={
    var total = 0.0
    if(pantalones < 5){
      total = (pantalones * 356.82)
    }
    else if(pantalones >= 5 && pantalones <= 12){
      total = (pantalones * (356.82 * .85))
    }
    else if(pantalones > 12){
      total = (pantalones * (356.82 * .70))
    }
    total 
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta el numero de pantalones: ")
    val pantalones = readInt()
    
    println("El total a pagar es: " + totalPagar(pantalones))
  }
}