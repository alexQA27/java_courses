public class CatCreation {
    public static void main(String[] args) {
        Cat alice = new Cat("Алиса", "метис",8);
        alice.eyesColor = "жёлто-зелёные";
        alice.furColor = "дымчатая";
        alice.feedTheCat();

        alice.punishTheCat();
    }
}
