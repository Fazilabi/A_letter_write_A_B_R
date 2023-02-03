public class Main {
    public static void main(String[] args) {

        // write A with stars
        String[][] letterA = new String[6][4];
        for (int i = 0; i < letterA.length; i++) {
            for (int k = 0; k < letterA[i].length; k++) {

                if (i == 0 || i == 2) {

                    System.out.print(" * ");
                } else if (k == 0 || k == 3) {

                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        System.out.println("=============================");
        //write B with stars
        String[][] letter_B = new String[6][4];
        for (int i=0;i<letter_B.length;i++){
            for (int k=0;k<letter_B[i].length;k++){
                if (i==0||i==2||i==5){
                    System.out.print(" * ");
                } else if (k==0||k==2) {
                    System.out.print(" * ");
                }else {
                    System.out.print("       ");
                }
            }
            System.out.println();
        }




        System.out.println("=============================");

        //write R with stars

        String[][] letterR = new String[6][3];
        for (int i = 0; i < letterR.length; i++) {
            for (int k = 0; k < letterR[i].length; k++) {
                if (i == 0 || i == 3) {
                    System.out.print(" * ");
                } else if (k == 0 || k == 2) {
                    System.out.print(" * ");
                } else {
                    if (i == 4 || k == 2) {
                        continue;
                    }
                    System.out.print("    ");
                }
            }
            System.out.println();
        }


    }
}
