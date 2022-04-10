public boolean evenlySpaced(int a, int b, int c) {
  if ((a - b == b - c) || (a - c == c - b) || (a - b == c - a)) {
    return true;
  }
  return false;
}
