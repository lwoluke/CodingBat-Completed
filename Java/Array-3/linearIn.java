public boolean linearIn(int[] outer, int[] inner) {
  int count = 0;
  
  if (inner.length == 0) return true;
  
  for (int i = 0; i < outer.length; i++) {
    if (outer[i] == inner[count]) {
      count++;
    }
    if (count == inner.length) {
      return true;
    }
  }
  
  return false;
}
