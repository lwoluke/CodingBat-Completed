public int sumHeights(int[] heights, int start, int end) {
  int netChange = 0;
  
  for (int i = start; i < end; i++) {
    netChange += Math.abs(heights[i] - heights[i + 1]);
  }
  
  return netChange;
}
