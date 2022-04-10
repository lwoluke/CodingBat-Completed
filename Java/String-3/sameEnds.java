public String sameEnds(String string) {
  int len = string.length();
  String fin = "";
  String tmp = "";
  int tmplen = 0;
  
  for (int i = 0; i < len; i++) {
    tmp += string.charAt(i);
    tmplen = tmp.length();
    if (i < len / 2 
      && tmp.equals(string.substring(len-tmplen,len))) 
      {
        fin = tmp; 
      }
  }
  return fin;
}
