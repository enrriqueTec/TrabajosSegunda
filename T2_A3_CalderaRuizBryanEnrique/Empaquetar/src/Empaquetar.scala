import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object Empaquetar {
  def main(args: Array[String]): Unit = {
    var paquete = llenarList()
    println("Lista empaquetada " + empaquetar(paquete))
  }
  
  def llenarList() : ListBuffer [String] ={
    var paquete = new ListBuffer [String]()
    println("Inserta el numero de elementos que tendra la lista: ")
    var n = readInt()
    for(i <- 0 until n){
      println("Inserta palabra numero " + (i+1))
      paquete += readLine()
    }
    return paquete
  }
  
  def empaquetar(paquete : ListBuffer[String]) : ListBuffer [String] ={
    var paqueteEm= new ListBuffer [String]()
    var paq = paquete
    println("Inserta la palabra para empaquetar: ")
    var pal = readLine()
    println("Inserta numero de veces que se debe empaquetar: ")
    var num = readInt()
    for(i <- paq){
        paqueteEm += i
        if(i == pal){
          for(j <- 1 until num)
          paqueteEm += i
        }
    }
    return paqueteEm
  }
}