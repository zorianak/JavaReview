/**
 * Created with IntelliJ IDEA.
 * User: Kim
 * Date: 7/26/13
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class javaReview {

    public static void main(String[] args)  {

        int Jim = 1;
        int Fred = 0;
        int Cats = -1;

        System.out.println(ternaryOperator(Jim, Fred));

        System.out.println(nullCoalescing(Jim, Fred, Cats));
    }

    private static String ternaryOperator(int Jim, int Fred) {
        String equal = (Fred == Jim)? "They are equal" : "They are not equal";
        return equal;
    }

    private static int nullCoalescing(int Jim, int Fred, int Cats) {
        // Null coalescing operators actually don't exist in java.  The closest we can accomplish is with ternary
        // expressions.

        int notCoalescing = 3;

        // This will contain our passed values
        int testArray[] = { Jim, Fred, Cats};

        //use a doWhile for the first NOT NULL part of the array
        int i = 0;
        int arrayOutput = testInt(testArray[i]);
        System.out.println(testArray[i]);
        while(arrayOutput == 1) {
            System.out.println("At " + i + " notCoalescing equals " + testArray[i]);
            notCoalescing = testArray[i];

            // since the array type is INT, we will theoretically NEVER repeat this loop. However, we still want to
            // increase i in the offchance that we do.
            i++;
            return notCoalescing;

        }


        return -2;
    }

    private static int testInt(int theInput) {
    try {
        String theOutput = Integer.toString(theInput);
        return 1;
    } catch(Exception e) {
        System.out.println("Exception when converting int to string: " + e);
        return 0;
    }
    }
}
