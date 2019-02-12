package PyramidPatterns;

/*

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5

*/

public class Pattern4 {
    public static void main(String[] args) {
        int count;
        for(int i=0;i<5;i++) {
            count = 1;
            for(int j=0;j<(i+1);j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
