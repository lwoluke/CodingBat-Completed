public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  for (int i = 0; i < result.length; i++) {
    result[i] = start + i;
  }
  return result;
}
