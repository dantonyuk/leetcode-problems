// https://leetcode.com/problems/unique-morse-code-words
object Solution {
  val morse = ('a' to 'z').zip(LazyList(
    ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
    "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
    )).toMap

  def uniqueMorseRepresentations(words: Array[String]): Int =
    words.view.map(_.flatMap(morse)).distinct.size
}
