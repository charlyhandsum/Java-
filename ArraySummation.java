public class ArraySummation {
    public static void main(String[] args){



        int[] Figures = {2500, 2000, 3000, 4500, 1200};
        System.out.println(ArraySummation(Figures));
    }
    /*SET total TO zero
            LOOP FROM first element in array TO last element in array
                    BEGIN
            SET total TO total + value of current element
                    END
            RETURN total*/
    public static int ArraySummation(int[] figuresIn){
        int total = 0;
        for (int i = 0; i < figuresIn.length; i++) {
            total = total + figuresIn[i];
        }
        return total;
    }
}
