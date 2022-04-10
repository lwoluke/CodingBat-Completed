public int[] squareUp(int n) {
  if (n == 0) return new int[0];
  
  int[] nums = new int[n*n];
  int pos = 0;
  
  for (int i = 1; i <= n; i++) {
    for (int j = n; j > 0; j--) {
      if (j <= i) {
        nums[pos] = j;
      }
      pos++;
    }
  }
  return nums;
}
