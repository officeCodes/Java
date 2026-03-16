package rubbish;

public class Local_and_GlobalVariables {
    //LOCAL VARIABLES
    // 1. once local variable is declared it has to be INITIALIZED before utilization
        // otherwise it will throw Compile-Time-Error
        // Reason: Local Variables Are Stored in Stack Memory
            //
            //Local variables are stored in the stack.
            //
            //The stack does not assign default values automatically.
            //
            //Therefore Java requires explicit initialization.
    // 2. Local Variables doesn't have default value.
    // 3. Local variables can't be classified as static and non-static.
    public static void main(String[] args) {
        int a;
        a=23;
        System.out.println(a);
    }
}

class Global_VARIABLES{
    // GLOBAL VARIABLES
    // 1. Global variables can be classified as static/non-static
    // 2. Once global variables are declared it can't be initialize/re-initialize immediately in the next line or it will throw error
    // 3. Global varibles has default value
    static void global_var() {

    }
}