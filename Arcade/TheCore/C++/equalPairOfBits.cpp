int equalPairOfBits(int n, int m) {
  return ~(n ^ m) & ((n ^ m) + 1);
}