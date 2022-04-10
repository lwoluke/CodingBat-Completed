public String fizzString2(int n) {
  if (n % 5 == 0 && n % 3 == 0) {
    return "FizzBuzz!";
  } else if (n % 3 == 0) {
    return "Fizz!";
  } else if (n % 5 == 0) {
    return "Buzz!";
  }
  String num = Integer.toString(n);
  return num + "!";
}
