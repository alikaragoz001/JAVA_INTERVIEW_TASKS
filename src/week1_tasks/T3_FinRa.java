package week1_tasks;

import javax.imageio.stream.ImageInputStream;

public class T3_FinRa {

    public static void fiNra() {
        for (int num = 1; num <= 30; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA");
            }
            if (num % 3 == 0) {
                System.out.println("FIN");
            }
            if (num % 5 == 0) {
                System.out.println("RA");
//            } else {
//                System.out.println(num + " ");
            }
        }
    }
        public static void main (String[]args){

            fiNra();
        }
    }

