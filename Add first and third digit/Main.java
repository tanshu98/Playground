import java.util.Scanner;
class Main{
	public static void main (String[] args) {
			Scanner in = new Scanner(System.in);
      int N= in.nextInt();
      int first_digit= N/100;
      int third_digit=N%10;
      int sum= first_digit+third_digit;
      System.out.print(sum);
	}
}