import java.util.Arrays;

public class ArrayMaximum {
    public static void main (String[] args){
        int[] MaxNumbers = {31, 40, 42, 90, 35};
        System.out.println(MaxNum(MaxNumbers));



    }

    // creating a method that will get the maximum value in an array
  /*  SET result TO first value in array
    LOOP FROM second element in array TO last element in array
            BEGIN
    IF current element > result
            BEGIN
    SET result TO current element
            END
    END
    RETURN result*/
    public static int MaxNum(int[] numberIn){
    int result = numberIn[0];
        for (int i = 1; i < numberIn.length; i++)
        {
            if (numberIn[i] > result){
                result = numberIn[i];
            }

        }
    return result;
    }
}
