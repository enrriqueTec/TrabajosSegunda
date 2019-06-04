import scala.io.StdIn._

object DiasMeses {
  
  def dias(mes : Int) : String ={
    var dias = ""
    if(mes == 2){
      dias = "El mes 2 tiene 28 dias"
    }
    else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
      dias = "El mes " + mes + " tiene 30 dias"
    }
    else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      dias = "El mes " + mes + " tiene 31 dias"
    }
    dias 
  }
  
  def main(args: Array[String]): Unit = {
    println("Inserta un mes(1-12): ")
    val mes = readInt()
    
    println( dias(mes))
  }
}