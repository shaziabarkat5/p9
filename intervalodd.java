import java.util.*;
public class palin {

	public static void main(String[] args) {
		int a1,a2=0,j;
		
		System.out.println("enter the intervals :");
		Scanner a = new Scanner(System.in);
		a1 = a.nextInt();
		a2= a.nextInt();
		a.close();
		for(int i=a1+1;i<a2;i++)
		{
		
			if(j%2!=0)
			{
				System.out.println(i);
				
			}
		}
	}

}
