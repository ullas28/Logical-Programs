import java.util.Scanner;
public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int counter=2,Result=0;
		for (counter = 2; counter <=a; counter++) {
			if ((a % counter) == 0){
				Result = Result + 1 ;
			}
		}
		 if (Result == 1) {
			System.out.println("It's a prime number");
		}
		else
			System.out.println("It's not a prime number");
	}

}
