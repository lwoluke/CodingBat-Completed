public int bigHeights(int[] heights, int start, int end) {
  int bigSteps = 0;
  
  for (int i = start; i < end; i++) {
    if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
      bigSteps++;
    }
  }
  
  return bigSteps;
}
