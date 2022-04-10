public int scoresSpecial(int[] a, int[] b) {
  int specA = largestSpecial(a);
  int specB = largestSpecial(b);
  
  return specA + specB;
}

public int largestSpecial(int[] nums) {
  if (nums.length == 0) return 0;
  
  int largest = 0;
  
  for (int num: nums) {
    if (num % 10 == 0 && num > largest) {
      largest = num;
    }
  }
  
  return largest;
}
