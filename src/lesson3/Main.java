package lesson3;

public class Main {
    public static void main(String[] args) {
        Judge jankenMaster = new Judge();

        Player tanaka = new Player("田中");
        Player suzuki = new Player("鈴木");

        jankenMaster.startJanken(tanaka, suzuki);
    }
}
