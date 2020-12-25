
public class L3_Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i,j,k,end=7,r=0,l;
	       for(i=1;i<=128;i+=i)
	       {
	           for(j=0;j<end;j++)
	           {
	               System.out.print("    ");
	           }
	           for(k=1;k<=i;k+=k)
	           {
	               System.out.printf("%4d",k);
	           }
	           for(l=r;l>0;l/=2)
	           {
	               System.out.printf("%4d",l);
	           }
	           System.out.println();
	           end--;
	           r=i;
	       }
	}

}
