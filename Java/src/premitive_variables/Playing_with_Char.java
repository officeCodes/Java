package premitive_variables;

public class Playing_with_Char {
    public static void main(String[] args) {
        char initial = 'z';
        System.out.println((int) Character.MIN_VALUE);
        System.out.println((int) Character.MAX_VALUE);
        System.out.println((int) 'z');
        System.out.println((char) 10084);
        char hindiChar = 2309;
        System.out.println(hindiChar);
//      //---------------------------
        // unicode representation
        char heart = '\u2764'; // hexadecimal uicode characters
        System.out.println(heart);
//      //---------------------------
        // ascii characters 0 to 127
//        https://www.asciitable.com/

        // widening conversion / implicite conversion / automatic conversion
        char charVal = 'A';
        int intValOfChar = charVal; // widening conversion from char to int


    }
}
