package graphicalToAcllGenerator;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Random;

public class hello {
    public static void main(String[] args) {
        Random random = new Random();
        int dlina = 69;

        char arr[][] = new char[17][dlina];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < dlina; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                arr[i][j] = c;
            }

        }
//     H
        drow_straight(arr, 3,3,3,6);
        drow_straight(arr,3,3,11,14);
        drow_straight(arr, 8,7,6,11);
        // i
        drow_straight(arr, 6,3,18,21);

        // I
        drow_straight(arr, 3, 3, 27, 30);
        // l
        drow_straight(arr, 3,3, 34, 37);
        // y
          int t = 40;
        for(int i = 6; i < 10; i++){
            for(int z = t; z < t+3; z++){
                Array.setChar(arr[i], z, ' ');
                    }
                 t++;
                }
        int s = 48;
        for(int i = 6; i < 9; i++){
            for(int z = s; z > s-3; z--){
                Array.setChar(arr[i], z, ' ');
            }
            s--;
        }
        drow_straight(arr,10,3,43,46);

        // A

        int q = 58;
        for(int i = 6; i < arr.length - 3; i++){
            for(int z = q; z > q-3; z--){
                Array.setChar(arr[i], z, ' ');
            }
            q--;
        }

        int w = 56;
        for(int i = 6; i < arr.length - 3; i++){
            for(int z = w; z < w+3; z++){
                Array.setChar(arr[i], z, ' ');
            }
            w++;
        }
        drow_straight(arr, 11, 5, 54, 61);




            // выыод на консоль

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < dlina; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }

        }


        // Фунция прямой линии
        public static void drow_straight (char a[][], int i, int leg, int f, int fe){
         int l = leg;
        for (int iv = i; iv < a.length - l; iv++) {
                for (int fu = f; fu < fe; fu++) {
                    Array.setChar(a[iv], fu, ' ');
                }
            }

        }

    }


