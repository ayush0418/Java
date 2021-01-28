public class MatrixMultiplication
{  
   public static void main(String args[])
   {  
      //creating two matrices    
      int a[][]={{1,2,3},{2,3,1},{3,1,2}};    
      int b[][]={{1,2,3},{2,3,1},{3,1,2}};    
    
      //creating another matrix to store the multiplication of two matrices    
      int c[][]=new int[3][3];  
    
      //multiplying and printing multiplication of 2 matrices    
      for(int i=0;i<3;i++)
      {    
         for(int j=0;j<3;j++)
         {    
            c[i][j]=0;      
            for(int k=0;k<3;k++)      
            {      
               c[i][j]=c[i][j] + a[i][k]*b[k][j];      
            }
            //printing matrix element  
            System.out.print(c[i][j]+" ");   
         } 
         System.out.println();    
      }    
   }   
}