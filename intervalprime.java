public class palin {

	public static void main(String[] args) {
		int a1,a2=0,flag =0,i,j;
		System.out.println("enter the intervals :");
		Scanner a = new Scanner(System.in);
		a1 = a.nextInt();
		a2= a.nextInt();
		a.close();
		for(i = a1+1; i < a2; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i);
            }

	}
}}