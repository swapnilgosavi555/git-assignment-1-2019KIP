package edu.knoldus

class Sorting {


  def selectionSort(list: List[Int]): List[Int] = {
    val array = list.toArray
    for (i <- 0 to array.length - 2) {
      var min = array(i)
      var pos = i
      for (j <- i to array.length - 1)
        if (min > array(j)) {
          min = array(j)
          pos = j
        }
      if (array(i) != min) {
        val temp = array(pos)
        array(pos) = array(i)
        array(i) = temp

      }

    }

    array.toList
  }
}