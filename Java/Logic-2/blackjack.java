public int blackjack(int a, int b) {
  if (a > b && a <= 21 || a <= 21 && b > 21) {
    return a;
  } else if (a < b && b <= 21 || a >= 21 && b <= 21) {
    return b;
  } else if (a > 21 && b > 21) {
    return 0;
  }
  return 0;
}
