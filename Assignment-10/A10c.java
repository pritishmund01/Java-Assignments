class Student {
    int rollno;
    String name;
    Student() {
        this(69, "Pritish Mund");
    }
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    void show() {
        this.showname();
        System.out.println("Name:" + this.name);
        System.out.println("Roll Number:" + rollno);
    }
    void showname() {
        System.out.println("Students Details:");
    }
}

class A10c {
    public static void main(String args[]) {
        Student s = new Student();
        s.show();
    }
}
