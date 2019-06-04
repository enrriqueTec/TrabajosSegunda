import scala.io.StdIn._

object PrestamoBanco {
  
  def acreditaPrestamo(nombre : String, historia : String, cantidad : Double, salario : Double, oPropiedades : Double) : String ={
    var acredita = ""
    var puntos = 0
    if(historia.equals("m") || historia.equals("M" )){
      acredita = "El cliente " + nombre + " no acredita al prestamo"
    }
    if(salario >= (cantidad/2)){
      puntos += 5
    }
    else if(salario >= (cantidad/4) && salario <= (cantidad/2)){
        puntos += 3
    }
    else if(salario >= (cantidad/10) && salario <= (cantidad/4)){
        puntos += 1
    }
    if(oPropiedades > (cantidad*2)){
      puntos += 5
    }
    else if(oPropiedades <= (cantidad*2) && oPropiedades >= (cantidad)){
      puntos += 3
    }
    if(puntos > 6 && historia.equals("b") || puntos > 6 && historia.equals("B")){
      acredita = "El cliente " + nombre + " si acredita al prestamo, con " + puntos + " puntos"
    }
    acredita 
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta el nombre: ")
    val nombre = readLine()
    println("Inserta historia crediticia b(buena)/m(mala): ")
    val historia = readLine()
    println("Inserta cantidad pedida: ")
    val cantidad = readDouble()
    println("Inserta salario anual: ")
    val salario = readDouble()
    println("Inserta valor de otras propiedades: ")
    val oPropiedades = readDouble()
    
    println(acreditaPrestamo(nombre, historia, cantidad, salario, oPropiedades))
    
  }
}