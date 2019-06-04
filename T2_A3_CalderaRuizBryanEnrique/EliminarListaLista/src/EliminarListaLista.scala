import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

object EliminarListaLista {
  def main(args: Array[String]): Unit = {
    var palabras1 = llenarList()
    var palabras2 = llenarList2()
    println("Lista con palabras eliminadas " + eliminarPalabra(palabras1, palabras2))
  }
  
  def llenarList() : ListBuffer [String] ={
    var palabras1 = new ListBuffer [String]()
    println("Inserta el numero de palabra que tendra la lista: ")
    var n = readInt()
    for(i <- 0 until n){
      println("Inserta palabra numero " + (i+1))
      palabras1 += readLine()
    }
    return palabras1
  }
  
  def llenarList2() : ListBuffer [String] ={
    var palabras2 = new ListBuffer [String]()
    println("Inserta el numero de palabra que tendra la segunda lista: ")
    var n = readInt()
    for(i <- 0 until n){
      println("Inserta palabra numero " + (i+1))
      palabras2 += readLine()
    }
    return palabras2
  }
  
  def eliminarPalabra(palabras1 : ListBuffer[String], palabras2 : ListBuffer[String]) : ListBuffer [String] ={
    val palabra2 = palabras2
    val palabrasEliminar = palabras1
    var pal = 0
      
    for(i <- palabrasEliminar){
      pal +=1
      for(j <- palabra2){
        
        if(i==j){
          palabrasEliminar.remove(pal)
        }
      }
      //pal=0
    }
    return palabrasEliminar
  }
}