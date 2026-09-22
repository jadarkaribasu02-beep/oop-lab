package programs;// folder 

import java.util.Scanner;

public class firstprgm {// just file name or class

    public static void main(String[] args){
        int n,i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the matrix order N");
        n = sc.nextInt();

        int mat1[][] = new int[n][n];
        int mat2[][] = new int[n][n];
        int res[][] = new int[n][n];

        System.out.println("enter the elements of matrix 1");
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                mat1[i][j] = sc.nextInt();
            }
            
        }
        System.out.println("enter the element of matrix 2");
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("the sum of the two matrices is:");
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();

    }

    
}


