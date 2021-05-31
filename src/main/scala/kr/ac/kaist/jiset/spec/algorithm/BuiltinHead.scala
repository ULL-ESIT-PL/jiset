package kr.ac.kaist.jiset.spec.algorithm

import kr.ac.kaist.jiset.ir
import kr.ac.kaist.jiset.ir.Beautifier._

// built-in algorithm heads
case class BuiltinHead(
  ref: ir.Ref,
  origParams: List[Param]
) extends Head {
  // name from base and fields
  val name: String = ref.beautified

  // fixed parameters for built-in algorithms
  val params: List[Param] =
    List(THIS_PARAM, ARGS_LIST, NEW_TARGET).map(Param(_))
}