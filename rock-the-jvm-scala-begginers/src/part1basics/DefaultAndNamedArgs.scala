package lectures.part1basics

object DefaultAndNamedArgs extends App {

  def tailrecFactorial(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else tailrecFactorial(n-1, n*acc)
  }
  println(tailrecFactorial(5))

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = {
    println("saving picture")
  }
  savePicture(width = 800, height = 600)
  savePicture(height = 600, width = 800, format = "bmp")
}
