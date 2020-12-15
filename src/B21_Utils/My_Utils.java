package B21_Utils;

import java.util.ArrayList;

public class My_Utils {
  public static boolean isPrimeNumber(int num) {
    // Checks if given number is prime number
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

  public static ArrayList<Integer> primeNumArrayList(int n){
    ArrayList<Integer> result = new ArrayList<>();
    for (int i=1; i<(n+1); i++){
      if(isPrimeNumber(i)){
        result.add(i);
      }
    }
    return result;
  }

  public static ArrayList<Integer> fibonachiArrayList(int n){
    ArrayList<Integer> result = new ArrayList<>();
    int n1 = 1, n2 = 1;
    while (n2 < n){
      result.add(n1 + n2);
      n1 = n2;
      n2 = result.get(result.size()-1);
    }
    return result;
  }

  public static String numToWords(int num) {
    // Author Serhii Tynovskyi
    String numString = Integer.toString(num);
    String result = "";
    int len = numString.length();
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
    String result1 = "";
    String result2 = "";
    if (numString.charAt(0) == '1') { // teen numbers
      switch (numString) {
        case "10":
          result1 = "ten";
          break;
        case "11":
          result1 = "eleven";
          break;
        case "12":
          result1 = "twelve";
          break;
        case "13":
          result1 = "thirteen";
          break;
        case "14":
          result1 = "fourteen";
          break;
        case "15":
          result1 = "fifteen";
          break;
        case "16":
          result1 = "sixteen";
          break;
        case "17":
          result1 = "seventeen";
          break;
        case "18":
          result1 = "eighteen";
          break;
        case "19":
          result1 = "nineteen";
          break;
      }
      return result1;
    } else {
      switch (numString.charAt(0)) { // decimal numbers
        case '2':
          result2 = "twenty";
          break;
        case '3':
          result2 = "thirty";
          break;
        case '4':
          result2 = "forty";
          break;
        case '5':
          result2 = "fifty";
          break;
        case '6':
          result2 = "sixty";
          break;
        case '7':
          result2 = "seventy";
          break;
        case '8':
          result2 = "eighty";
          break;
        case '9':
          result2 = "ninety";
          break;
      }
      String numStringLast = numString.substring(1);
      return result2 + " " + oneNumber(numStringLast); // + single number
    }
  }

  private static String threeNumbers(String numString) {
    String num1 = numString.substring(0, 1); // first number - hundreds
    String num2 = numString.substring(1); // two last numbers - decimal and single
    return oneNumber(num1) + " hundred " + twoNumbers(num2);
  }
}
