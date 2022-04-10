public String fizzString(String str) {
  boolean f = str.startsWith("f");
  boolean b = str.endsWith("b");
  
  if (f && b) return "FizzBuzz";
  if (f) return "Fizz";
  if (b) return "Buzz";
  return str;
}
