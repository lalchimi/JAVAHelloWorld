/**
* Main class of maven project.
*
*@author Jerome Labro
*
**/
public class Main {
  /**
  *Display Hello World on System and result of methods.
  *
  *@author Jerome Labro
  *
  **/
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println("Hello World");
    System.out.println(wordCounts("As you walk on the way, the way appears"));
    System.out.println(reverser("hello"));
    System.out.println(palindrome("radar"));
  }
  
  /**
  *Counts words in a string.
  *
  *@params String string to count
  *@author Jerome Labro
  *
  **/
  public static int wordCounts(String string) {
    return string.split("\\s").length;
  }

  /**
  *Reverse the characters in a string.
  *
  *@params String string to reverse
  *@author Jerome Labro
  *
  **/
  public static String reverser(String string) {
    String rev = new StringBuilder(string).reverse().toString();
    return rev;
  }

  /**
  *Check if the string is a palindrome or not.
  *
  *@params String string to check
  *@author Jerome Labro
  *
  **/
  public static boolean palindrome(String string) {
    String rev = new StringBuilder(string).reverse().toString();
    if (rev.equals(string)) {
      return true;
    } else {
      return false;
    }
  }
}
