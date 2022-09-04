package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
int j=1;
int  sum=0;
System.out.print(sum+" ");
for(int k=0;k<=11;k++)
{
	sum=i+j;
	i=j;
	j=sum;
	System.out.print(sum+" ");
}
	}

}
