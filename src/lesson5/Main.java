package lesson5;

public class Main {
    public static void main(String[] args) {
        Judge jankenMaster = new Judge();

        Player murata = new Murata("村田");
        Tactics murataTactics = new StoneOnlyTactics();
        murata.setTactics(murataTactics);

        Player yamada = new Yamada("山田");
        Tactics yamadaTactics = new CyclicTactics();
        yamada.setTactics(yamadaTactics);

        jankenMaster.startJanken(murata, yamada);
    }
}
