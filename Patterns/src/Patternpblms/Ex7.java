package Patternpblms;

public class Ex7 {

	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int i,j,x=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
