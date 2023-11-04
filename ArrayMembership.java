public class ArrayMembership {
    public static void main(String[] args){



        int[] Figures = {2500, 2000, 3000, 4500, 1200};
        System.out.println(ArrayMember(Figures, 2000));
    }
    /*LOOP FROM first element in array TO last element in array
        BEGIN
        IF current element = item to find
        BEGIN
        EXIT loop and RETURN true
        END
        END
RETURN false*/
    public static boolean ArrayMember(int[] figuresIn, int figCheck){
        for (int i = 0; i < figuresIn.length; i++) {
            if (figuresIn[i] == figCheck) {
                return true;
            }
        }
        return false;
    }
}
