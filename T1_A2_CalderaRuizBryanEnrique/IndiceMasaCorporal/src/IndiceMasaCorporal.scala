import scala.io.StdIn._

object IndiceMasaCorporal {
  
  def indiceMasaCorporal(peso : Double, altura : Double) : Double ={
    val IMC = ( peso/(Math.pow(altura, 2)))
    IMC 
  }
  
  
  def main(args: Array[String]): Unit = {
    
    println("Inserta el peso(kg): ")
    val peso = readDouble()
    println("Inserta altura(m): ")
    val altura = readDouble()
    
    if(indiceMasaCorporal(peso, altura) < 16){
      println(indiceMasaCorporal(peso, altura) + "		Criterio de ingreso al hospital")
    }
    else if(indiceMasaCorporal(peso, altura) >= 16 && indiceMasaCorporal(peso, altura) < 17){
      println(indiceMasaCorporal(peso, altura) + "		Infrapeso")
    }
    else if(indiceMasaCorporal(peso, altura) >= 17 && indiceMasaCorporal(peso, altura) < 18){
      println(indiceMasaCorporal(peso, altura) + "		Bajo peso")
    }
    else if(indiceMasaCorporal(peso, altura) >= 18 && indiceMasaCorporal(peso, altura) < 25){
      println(indiceMasaCorporal(peso, altura) + "		Peso normal(Saludable)")
    }
    else if(indiceMasaCorporal(peso, altura) >= 25 && indiceMasaCorporal(peso, altura) < 30){
      println(indiceMasaCorporal(peso, altura) + "		 Sobrepeso (obesidad de grado I)")
    }
    else if(indiceMasaCorporal(peso, altura) >= 30 && indiceMasaCorporal(peso, altura) < 35){
      println(indiceMasaCorporal(peso, altura) + "		 Sobrepeso crónico (obesidad de grado II)")
    }
    else if(indiceMasaCorporal(peso, altura) >= 35 && indiceMasaCorporal(peso, altura) < 40){
      println(indiceMasaCorporal(peso, altura) + "		 Obesidad premórbida (obesidad de grado III)")
    }
    else if(indiceMasaCorporal(peso, altura) >= 40){
      println(indiceMasaCorporal(peso, altura) + "		 Obesidad mórbida (obesidad de grado IV)")
    }
  }
}