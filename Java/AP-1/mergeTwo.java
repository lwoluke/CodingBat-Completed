public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] firstOrdered = new String[n];
  
  int posA = 0;
  int posB = 0;
  int resultsIndex = 0;
  
  while (resultsIndex < n) {
    
    if (a[posA].compareTo(b[posB]) < 0) {
      firstOrdered[resultsIndex] = a[posA];
      posA++;
    } else if (a[posA].compareTo(b[posB]) > 0) {
      firstOrdered[resultsIndex] = b[posB];
      posB++;
    } else {
      firstOrdered[resultsIndex] = a[posA];
      posA++;
      posB++;
    }
    resultsIndex++;
  }
  
  return firstOrdered;
}
