import java.util.Scanner;

public class FirstFit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of memory blocks: ");
        int m = sc.nextInt();
        int[] blockSize = new int[m];
        int[] blockAllocated = new int[m];

        System.out.println("Enter sizes of memory blocks:");
        for (int i = 0; i < m; i++) {
            blockSize[i] = sc.nextInt();
            blockAllocated[i] = -1;
        }

       
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] processSize = new int[n];
        int[] allocation = new int[n];

        System.out.println("Enter sizes of processes:");
        for (int i = 0; i < n; i++) {
            processSize[i] = sc.nextInt();
            allocation[i] = -1; 
        }

        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < m; j++) { 
                if (blockSize[j] >= processSize[i]) {
                    
                    allocation[i] = j;
                    blockSize[j] -= processSize[i]; 
                    break; 
                }
            }
        }

        
        System.out.println("\nProcess No.\tProcess Size\tBlock No.");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "\t\t" + processSize[i] + "\t\t");
            if (allocation[i] != -1)
                System.out.println((allocation[i] + 1));
            else
                System.out.println("Not Allocated");
        }
    }
}

