

object PromedioVectores {
  def main(args: Array[String]): Unit = {
    val calificaciones = new Array[Array [Double]](6)
    calificaciones(0) = Array(80, 90, 100, 80, 90, 100)
    calificaciones(1) = Array(90, 70, 100, 93, 85, 90)
    calificaciones(2) = Array(100, 80, 90, 81, 87, 80)
    calificaciones(3) = Array(80, 85, 85, 72, 90, 87)
    calificaciones(4) = Array(90, 78, 90, 82, 100, 100)
    calificaciones(5) = Array(100, 83, 92, 79, 83, 90)
    
    for(i <- 0 until promedioParcial(calificaciones).length){//until tiene limite de n-1
      System.out.println("El promedio del parcial " +(i+1) + " es: "+promedioParcial(calificaciones)(i))
    }
    
    System.out.println("=============================================================================")
    
    for(i <- 0 until promedioMateria(calificaciones).length){//until tiene limite de n-1
      System.out.println("El promedio de la materia " +(i+1) + " es: "+promedioMateria(calificaciones)(i))
    }
    
    System.out.println("=============================================================================")
    
    
    System.out.println("El promedio general es: " + promedioGeneral(calificaciones))
    
  }
  
  
  //Funcion promedio parcial
  def promedioParcial(calificaciones : Array[Array [Double]]) : Array[Double] ={
    val promedioP = new Array[Double](6)
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        promedioP(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      promedioP(i) = promedioP(i)/promedioP.length
      
    }
    return promedioP
  }
  
  //Funcion promedio materia
  def promedioMateria(calificaciones : Array[Array [Double]]) : Array[Double] ={
    val promedioM = new Array[Double](6)
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        promedioM(j) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      promedioM(i) = promedioM(i)/promedioM.length
      
    }
    return promedioM
  }
  
  
  //Funcion promedio general
  def promedioGeneral(calificaciones : Array[Array [Double]]) : Double ={
    val promedioG = new Array[Double](6)
    var pg = 0.0
    for(i <- 0 until calificaciones.length){//until tiene limite de n-1
      for(j <- 0 until calificaciones.length){//until tiene limite de n-1
        promedioG(i) += calificaciones(i)(j)
      }
    }
    for(i <- 0 until promedioG.length){//until tiene limite de n-1
      pg += promedioG(i)
      
    }
    return pg /(promedioG.length * promedioG.length)
  }
}