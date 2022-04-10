public boolean sameStarChar(String str){
  
  for(int x = 1; x < str.length() - 1; x++){
    
    if (str.charAt(x) == '*' 
        && str.charAt(x-1) != str.charAt(x+1))
    {
      return false;
    }
  }
  
  return true;
}
