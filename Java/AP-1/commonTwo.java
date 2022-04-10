public int commonTwo(String[] a, String[] b) {

  int aIndex = 0;
  int bIndex = 0;
  int count = 0;

  while(aIndex < a.length && bIndex < b.length) {
        if(aIndex > 0 && a[aIndex-1].equals(a[aIndex])) {
            aIndex++;
        } else if(a[aIndex].equals(b[bIndex])) {
            count++;
            aIndex++;
            bIndex++;
        } else if(a[aIndex].compareTo(b[bIndex]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }
    }
  return count;
}
