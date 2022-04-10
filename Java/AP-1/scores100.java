public boolean scores100(int[] scores) {
  for (int i = 0; i < scores.length - 1; i++) {
    if (scores[i] == scores[i+1]) {
      return true;
    }
  }
  return false;
}
