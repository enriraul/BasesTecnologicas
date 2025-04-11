public class Arreglos {
    public static void main(String[] args) {
        int[] arreglo ={1,2,3,4,5,6,7,8,9};

        System.out.println("Primer elemento del arreglo: "+arreglo[0]);
        System.out.println("El último elemento del arreglo: "+arreglo[6]);
        /* 
        for(int i=0; i< arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
        */
        
        int[] numeros = new int[10];

        for (int i=0; i< 10; i++) {
            numeros [i]= (i*10) + 3;
        }


        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};

        /*
         *  {0,1,2,3,4,5}
         * 
         *     0      1    2 
         * {{0,1,2}{   }{   }}
         * 
         */

        System.out.println(matriz[1][1]);


        /*
         * 
         *  Dado un arreglo de 9 elementos, y una matriz de 3x3
         *  Insertar los elementos del arreglo en la matriz. 
         * 
         */

        int[][] matriz2 = new int[3][3];
        int[] arreglo1 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i< 3;i++) {
            for (int j = 0; j < 3; j++) {
                //System.out.println("pos i: "+i + " pos j: "+ j + " pos arreglo: "+( (i*3) + j));
                //System.out.println("pos i: "+i + " pos j: "+ j + " valor arreglo: "+arreglo1[ ( (i*3) + j)]);
                matriz2[i][j] = arreglo1[ ( (i*3) + j)];
            }
        }
        int  k =0;
        for (int i = 0; i< 3;i++) {
            for (int j = 0; j < 3; j++) {
                //matriz2[i][j] = arreglo1[k];
                k++;
            }
        }


    }
}
