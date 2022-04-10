public int loneSum(int a, int b, int c) {
  if (a == b && b != c) {
    return c;
    
  } else if (b == c && b != a) {
    return a;
    
  } else if (a == c && a != b) {
    return b;
    
  } else if (a == b && a == c) {
    return 0;
    
  } else {
    return a + b + c; 
  
  }
}
