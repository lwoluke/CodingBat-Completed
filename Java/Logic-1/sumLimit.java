public int sumLimit(int a, int b) {
  int sum = a + b;
  String sumStr = String.valueOf(sum);
  String aStr = String.valueOf(a);
  
  if (sumStr.length() == aStr.length()) {
    return sum;
  }
  return a;
}
