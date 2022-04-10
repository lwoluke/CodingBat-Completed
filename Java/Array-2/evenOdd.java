public int[] evenOdd(int[] nums) {
  int[] output = new int[nums.length];
  int evenPos = 0;
  int oddPos = nums.length-1;
  for (int i : nums) {
    if (i % 2==0) {
      output[evenPos]=i;
      evenPos++;
    } else {
      output[oddPos]=i;
      oddPos--;
    }
  }

  return output;
}
