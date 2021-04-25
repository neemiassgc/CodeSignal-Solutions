int differentRightmostBit(int n, int m) {
  return (n ^= m) & -n;
}