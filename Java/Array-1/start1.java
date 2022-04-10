public int start1(int[] a, int[] b) {
  int c = 0;
  if (a.length != 0) {
    if (a[0] == 1) c++;
  }
  if (b.length != 0) {
    if (b[0] == 1) c++;
  }
  return c;
}
