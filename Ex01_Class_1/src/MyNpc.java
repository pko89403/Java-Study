class Npc {
    // Field - 데이터
    String name;
    int hp;

    // Method - 동작
    void say() {
        System.out.println("안녕하세요.");
    }
}

public class MyNpc {
    public static void main(String[] args) throws Exception {
        Npc saram1 = new Npc();
        saram1.name = "경비";
        saram1.hp = 100;

        System.out.println(saram1.name + " : " + saram1.hp);
        saram1.say();
    }
}
