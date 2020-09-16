class Animal {
    String name;
    int age;

    void printPet() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}

class Dog extends Animal {
    String variety;

    // 함수의 오버라이딩
    void printPet() {
        super.printPet(); // 부모 클래스의 메소드가 호출이 된다.
        System.out.println("종류 : " + variety);
    }
}


public class Pet {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "진돌이";
        dog.age = 5;
        dog.variety = "진돗개";
        dog.printPet();
    }
}