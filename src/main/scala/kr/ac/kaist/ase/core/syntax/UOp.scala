package kr.ac.kaist.ase.core

// CORE Unary Operators
sealed trait UOp extends CoreNode
case object ONeg extends UOp
case object ONot extends UOp
case object OBNot extends UOp