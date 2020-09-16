class PBoard {}
class CBoard extends PBoard {}

public class ClassCast {
    public static void main(String[] args) {
        PBoard sbd1 = new CBoard();
        CBoard sbd2 = (CBoard)sbd1; // 다시 대입한다. OK

        System.out.println("------------------");

        PBoard ebd1 = new PBoard();
        // 문법 구조 상으론 이상이 없다.
        // 컴파일 전이라 아직 모른다 ... 
        // CBoard ebd2 = (CBoard)ebd1; Exception!
    }
}