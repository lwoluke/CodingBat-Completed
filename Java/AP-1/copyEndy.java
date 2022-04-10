public int[] copyEndy(int[] nums, int count) {
  int[] results = new int[count];
  int pos = 0;
  
  for (int num: nums) {
    if (pos == count) break;
    if (isEndy(num)) {
      results[pos] = num;
      pos++;
    }
  }
  
  return results;
  
}

public boolean isEndy(int n) {
  if (n <= 10 && n >= 0 || n <= 100 && n >= 90) {
    return true;
  }
  return false;
}
