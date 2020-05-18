// https://leetcode.com/problems/min-stack
class MinStack() {

  private var valStack = List.empty[Long]
  private var minElem = Int.MaxValue.toLong

  def push(x: Int): Unit = {
    val lx = x.toLong
    val (minEl, elem) =
      if (valStack.isEmpty) (lx, lx) else
      if (lx >= minElem) (minElem, lx) else
      (lx, 2 * lx - minElem)
    minElem = minEl
    valStack = elem +: valStack
  }

  def pop(): Unit = {
    val elem = valStack(0)
    if (elem < minElem)
      minElem = 2 * minElem - elem
    valStack = valStack.tail
    if (valStack.isEmpty)
      minElem = Int.MaxValue.toLong
  }

  def top(): Int =
    Math.max(minElem, valStack(0)).toInt

  def getMin(): Int = minElem.toInt
}

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(x)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */