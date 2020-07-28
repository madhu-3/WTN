package Patternpblms;

public class Ex6 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=n-i+1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
