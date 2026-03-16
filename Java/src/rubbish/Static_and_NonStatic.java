package rubbish;

public class Static_and_NonStatic {
    // static
    // 1. Static is associated with the class
    // 2. static is single copy
    // 3. all the static methods are get stored inside STATIC POOL AREA(spa)
    // 4. class loader will take all static members and store inside SPA
    static void main() {

    }
    // Non-static (page-47)
    // 1. Non-static is always associated with the object
    // 2. Non-static is always multiple copy
    // 3. All the non-static members of the class will get stored inside heap-memory.
    // 4. new ClassConstructor()
        // 4.1) new keyword is used to >> "create random memory space inside heap memory"
        // 4.2) Constructor() >> "it will initialize all the non-static members of the class into the heap memory."
}
