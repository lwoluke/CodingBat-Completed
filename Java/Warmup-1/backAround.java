public String backAround(String str) {
  char first = str.charAt(0);
  char last = str.charAt(str.length() - 1);
  if (str.length() < 2) {
    return str + str + str;
  }
  return last + str.substring(0, str.length() - 1) + last + last;
}
