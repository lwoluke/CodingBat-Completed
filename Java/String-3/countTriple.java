public int countTriple(String str) {
  int count = 0;
  
  for (int i = 1; i < str.length() - 1; i++) {
    char letter = str.charAt(i);
    char next = str.charAt(i + 1);
    char prev = str.charAt(i - 1);
    if (prev == letter && letter == next) {
      count++;
    }
  }
  return count;
}
