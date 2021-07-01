package kr.ac.kaist.jiset.js.ast

import kr.ac.kaist.jiset.ir._
import kr.ac.kaist.jiset.util.Span
import spray.json._

trait FunctionStatementList extends AST { val kind: String = "FunctionStatementList" }

case class FunctionStatementList0(x0: Option[StatementList], parserParams: List[Boolean], span: Span) extends FunctionStatementList {
  x0.foreach((m) => m.parent = Some(this))
  def idx: Int = 0
  def k: Int = d(x0, 0)
  def fullList: List[(String, Value)] = l("Option[StatementList]", x0, Nil).reverse
  def maxK: Int = 1
  override def toString: String = {
    s"${x0.getOrElse("")}"
  }
}