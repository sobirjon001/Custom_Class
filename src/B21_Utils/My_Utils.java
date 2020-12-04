package B21_Utils;

public class My_Utils {
  public static boolean isPrimeNumber(int num) {
    // Checks if given number is prime number
    boolean isPrime = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isPrime = false;
      }
    }
    if (num == 1) {
      isPrime = false;
    }
    return isPrime;
  }


  public static String numToWords(int var1) {
    // Author Serhii Tynovskyi
    String var2 = Integer.toString(var1);
    String var3 = "";
    int len = var2.length();
    if (len == 1) {
      var3 = oneNumber(var2);
    }
    if (len == 2) {
      var3 = twoNumbers(var2);
    }
    if (len == 3) {
      var3 = threeNumbers(var2);
    }
    return var3;
  }

  static String oneNumber(String var1) {
    String var2 = "";
    switch (var1) {
      case "0":
        var2 = "zero";
        break;
      case "1":
        var2 = "one";
        break;
      case "2":
        var2 = "two";
        break;
      case "3":
        var2 = "three";
        break;
      case "4":
        var2 = "four";
        break;
      case "5":
        var2 = "five";
        break;
      case "6":
        var2 = "six";
        break;
      case "7":
        var2 = "seven";
        break;
      case "8":
        var2 = "eight";
        break;
      case "9":
        var2 = "nine";
        break;
    }
    return var2;
  }

  static String twoNumbers(String var1) {
    String var2 = "";
    String var3 = "";
    if (var1.charAt(0) == '1') {
      switch (var1) {
        case "10":
          var2 = "ten";
          break;
        case "11":
          var2 = "eleven";
          break;
        case "12":
          var2 = "twelve";
          break;
        case "13":
          var2 = "thirteen";
          break;
        case "14":
          var2 = "fourteen";
          break;
        case "15":
          var2 = "fifteen";
          break;
        case "16":
          var2 = "sixteen";
          break;
        case "17":
          var2 = "seventeen";
          break;
        case "18":
          var2 = "eighteen";
          break;
        case "19":
          var2 = "nineteen";
          break;
      }
      return var2;
    } else {
      switch (var1.charAt(0)) {
        case '2':
          var3 = "twenty";
          break;
        case '3':
          var3 = "thirty";
          break;
        case '4':
          var3 = "forty";
          break;
        case '5':
          var3 = "fifty";
          break;
        case '6':
          var3 = "sixty";
          break;
        case '7':
          var3 = "seventy";
          break;
        case '8':
          var3 = "eighty";
          break;
        case '9':
          var3 = "ninety";
          break;
      }
      char var4 = var1.charAt(1);
      String var5 = Character.toString(var4);
      return var3 + " " + oneNumber(var5);
    }
  }

  static String threeNumbers(String var1) {
    char var2 = var1.charAt(0);
    char var3 = var1.charAt(1);
    char var4 = var1.charAt(2);
    String var5 = Character.toString(var2);
    String var6 = Character.toString(var3);
    String var7 = Character.toString(var4);
    return oneNumber(var5) + " hundred " + twoNumbers(var6 + var7);
  }
}
