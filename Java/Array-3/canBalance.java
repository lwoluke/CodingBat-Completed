public boolean canBalance(int[] nums) {
  int sumLeft = 0;
  int sumRight = 0;
  int count = 0;
  
  while (count < nums.length) {
    for (int i = 0; i <= count; i++) {
      sumLeft += nums[i];
    }
    for (int j = nums.length - 1; j > count; j--) {
      sumRight += nums[j];
    }
    if (sumLeft == sumRight) {
      return true;
    } else {
      sumLeft = 0;
      sumRight = 0;
      count++;
    }
  }
  return false;
}
