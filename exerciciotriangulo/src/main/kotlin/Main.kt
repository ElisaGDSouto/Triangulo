import kotlin.math.sqrt

fun main(){
   println("Digite o lado 1")
   var lado1: Float? = readLine()?.toFloat()
   println("Digite o lado 2")
   var lado2:Float? = readLine()?.toFloat()
   println("Digite o lado 3")
   var lado3:Float? = readLine()?.toFloat()
   var tamanho = (lado1!!+lado2!!+lado3!!)/2
   var area = sqrt(tamanho *(tamanho- lado1) * (tamanho - lado2) * (tamanho - lado3))

   println("A area do triangulo é"+ area)

   if (lado1 == lado2 && lado2 == lado3) {
      println("triangulo Equilátero")
   }   else if (lado1 != lado2 && lado2 != lado3){
         println("Tringlo Escaleno")
      } else{
         println("Triangulo isóceles")
   }
}