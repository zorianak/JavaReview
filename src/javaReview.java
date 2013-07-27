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

        System.out.println(ternaryOperator(Jim, Fred));
    }

    private static String ternaryOperator(int Jim, int Fred) {
        String equal = (Fred == Jim)? "They are equal" : "They are not equal";
        return equal;
    }
}
