package mock_Interview.practice_1;

import java.util.Scanner;

public class Prime_no {
	
	public static void main(String[] args) {
		int num=15,count;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				break;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
		}	
	}
}
