package graphicalToAcllGenerator;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.Random;

public class hello {
    public static void main(String[] args) {
        Random random = new Random();
int dlina = 120;

        char arr[][] = new char[17][dlina];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < dlina; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                arr[i][j] = c;
            }

        }

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

