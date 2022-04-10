public int sumHeights2(int[] heights, int start, int end) {
  int netChange = 0;
  
  for (int i = start; i < end; i++) {
    if (heights[i] < heights[i + 1]) {
      netChange += Math.abs(heights[i] - heights[i + 1]) * 2;
    } else if (heights[i] > heights[i + 1]) {
      netChange += Math.abs(heights[i] - heights[i + 1]);
    }
  }
  
  return netChange;
}
