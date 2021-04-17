fun arithmeticExpression(a: Int, b: Int, c: Int) =
  a + b == c || a - b == c || a * b == c || a.toDouble() / b.toDouble() == c.toDouble()
