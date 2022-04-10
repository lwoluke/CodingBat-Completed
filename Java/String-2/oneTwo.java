public String oneTwo(String str) {
  String result = "";
  String one = "";
  String two = "";
  
  for (int i = 0; i < str.length() - 2; i+=3) {
    one = str.substring(i, i + 1);
    two = str.substring(i + 1, i + 3);
    result += two + one;
  }
  
  return result;
}
