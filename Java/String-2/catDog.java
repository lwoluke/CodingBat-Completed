public boolean catDog(String str) {
  int catCount = 0;
  int dogCount = 0;
  
  for (int i = 0; i < str.length() - 2; i++) {
    if (str.substring(i, i + 3).equals("cat")) {
      catCount += 1;
    } else if (str.substring(i, i + 3).equals("dog")) {
      dogCount += 1;
    }
  }
  
  if (catCount == dogCount) {
      return true;
    }
  return false;
}
