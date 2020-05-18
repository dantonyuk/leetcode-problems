// https://leetcode.com/problems/number-of-recent-calls
class RecentCounter() {
  import scala.collection.mutable.Queue
  private val pings = new Queue[Int]

  def ping(t: Int): Int = {
    pings += t
    while (pings.front < t - 3000) pings.dequeue
    pings.size
  }
}
