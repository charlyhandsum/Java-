public class ArraySearch {
    public static void main(String[] args){
        int[] SerialNumbers = {001, 002, 017, 005, 010};
        System.out.println(searchArray(SerialNumbers, 010));

    }

    static int searchArray(int[] Numbers, int SerialNo){
        for (int i = 0; i < Numbers.length; i++) {
            if (Numbers[i] == SerialNo)
            {
                return i;
            }
        }
        return -999;
    }
}
