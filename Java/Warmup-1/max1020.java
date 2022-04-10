public int max1020(int a, int b) {
  if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
    if (a >= b) {
      return a;
    }
    return b;
  } else if (a >= 10 && a <= 20) {
    return a;
  } else if (b >= 10 && b <= 20) {
    return b;
  }
  return 0;
}
