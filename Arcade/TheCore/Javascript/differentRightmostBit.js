function differentRightmostBit(n, m) {
  return Math.pow(2, [...(n ^ m).toString(2)].reverse().findIndex(v => v == 1));
}