package kr.ac.kaist.jiset.js.ast

import kr.ac.kaist.jiset.ir._
import kr.ac.kaist.jiset.util.Span
import spray.json._

trait SpreadElement extends AST { val kind: String = "SpreadElement" }

case class SpreadElement0(x1: AssignmentExpression, parserParams: List[Boolean], span: Span) extends SpreadElement {
  x1.parent = Some(this)
  def idx: Int = 0
  def k: Int = d(x1, 0)
  def fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  def maxK: Int = 0
  override def toString: String = {
    s"... $x1"
  }
}