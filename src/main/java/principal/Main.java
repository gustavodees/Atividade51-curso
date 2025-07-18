package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int negativo = 0;
    int n = input.nextInt();
    int [][] mat = new int[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            mat[i][j] = input.nextInt();
            if (mat[i][j] < 0) {
                negativo++;
            }
        }
    }



    System.out.println("Main Diagonal");
    for (int i = 0; i < n; i++) {
        System.out.print(mat[i][i] + " ");
    }
    System.out.println();
    System.out.println("Números negativos: "+ negativo);













    input.close();
    }
}