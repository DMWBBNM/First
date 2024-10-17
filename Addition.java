import java.util.Scanner;
public class Addition
{
	int add(int a, int b){
		return a + b;
	}
	
	public static void main(String []args) {
		//Get iP form user
		//Ref of Scanner
		Scanner sc = new Scanner(System.in);
		//System.out.println(sc);
		System.out.println("\n Please enter 2 no");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Addition addNumbers = new Addition();
		int sum = addNumbers.add(num1, num2);
		System.out.println("\n Sum =" + sum);
		sc.close();
		
	}
}