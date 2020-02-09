package lesson5;

public class Main {
    public static void main(String[] args) {
        Judge jankenMaster = new Judge();

        Player murata = new Murata("村田");
        Player yamada = new Yamada("山田");

        jankenMaster.startJanken(murata, yamada);
    }
}
