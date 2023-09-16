// Right Half Pyramid Pattern.
package Pattern_Programs;
import java.util.*;
public class Pattern_Program {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.print("Enter the number of line :");
	  
		int i,j,n;
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
