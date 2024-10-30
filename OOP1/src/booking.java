class A {
    int a;

    static {
        System.out.println("Static Block A");
    }

    A() {
        System.out.println("A()");
    }

    A(int i) {
        System.out.println("A(int i)");
    }

    A(int i, int y) {
        System.out.println("A(int i, int y)");
    }
}

class B extends A {
    int b;

    static {
        System.out.println("Static Block B");
    }

    B() {
        super();
        System.out.println("B()");
    }

    B(int i) {
        super(10);  // Calls A(int i)
        System.out.println("B(int i)");
    }

    B(int i, int y) {
        super(10, 20);  // Calls A(int i, int y)
        System.out.println("B(int i, int y)");
    }
}

class Example {
    public static void main(String[] args) {
        new B();  // Creates an instance of B with the default constructor
        System.out.println("======================");
        // Creates an instance of B with B(int i, int y) constructor
    }
}
