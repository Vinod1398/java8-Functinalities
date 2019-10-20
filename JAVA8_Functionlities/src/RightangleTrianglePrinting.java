
public class RightangleTrianglePrinting {

	public static void main(String[] args) {
		
		int n=5;

		for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
		for (int i=1; i<=n; i++) 
        { 
            // Print space in decreasing order 
            for (int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
		
		for (int i=1; i<=n; i++) 
        { 
            // Print star in decreasing order 
            for (int k=n; k>=i; k--)
            {
                System.out.print("*");
            }
            // Print space in increasing order
            for (int j=1; j<i; j++)
            {
                System.out.print(" ");
            }
            
            System.out.println();
        }
	}

}
