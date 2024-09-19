package coban;
import java.util.Scanner;

public class PtBacNhat {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if( a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
				System.out.println("Nghiem cua phuong trinh la x: " + ((double)-b/ (double)a));
		}
		scanner.close();	

		
		
	}
}
