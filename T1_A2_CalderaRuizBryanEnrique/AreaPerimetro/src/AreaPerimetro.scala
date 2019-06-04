import scala.io.StdIn._

object AreaPerimetro {
  
  def areaCirculo(radio : Double) : Double ={
    val area = ((Math.pow(radio, 2)) * Math.PI)
    area
  }
  
  def areaTriangulo(base : Double, altura : Double) : Double ={
    val area = ((base * altura) / 2)
    area
  }
  
  def areaRectangulo(base : Double, altura : Double) : Double ={
    val area = (base * altura)
    area
  }
  
  def perimetroTriangulo(ladoA : Double, ladoB : Double, ladoC : Double) : Double ={
    val perimetro = (ladoA + ladoB + ladoC)
    perimetro
  }
  
  def perimetroRectangulo(largo : Double, ancho : Double) : Double ={
    val perimetro = ((largo + ancho)*2)
    perimetro
  }
  
  def perimetroCirculo(radioPerimetro : Double) : Double ={
    val perimetro = (radioPerimetro * Math.PI *2)
    perimetro
  }
  
  def main(args: Array[String]): Unit = {
    var op1 = 0
    var op2 = 0
    
    //while(op1 != 4){
      println("Selecciona una opcion:")
      println("1) Circulo")
      println("2) Triangulo")
      println("3) Rectángulo")
      println("4) Salir")
      op1 = readInt()
    
      if(op1 == 1){
        //while(op2 != 3){
          println("Selecciona una opcion:")
          println("1) Area del circulo")
          println("2) Perimetro del circulo")
          println("3) Salir")
          val op2 = readInt()
          if(op2 == 1){
            println("Inserta el radio del circulo")
            val radioArea = readDouble()
            println("El area es: " + areaCirculo(radioArea))
          }
          else if(op2 == 2){
            println("Inserta el radio del circulo")
            val radioPerimetro = readDouble()
            println("El perimetro es: " + perimetroCirculo(radioPerimetro))
          }
        //}
        
      }
      else if(op1 == 2){
        //while(op2 != 3){
          println("Selecciona una opcion:")
          println("1) Area del triangulo")
          println("2) Perimetro del triangulo")
          println("3) Salir")
          val op2 = readInt()
          if(op2 == 1){
            println("Inserta base del triangulo")
            val baseTriangulo = readDouble()
            println("Inserta altura del triangulo")
            val alturaTriangulo = readDouble()
            println("El area del triangulo es: " + areaTriangulo(baseTriangulo, alturaTriangulo))
          }
          else if(op2 == 2){
            println("Inserta el lado A del triangulo")
            val ladoA = readDouble()
            println("Inserta el lado B del triangulo")
            val ladoB = readDouble()
            println("Inserta el lado C del triangulo")
            val ladoC = readDouble()
            println("El perimetro del triangulo es: " + perimetroTriangulo(ladoA, ladoB, ladoC))
          }
        //}
      }
      else if(op1 == 3){
        //while(op2 != 3){
          println("Selecciona una opcion:")
          println("1) Area del reactangulo")
          println("2) Perimetro del rectangulo")
          println("3) Salir")
          val op2 = readInt()
          if(op2 == 1){
            println("Inserta largo del rectangulo")
            val largoRectangulo = readDouble()
            println("Inserta ancho del rectangulo")
            val anchoRectangulo = readDouble()
            println("El area del Rectangulo es: " + areaRectangulo(largoRectangulo, anchoRectangulo))
          }
          else if(op2 == 2){
            println("Inserta largo del rectangulo")
            val largoRectangulo = readDouble()
            println("Inserta ancho del rectangulo")
            val anchoRectangulo = readDouble()
            println("El perimetro del Rectangulo es: " + perimetroRectangulo(largoRectangulo, anchoRectangulo))
          }
        //} 
      }
    //} while 
  }
}