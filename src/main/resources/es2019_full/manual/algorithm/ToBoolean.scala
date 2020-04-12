object ToBoolean {
  val func: Func = Func("ToBoolean", List(Id("argument")), None, parseInst(
    s"""{
          app atype = (Type argument)
          if (= atype "Undefined") {
            return false
          } else if (= atype "Null") {
            return false
          } else if (= atype "Boolean") {
            return argument
          } else if (= atype "Number") {
            if (|| (|| (= argument 0.0) (= argument (- 0.0))) (= argument NaN)) return false
            else return true
          } else if (= atype "String") {
            if (= argument "") return false
            else return true
          } else if (= atype "Symbol") {
            return true
          } else {
            return true
          }
        }"""
  ))
}