public List<String> noX(List<String> strings) {
  return strings.stream()
    .map(x -> x.replaceAll("x", ""))
    .collect(Collectors.toList());
}
