import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int N= in.nextInt();
      int first_digit= N/100;
      System.out.print(first_digit);
	}
}