import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object SustituirPalabra {
  def main(args: Array[String]): Unit = {
    var palabras = llenarList()
    println("Lista con palabras sustituidas " + sustituirPalabra(palabras))
  }
  
  def llenarList() : ListBuffer [String] ={
    var palabras = new ListBuffer [String]()
    println("Inserta el numero de palabra que tendra la lista: ")
    var n = readInt()
    for(i <- 0 until n){
      println("Inserta palabra numero " + (i+1))
      palabras += readLine()
    }
    return palabras
  }
  
  def sustituirPalabra(palabras : ListBuffer[String]) : ListBuffer [String] ={
    var palabrasCambio= new ListBuffer [String]()
    println("Inserta la primera palabra: ")
    var pal1 = readLine()
    println("Inserta la segunda palabra: ")
    var pal2 = readLine()
    for(i <- palabras){
      if(pal1 != i){
        palabrasCambio += i 
      }else{
        palabrasCambio += pal2
      }
    }
    return palabrasCambio
  }
}