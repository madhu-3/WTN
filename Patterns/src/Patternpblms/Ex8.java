package Patternpblms;

public class Ex8 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
