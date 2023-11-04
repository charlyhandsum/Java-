public class AnonymousClass {
    public static void main(String[] args) {

        Oblong oblong1 = new Oblong(23, 23);

        Checkable oblongTest1 = new Checkable() {
            @Override
            public boolean check() {
                if (oblong1.getHeight() > 0 && oblong1.getLength() > 0) {
                    return true;
                }
                return false;
            }
        };

        Checkable oblongTest2 = new Checkable() {
            @Override
            public boolean check() {
                if (oblong1.getHeight() != oblong1.getLength()) {
                    return true;
                }
                return false;
            }
        };

        System.out.println("this Oblong "+ checkValidity(oblongTest1));
        System.out.println("this Oblong "+ checkValidity(oblongTest2));

    }
        public static String checkValidity (Checkable oblong){
            if (oblong.check()) {
                return "Is Valid";
            }
            return "Is Invalid";
        }
    }
