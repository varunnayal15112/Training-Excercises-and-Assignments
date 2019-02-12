package StringVsStringBufferVsStringBuilder;

/*

    String -> Immutable Object
    String str = "Varun"; -> finds the same value string object in string pool and get that reference if found otherwise create new object in string pool
    String str = new String("Varun"); -> explicitly creates new object in heap area
    '+' operator concates two string but internally uses StringBuffer or StringBuilder only

    For String Manipulation following classes are used : (Mutable ones)
        - StringBuffer
        - STringBuilder
    StringBuffer -> Provides Synchronized and Thread Safety
                 -> Used in Multi-Threaded Environment
    StringBuilder -> Faster as compared to StringBuffer
                  -> Used in single threaded environment or where Thread Safety is not required

    Conversions :
    1. From String to StringBuffer or String Builder
       Provides the String Object to StringBuffer or StringBuilder Constructors

    2. From StringBuffer or StringBuilder to String
       Using toString() method

    3. From StringBuffer to StringBuilder or vice-versa
       Indirect Trick Approach
       No Direct way
       First Converts StringBuffer to String using toString() method and after that String to String Builder or vice-versa

*/

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args) {
        String string = new String("Varun");
        StringBuffer stringBuffer = new StringBuffer("Nayal");
        StringBuilder stringBuilder = new StringBuilder("Hashmap");

        System.out.println("String : " + string);
        System.out.println("StringBuffer : " + stringBuffer);
        System.out.println("StringBuilder : " + stringBuilder);

        string = string + " from Jodhpur";
        stringBuffer.append(" from Rajasthan");
        stringBuilder.reverse();

        System.out.println("String : " + string);
        System.out.println("StringBuffer : " + stringBuffer);
        System.out.println("StringBuilder : " + stringBuilder);

        StringBuffer sbr = new StringBuffer(string);
        StringBuilder sbl = new StringBuilder(string);
        System.out.println("StringBuffer : " + sbr);
        System.out.println("StringBuilder : " + sbl);

        String newStrVariable = stringBuffer.toString();
        System.out.println("String : " + newStrVariable);

        newStrVariable = stringBuilder.toString();
        System.out.println("String : " + newStrVariable);
    }
}
