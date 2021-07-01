package kr.ac.kaist.jiset.js.ast

import kr.ac.kaist.jiset.ir._
import kr.ac.kaist.jiset.util.Span
import spray.json._

trait VariableDeclaration extends AST { val kind: String = "VariableDeclaration" }

case class VariableDeclaration0(x0: BindingIdentifier, x1: Option[Initializer], parserParams: List[Boolean], span: Span) extends VariableDeclaration {
  x0.parent = Some(this)
  x1.foreach((m) => m.parent = Some(this))
  def idx: Int = 0
  def k: Int = d(x1, d(x0, 0))
  def fullList: List[(String, Value)] = l("Option[Initializer]", x1, l("BindingIdentifier", x0, Nil)).reverse
  def maxK: Int = 1
  override def toString: String = {
    s"$x0 ${x1.getOrElse("")}"
  }
}

case class VariableDeclaration1(x0: BindingPattern, x1: Initializer, parserParams: List[Boolean], span: Span) extends VariableDeclaration {
  x0.parent = Some(this)
  x1.parent = Some(this)
  def idx: Int = 1
  def k: Int = d(x1, d(x0, 0))
  def fullList: List[(String, Value)] = l("Initializer", x1, l("BindingPattern", x0, Nil)).reverse
  def maxK: Int = 0
  override def toString: String = {
    s"$x0 $x1"
  }
}