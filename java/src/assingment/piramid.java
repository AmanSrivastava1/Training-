package assingment;

public class piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=6-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
			
		}
		for(int i=1;i<5;i++)
		{
			System.out.print(" ");
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(5-i + " ");
			}
			System.out.println();
			
		}

	}

}

