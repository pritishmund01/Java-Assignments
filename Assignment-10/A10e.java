class P1 {
    int a;
}

class P2 extends P1 {
    int b;
}

class child extends P2 {
    void input() {
        a = 5;
        b = 10;
    }
}

class D extends child {
    void sum() {
        System.out.println(a + b);
    }
}

class A10e {
    public static void main(String args[]) {
        D obj = new D();
        obj.input();
        obj.sum();
    }
}
