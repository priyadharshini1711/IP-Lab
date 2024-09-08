public class 002.Fibonacci {

  public static void main(String[] args) {
    int a = 0, b = 1, c = 0, n;
    for (n = 0; n < 5; n++) {
      System.out.println(c);
      c = a + b;
      a = b;
      b = c;
    }
  }
}

/*
Output:
0
1
2
3
5
*/
