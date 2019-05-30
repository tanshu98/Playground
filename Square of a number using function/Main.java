import java.util.Scanner;
class Main
{
  public static int square_of_nos(int n)
  {
    int son= n*n;
    return son;
  }
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int son=square_of_nos(n);
      System.out.print(son);
	} 
}
