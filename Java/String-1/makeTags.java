public String makeTags(String tag, String word) {
  
  String startingTag = "<" + tag + ">";
  String closingTag = "</" + tag + ">";
  return startingTag + word + closingTag;
}
