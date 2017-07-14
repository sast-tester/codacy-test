import sys.process._

object Test {
  def main(args: Array[String]) = {
    val cmd = Console.readLine()
    val anon_exec : String => Int = (s : String) => s.!
    println((x => anon_exec(x))(cmd))
  }
}
