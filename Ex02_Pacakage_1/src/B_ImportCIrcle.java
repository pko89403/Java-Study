import team1.Circle;

public class B_ImportCIrcle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRad(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c1.getArea());

        Circle c2 = new Circle();
        c2.setRad(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c2.getArea());
    }
}
