// 클래스에 메소드만 있는 경우
class Calc {
    int add(int a, int b) {
        return a + b;
    }
}

public class Calculation {
    public static void main(String[] args) throws Exception {
        // 객체 생성
        Calc calc = new Calc();
        // 메소드 호출
        int nReturn = calc.add(3, 9);

        System.out.println("3 + 9 = " + nReturn);
    }
}

