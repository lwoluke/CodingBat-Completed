public String mixString(String a, String b) {
  int min = Math.min(a.length(), b.length());
  int x = 0;
  String total = "";
  
  while(x < min) {
    String asub = a.substring(x, x + 1);
    String bsub = b.substring(x, x + 1);
    total = total + asub + bsub;
    x++;
  }
  return total + a.substring(x) + b.substring(x);
}
