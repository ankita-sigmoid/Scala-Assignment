object bucketise {
  def truncateNum(x: Double, p:Int): Double ={
    val v = math.pow(10, p)
    (x*v).toInt / v
  }

  def bucket(y: Double): (Double, Double) = {
    // Find bucket in the range given
    var initialValue: Double = (y/0.05).floor * 0.05;
    var finalValue: Double = (y/0.05).floor * 0.05 + 0.049;
    return (truncateNum(initialValue, 3), truncateNum(finalValue, 3))
  }

  def main(args: Array[String]): Unit = {
    var numberList: Array[Double] = Array(12.05, 12.03, 10.33, 11.45, 13.5)
    for (num <- numberList){
      print(s"The bucket where $num value is ")
      println(bucket(num))
    }
  }
}