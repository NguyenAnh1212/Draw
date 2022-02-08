public class Draw {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 7; i >0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
//        int k =0;
//        for (int i = 1; i <= 5; i++, k = 0) {
//            for (int space = 1; space <= 5 - i; space++) {
//                System.out.print("  ");
//            }
//            while (k != 2 * i -1 ) {
//                System.out.print("* ");
//                ++k;
//            }
//            System.out.println();
//        }
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        
    }
}
