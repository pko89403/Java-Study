public class A_CircleUsing {
    public static void main(String[] args) {
        com.company.area.Circle c1 = new com.company.area.Circle();
        c1.setRad(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c1.getArea());

        com.company.length.Circle c2 = new com.company.length.Circle();
        c2.setRad(3.5);
        System.out.println("반지름 3.5 원 넓이 : " + c2.getPerimeter());
    }
}