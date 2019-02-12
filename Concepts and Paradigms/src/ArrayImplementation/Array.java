package ArrayImplementation;

public class Array {
    public static void main(String[] args) {

        int[] integerArray1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.print("Length of integerArray : " + integerArray1.length);
        System.out.println();
        for (int i = 0; i < integerArray1.length; i++) {
            System.out.print(integerArray1[i] + " ");
        }
        System.out.println();
        int[] integerArray2;
        integerArray2 = new int[]{1, 2, 3, 4, 5};
        System.out.print("Length of integerArray : " + integerArray2.length);
        System.out.println();
        for (int i = 0; i < integerArray2.length; i++) {
            System.out.print(integerArray2[i] + " ");
        }
        System.out.println();
        //Integer ArrayImplementation.Array of length zero !
        int[] integerArray3 = new int[0];
        System.out.print("Length of integerArray : " + integerArray3.length);
        System.out.println();

        String[] names = new String[]{"Varun", "Nayal", "Vicky", "humblefool", "hashmapInc"};
        System.out.println(names.length);
        for (int i =0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
}