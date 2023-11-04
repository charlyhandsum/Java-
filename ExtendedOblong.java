public class ExtendedOblong extends Oblong {

    private char symbol;

    public ExtendedOblong(double length, double height, char symbol){
      super(length, height);
      this.symbol = symbol;
    }

    public void setSymbol(char symbol){
        this.symbol = symbol;
    }

    public String draw(){
        String s = "";
        int l, h;

        //Type Casting
        l = (int) getLength();
        h = (int) getHeight();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < l; j++) {
                s = s + symbol;
            }
                s = s + '\n';
        }
        return s;
    }
}
