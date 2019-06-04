import scala.io.StdIn._
import scala.collection.mutable.ListBuffer


object ObtenerPalindromas {
  def main(args: Array[String]): Unit = {
    var palabras = llenarList()
    println("Lista con palabras palindromas " + obtenerPalindroma(palabras))
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
  
  def obtenerPalindroma(palabras : ListBuffer[String]) : ListBuffer [String] ={
    var palindromas= new ListBuffer [String]()
    var pal = palabras
    
    for(i <- pal){
      for(j <- pal){
        if(i == j.reverse){
          palindromas += i
        }
      }
    }
    return palindromas
  }
}