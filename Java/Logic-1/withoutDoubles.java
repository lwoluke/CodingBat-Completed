public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  if (die1 == die2 && noDoubles) {
    if (die1 == 6) {
      die1 = 1;
    } else {
      die1++;
    }
  }
  return die1 + die2;
}
