package task;


public class Matrix {
	
public static void main(String[] args)
{

	int j,i;
		int a[][]= {{2,3},{2,4}};
		int b[][]={{2,5}, {2,5}};
		int c[][]=new int[2][2];
		for( i=0;i<2;i++)
		{
			for( j=0;j<2;j++)
			{ 
				c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]);
             }
			}
	
			

}
}
