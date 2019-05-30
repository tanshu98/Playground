import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int N= in.nextInt();
      int second_last_digit= (N/10)%10;
      System.out.print(second_last_digit);
	}
}