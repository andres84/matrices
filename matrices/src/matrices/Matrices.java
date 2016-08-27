package matrices;

import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        //llenado de la matriz
        for (int i = 0; i < 3; i++) {//filas

            for (int j = 0; j < 3; j++) {//columnas

                System.out.println("Ingrese elemento para la pocision fila: " + i + " columna " + j);

                numeros[i][j] = sc.nextInt();

            }

        }
        /*//impresion de la matriz
        for (int i = 0; i < 3; i++) {//filas

            for (int j = 0; j < 3; j++) {//columnas

                System.out.print(numeros[i][j]+"\t");

            }
            
            System.out.print("\n");

        }*/
        //impresion de la diagonal
        /*for (int i = 0; i < 3; i++) {//filas

            for (int j = 0; j < 3; j++) {//columnas

                if(i == j){
                
                    System.out.print(numeros[i][j]);
                }else{
                    
                    System.out.print(0);
                    
                }
                    
            }
            
            System.out.print("\n");

        }*/
        //impresion columna
        for (int i = 0; i < 3; i++) {//filas

            for (int j = 0; j < 3; j++) {//columnas

                if(j == 0){
                
                    System.out.print(numeros[i][j]);
                }else{
                    
                    System.out.print(0);
                    
                }
                    
            }
            
            System.out.print("\n");

        }
        
    }

}
