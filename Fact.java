import java.util.Scanner;
public class Fact {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, fect=1;
		Scanner s=new Scanner(System.in);
	    System.out.println("Enter any number :");
		no=s.nextInt();
	    for(int i=1; i<=no; i++)
		{
		fect=fect*i;
		}
		System.out.println("Factorial is :" +fect);
		}
	
	}


