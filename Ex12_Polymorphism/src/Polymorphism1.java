abstract class Calc {
    int a = 5;
    int b = 6;

    abstract void plus();
}

class MyCalc extends Calc {
    void plus() { System.out.println(a + b); }
    void minus() { System.out.println(a - b); }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        MyCalc myCalc1 = new MyCalc();
        myCalc1.plus();
        myCalc1.minus();
        
        // 하위 클래스 객체를 상위 클래스 객체에 대입
        Calc myCalc2 = new MyCalc();
        myCalc2.plus();
        // 다음 메소드는 Calc 설계도에 없다. 사용할 수 없다.
        // myCalc2.minus();
    }
}