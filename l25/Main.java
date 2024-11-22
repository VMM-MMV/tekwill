public class Main {
    int val = 5;

    public static void main(String[] args) {
        MyClass myObject1 = new MyClass(1);
        MyClass myObject2 = new MyClass(2);
        System.out.println(myObject1.getMyVariable() + " " + myObject2.getMyVariable());
        myObject1.setMyVariable(5);
        System.out.println(myObject1.getMyVariable() + " " + myObject2.getMyVariable());

    }
}
