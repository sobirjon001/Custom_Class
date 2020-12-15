package B21_Utils;

import java.util.ArrayList;

public class My_Utils {

  // Checks if given number is prime number
  public static boolean isPrimeNumber(int num) {
    boolean isPrime = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    if (num == 1) {
      isPrime = false;
    }
    return isPrime;
  }

  // Creates Integer ArrayList of prime numbers sequence with passed through upper limit
  public static ArrayList<Integer> primeNumArrayList(int n){
    ArrayList<Integer> result = new ArrayList<>();
    for (int i=1; i<=n; i++){
      if(isPrimeNumber(i)){
        result.add(i);
      }
    }
    return result;
  }

  // Creates Integer ArrayList of Fibonacci sequence with passed through upper limit
  public static ArrayList<Integer> fibonacciArrayList(int n){
    ArrayList<Integer> result = new ArrayList<>();
    int n1 = 0, n2 = 1;
    while (n2 < n){
      result.add(n1 + n2);
      n1 = n2;
      n2 = result.get(result.size()-1);
    }
    return result;
  }

  // Author Serhii Tynovskyi
  // Creates word version of numbers with passed through number in String
  // for now only accepts up to 999, work in progress
  public static String numToWords(String numString) {
    System.out.println(numString);
    String result = "";
    while (numString.charAt(0)=='0'){
      numString = numString.substring(1);
    }
    int len = numString.length();
    System.out.println(numString);
    System.out.println(numString.length());
    if (len == 1) { // single numbers
      result = oneNumber(numString);
    }
    if (len == 2) { // decimal numbers
      result = twoNumbers(numString);
    }
    if (len == 3) { // hundred numbers
      result = threeNumbers(numString);
    }
    return result;
  }

  private static String oneNumber(String numString) {
    String result = "";
    switch (numString) {
      case "0":
        result = ""; // we can't say twenty zero -> can't say zero at all
        break;
      case "1":
        result = "one";
        break;
      case "2":
        result = "two";
        break;
      case "3":
        result = "three";
        break;
      case "4":
        result = "four";
        break;
      case "5":
        result = "five";
        break;
      case "6":
        result = "six";
        break;
      case "7":
        result = "seven";
        break;
      case "8":
        result = "eight";
        break;
      case "9":
        result = "nine";
        break;
    }
    return result;
  }

  private static String twoNumbers(String numString) {
    String result = "";
    if (numString.charAt(0) == '1') { // teen numbers
      switch (numString) {
        case "10":
          result = "ten";
          break;
        case "11":
          result = "eleven";
          break;
        case "12":
          result = "twelve";
          break;
        case "13":
          result = "thirteen";
          break;
        case "14":
          result = "fourteen";
          break;
        case "15":
          result = "fifteen";
          break;
        case "16":
          result = "sixteen";
          break;
        case "17":
          result = "seventeen";
          break;
        case "18":
          result = "eighteen";
          break;
        case "19":
          result = "nineteen";
          break;
      }
      return result;
    } else {
      switch (numString.charAt(0)) { // decimal numbers
        case '2':
          result = "twenty";
          break;
        case '3':
          result = "thirty";
          break;
        case '4':
          result = "forty";
          break;
        case '5':
          result = "fifty";
          break;
        case '6':
          result = "sixty";
          break;
        case '7':
          result = "seventy";
          break;
        case '8':
          result = "eighty";
          break;
        case '9':
          result = "ninety";
          break;
      }
      String numStringLast = numString.substring(1);
      return result + " " + oneNumber(numStringLast); // + single number
    }
  }

  private static String threeNumbers(String numString) {
    String num1 = numString.substring(0, 1); // first number - hundreds
    String num2 = numString.substring(1); // two last numbers - decimal and single
    return oneNumber(num1) + " hundred " + twoNumbers(num2);
  }
}
