import scala.collection.mutable.ArrayBuffer

object HoraTemperatura {
  def main(args: Array[String]): Unit = {
    var horaTemperatura = llenarArreglo()
    
    for(i <- 0 until horaTemperatura.length){//until tiene limite de n-1
      if(i%2 == 0 ){
        println()
        println("Hora y temperatura: ")
      }  
      print(llenarArreglo()(i) + " ")
    }
    
    println()
    println("==========================================================")
    
    var ht = mostrarTemperaturas(horaTemperatura)
    
    for(i <- 0 until ht.length){//until tiene limite de n-1
      //if(i%2 == 0 ){
        //println()
        //println("Hora y temperatura: ")
      //}  
      print(ht(i) + " ")
    }
  }
  
  def llenarArreglo() : Array [Int] ={
    
    var horaTemperatura = new Array[Int](48)
    var random = new scala.util.Random
    var c = 0
    for(i <- 0 until horaTemperatura.length){
      if(i%2 == 0){
        horaTemperatura(i) = c
        c+=1
      }
      else{
        horaTemperatura(i) = random.nextInt(26)
      }
    }
    return horaTemperatura
  }
  
  def mostrarTemperaturas(horaTemperatura : Array[Int]) : Array [Int] ={
    var c = 0 
    var h = 0
    var t = 0
    
    for(i <- 0 until horaTemperatura.length){
      if(horaTemperatura(i) == 25){
        c+=2
      }
    }
    
    var temperatura = new Array[Int](c)
    
    for(i <- 0 until horaTemperatura.length){
      if(horaTemperatura(i) == 25){
        temperatura(h) = horaTemperatura((i-1))
        h+=2
      }
    }
    
    for(i <- 0 until temperatura.length){
      if(i%2 == 0){
        
      }
      else{
        temperatura(i) = 25
      }
      t+=1
    }
    
    
    temperatura
  }
}