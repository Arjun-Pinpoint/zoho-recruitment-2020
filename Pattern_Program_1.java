import java.util.*;  
class Pattern_Program_1
{  
	public static void main(String args[])
	{  
		 Scanner scan=new Scanner(System.in);
		 
		 int n=scan.nextInt();
		 
		 int arr[][]=new int[n][n];
		 
		 int c=n;
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 arr[i][j]=c;
			 }
			 c-=1;
			 
			 int x=n;
			 for(int j=0;j<i;j++)
			 {
				 arr[i][j]=x;
				 x--;
			 }
		 }
		 
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}  
}  
