public class DemoWrapper {
    public static void main(String[] args) {
        
        // double -> Double
        Double double1 = 1.3d;
        Doube double2 = 1.3d;
        Double double3 = Double.valueOf(1.3d);
        Double double4 = new Double(1.3d);

        // boolean -> Boolean
        boolean isOkay = true;
        Boolean isPassed = true;
        Boolean isPassed2 = Boolean.valueOf(true); // self-box
        Boolean isPassed3 = new Boolean(true);
        
        // Long
        Long l1 = 10L; // 10L is long value, auto box
        // Long -> Integer, how to fix
        // Long -> long
        // Integer -> int 
        // int ,-> long
        Integer i10 = (int) (long) l1; // int  -> Integer (autobox)

        Long l2 = (long) (int) i10; // long -> Long (autobox)

}
}
