public int[] front11(int[] a, int[] b) {
  if (a.length == 0 && b.length == 0) {
    return a;
  }
  if (a.length > 0 && b.length == 0) {
    return new int[] {a[0]};
  }
  if (a.length == 0 && b.length > 0) {
    return new int[] {b[0]};
  }
  return new int[] {a[0], b[0]};
}
