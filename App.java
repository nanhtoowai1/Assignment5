import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter row to calculate:");
		int row=input.nextInt();
		
		int col=(row*2)-1;
		int mid=(col+1)/2;
		
		int inc=mid,dec=mid;
		for(int i=1;i<=row;i++) {
			int count=1;
			for(int j=1;j<=col;j++) {
				if(j<=inc && j>=dec) {
					System.out.print(count+" ");
					count++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			inc++;
			dec--;
		}
		

	}

}
