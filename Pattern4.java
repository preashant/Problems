package Problems;
/*n *        *
   **      **
   ***    ***
   ****  ****
   **********
   */
public class Pattern4 {
public static void main(String[] args) {
	 int fStar=0;
     int space=8;
     int lStar=0;
     for(int i=0;i<5;i++)
     {
         for(int j=0;j<=fStar;j++)
         {
             System.out.print("*");
         }
         for(int j=fStar+1;j<=space;j++)
         {
             System.out.print(" ");
         }
         for(int j=0;j<=lStar;j++)
         {
             System.out.print("*");
         }
         space--;
         fStar++;
         lStar++;
         System.out.println();
     }
}
}
