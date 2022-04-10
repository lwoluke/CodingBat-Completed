public boolean equalIsNot(String str) {
  int isCount = 0;
  int notCount = 0;
  
  for (int i = 0; i < str.length(); i++) {
    
    if (i < str.length() - 1) {
      
      if (str.substring(i, i + 2).equals("is") 
        && i < str.length() - 1) 
      {
        isCount++;
      } 
    }
    if (i < str.length() - 2) {
      
      if (str.substring(i, i + 3).equals("not")
        && i < str.length() - 2) 
      {
        notCount++;
      } 
    }
  }
  
  return isCount == notCount;
}
