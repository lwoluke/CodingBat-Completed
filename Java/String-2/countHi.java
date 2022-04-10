public int countHi(String str) {
  int count = 0;
  for (int letter = 0; letter < str.length() - 1; letter++) {
    if (str.substring(letter, letter + 2).equals("hi")) {
      count += 1;
    }
  }
  return count;
}
