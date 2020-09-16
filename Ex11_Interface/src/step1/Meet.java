package step1;

interface Greet {
    void greet();
}

interface Bye {
    void bye();
}

class Morning implements Greet, Bye {

    public void bye() {
        // TODO Auto-generated method stub
        System.out.println("안녕히 계세요.");
    }

    public void greet() {
        // TODO Auto-generated method stub
        System.out.println("안녕 하세요.");
    }

}


public class Meet {
    public static void main(String[] args) {
        Morning morning = new Morning();
        morning.greet();
        morning.bye();
    }
}