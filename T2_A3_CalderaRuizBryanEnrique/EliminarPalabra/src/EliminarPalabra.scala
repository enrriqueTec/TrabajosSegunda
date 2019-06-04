import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object EliminarPalabra {
  def main(args: Array[String]): Unit = {
    var palabras = llenarList()
    println("Lista con palabras eliminadas " + eliminarPalabra(palabras))
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
  
  def eliminarPalabra(palabras : ListBuffer[String]) : ListBuffer [String] ={
    var palabrasEliminar= new ListBuffer [String]()
    println("Inserta la palabra para eliminar: ")
    var pal = readLine()
    for(i <- palabras){
      if(pal == i){ 
      }else{
        palabrasEliminar += i
      }
    }
    return palabrasEliminar
  }
}