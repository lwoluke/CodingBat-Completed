public String mirrorEnds(String string) {
  int start = 0;
  int end = string.length()-1;

  for(int i = 0; i < string.length(); i++){
    
    if(string.charAt(start) == string.charAt(end) ){
      start++;
      end--;
    } else {
      break;
    }
    
  }
  return string.substring(0,start);
}
