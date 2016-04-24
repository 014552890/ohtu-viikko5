package ohtu.lyyrakortti;

public class Paaluokka {

    public static void main(String[] args) {

        Kassapaate kassa = new Kassapaate();
        Lyyrakortti kortti = new Lyyrakortti(0);

        kassa.lataa(kortti, 5);

        System.out.println(kortti.getSaldo());
    }
}
