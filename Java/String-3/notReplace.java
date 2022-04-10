public String notReplace(String str) {
  
  String result = "";
  str = " " + str + " ";
  
  for(int i=0; i <=str.length()-2; i++) {
    if(str.substring(i,i+2).equals("is") 
        && !Character.isLetter(str.charAt(i-1))
        && !Character.isLetter(str.charAt(i+2)))
    {
      result += "is not";
      i++;
    }
    else {
      result += str.charAt(i);
    }
  }
  return result.substring(1,result.length());
} 

