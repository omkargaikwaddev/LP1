import java.util.*;

class FCFF{
  public static void main(String args[])
  {
  
    Scanner sc = new Scanner(System.in);
  System.out.println("Enter number of memory blocks:");
  int m = sc.nextInt();
  
  int blockSize[] = new int[m];
  
  System.out.println("Enter size of each memory block:");
  for(int i =0;i<m;i++)
  {
    System.out.print("Block"+(i+1)+":");
    blockSize[i] = sc.nextInt();
  }
  System.out.println("Enter number of processes:");
  int n = sc.nextInt();
  int[] processSize = new int[n];
  int[] allocation = new int[n];
  
  System.out.println("Enter size of each process:");
  for(int i=0;i<n;i++)
  {
   System.out.println("process"+(i+1)+": ");
   processSize[i] = sc.nextInt();
   allocation[i] = -1;
  }
  
  for(int i=0;i<n;i++)
  {
   for(int j=0;i<m;j++)
   {
    if(blockSize[j]>=processSize[i])
    {
     allocation[i] = j;
     blockSize[j] -= processSize[i];
     break;
    }
   }
  }
System.out.println("Process NO.\tProcess Size\tBlock Allocated");
for(int i =0;i<n;i++)
{
 System.out.print(" " + (i+1) + "\t\t" + processSize[i]+"\t\t");
 if(allocation[i] != -1)
 {
  System.out.println(allocation[i]+1);
 }
 else{
  System.out.println("Not Allocated");
 }
}
}
  }

