public String zipZap(String str) {
  String finalString = "";
  
  for (int i = 0; i < str.length(); i++) {
    finalString += str.substring(i, i + 1);
    
    if (i > 0 && i < str.length() - 1) {
      
      if (str.charAt(i - 1) == 'z' 
          && str.charAt(i + 1) == 'p') 
      {
        finalString = finalString.substring(0, finalString.length() - 1);
      }
    }
  }
  
  return finalString;
}
