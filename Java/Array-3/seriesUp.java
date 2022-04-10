public int[] seriesUp(int n) {
  if (n == 0) return new int[0];
  int[] nums = new int[n*(n+1)/2];
  int pos = 0;
  
  for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
      nums[pos] = j;
      pos++;
    }
  }
  return nums;
}
