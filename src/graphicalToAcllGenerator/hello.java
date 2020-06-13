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
//     HI
        for (int i = 3; i < arr.length - 3; i++) {
            for (int f = 3; f < 6; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }
        for (int i = 3; i < arr.length - 3; i++) {
            for (int f = 11; f < 14; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }
        for (int i = 8; i < 10; i++) {
            for (int f = 6; f < 11; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }


        // I
        for (int i = 6; i < arr.length - 3; i++) {
            for (int f = 18; f < 21; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }


        // i
        for (int i = 3; i < arr.length - 3; i++) {
            for (int f = 27; f < 30; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }

        // l

        for (int i = 3; i < arr.length - 3; i++) {
            for (int f = 34; f < 37; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }

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

        for (int i = 10; i < arr.length - 3; i++) {
            for (int f = 43; f < 46; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }

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
        for (int i = 11; i < 12; i++) {
            for (int f = 54; f < 61; f++) {
                Array.setChar(arr[i], f, ' ');
            }
        }






            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < dlina; j++) {
                    System.out.print(arr[i][j]);
                }
                System.out.println();
            }


            LinkedList<Character> list = new LinkedList<Character>();
            char c = (char) (random.nextInt(26) + 'a');
            list.add(0, c);
            System.out.println(list.get(0));


        }

    }


