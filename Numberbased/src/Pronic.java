import java.lang.Math;
public class Pronic {

	public static void main(String[] args) {
		int a=200,i,j;
		for(i=1;i<=a;i++)
		{
			j=(int)Math.sqrt(i);
			if(j*(j+1)==i)
				{
					System.out.println(i);
				}
		}
		// TODO Auto-generated method stub

	}

}
