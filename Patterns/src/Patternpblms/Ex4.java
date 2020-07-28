package Patternpblms;

public class Ex4 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(n-i+1+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
