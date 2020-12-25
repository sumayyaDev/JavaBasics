import java.util.Scanner;
public class DisplayPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
        for(i=1;i<=7;i++)
        {
            
            for(j=1;j<=7-i;j++)
                System.out.print("  ");
            for(k=i;k>=1;k--)
            {   
                    System.out.print(k+" "); 
            }
            for(l=2;l<=i;l++)
            {   
                    System.out.print(l+" "); 
            }
            
            System.out.println();
        }
        
	}

}
