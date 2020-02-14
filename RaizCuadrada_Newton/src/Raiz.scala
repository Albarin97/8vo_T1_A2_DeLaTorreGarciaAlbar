import scala.io.StdIn._
import scala.math._

object Raiz {
  def main(args: Array[String]): Unit = {
    println("Ingresa un valor")
    var num = readDouble()
    var estimacion = 0.0
    var termino = true;
    var y = num/2
    var cont = 0
    val res = (sqrt(num)).toString().substring(0, 7)
    
    
    while(termino){
      println("Y"+y)
      estimacion = num/y
      y = (estimacion+y)/num
      cont+=1
      //println("Y:"+y+" Contadr"+cont)
      if(y.toString().substring(0, 7).equalsIgnoreCase(res)){
        termino=false
        println("Resultado:"+y)
        println("RESultado:"+res)
        
      }
      
    }
  }
}