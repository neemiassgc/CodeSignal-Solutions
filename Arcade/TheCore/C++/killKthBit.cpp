#include <bitset>

using std::bitset;

int killKthBit(int n, int k) {
  return bitset<32>(n).set(k % 32 - 1, false).to_ullong();
}