int swapAdjacentBits(int n) {
  return 0xAAAAAAAA & n << 1 | 0x55555555 & n >> 1;
}