public String repeatSeparator(String word, String sep, int count) {
  String result = "";
  if (count == 0) {
      return result;
  } else if (count == 1) {
    return word;
  }
  for (int i = 0; i < count; i++) {
    if (i == count - 1) {
      result += word;
      break;
    }
    result += word + sep;
  }
  return result;
}
