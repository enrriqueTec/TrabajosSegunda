import scala.io.StdIn._

object PromedioCincoCalificaciones {
  
  def promedio(calif : Array [Double]) : Double ={
    var promedio = 0.0
    for(x <- calif){
      promedio +=  x
    }
    promedio/calif.length
  }
  def main(args: Array[String]): Unit = {
    var calif = new Array[Double](5)
    for(x <- 0 until calif.length){
      println("Inserta una calificacion: ")
      calif(x) = readDouble()
    }
    
    
    if(promedio(calif) < 100 && promedio(calif) >= 90){
      println(promedio(calif) + "		Excelente")
    }
    else if(promedio(calif) <= 89 && promedio(calif) >= 80){
      println(promedio(calif) + "		Bien")
    }
    else if(promedio(calif) <= 79 && promedio(calif) >= 70){
      println(promedio(calif) + "		Regular")
    }
    else if(promedio(calif) <= 69){
      println(promedio(calif) + "		Terrible")
    }
  }
}