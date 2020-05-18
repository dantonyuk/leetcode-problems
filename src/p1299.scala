// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side
object Solution {
  def replaceElements(arr: Array[Int]): Array[Int] = {
    var maxEl = -1
    for (i <- arr.length - 1 to 0 by -1) {
      val el = arr(i)
      arr(i) = maxEl
      maxEl = Math.max(maxEl, el)
    }
    //
    // It's working but looks ugly
    //
    // arr.reverseIterator.foldLeft((arr.length - 1, -1)) { case ((i, maxEl), el) => 
    //   arr(i) = maxEl
    //   (i - 1, Math.max(maxEl, el))
    // }
    arr
  }
}
