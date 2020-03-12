package SirPackage;

import java.io.IOException;

public class ThreeRowsColumns {

	public static void main(String[] args)throws IOException {
		int i,j;
		int num =1;
		for(i=1;i<=3;i++)
		{
		for(j=1;j<=i;j++)
		{
		System.out.print ("*");
		num++;
		}
		System.out.println();		

	}

}
}

