import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object PalabraRepetida {
  
  def main(args: Array[String]): Unit = {
    var palabras = llenarList()
    println("El numero de veces que aparece la palabra en la lista es: " + buscarPalabra(palabras))
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
  
  def buscarPalabra(palabras : ListBuffer[String]) : Int ={
    println("Inserta la palabra a buscar: ")
    var pal = readLine()
    var c = 0
    for(i <- palabras){
      if(pal == i){
        c+=1
      }
    }
    return c
  }
}