
public class PyramidPriniting {

	public static void main(String[] args) {
		
		int n=4;

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
                System.out.print("* ");
            }
            System.out.println();
        }
	}

}
