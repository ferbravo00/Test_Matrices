/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmatrices;

/**
 *
 * @author Alumno Mañana
 */
public class TestMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat [][] = new int [5][5];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=alea(1,9);
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static int alea(int li, int ls){//función de JAVA
        return (int)((Math.round(Math.random()*(ls-li))+li));
    }
}
