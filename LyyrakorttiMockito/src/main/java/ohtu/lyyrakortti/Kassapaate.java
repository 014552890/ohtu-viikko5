package ohtu.lyyrakortti;

public class Kassapaate {

    private int myytyjaLounaita;
    public static final int HINTA = 5;

    public Kassapaate() {
        this.myytyjaLounaita = 0;
    }

    public void lataa(Lyyrakortti kortti, int summa) {

        if (summa > 0) {
            kortti.lataa(summa);
        } else {
            System.out.println("syötä positiivinen summa");
        }
    }

    public void ostaLounas(Lyyrakortti kortti) {

        if (kortti.getSaldo() >= HINTA) {
            kortti.osta(HINTA);
            myytyjaLounaita++;
        } else {
            System.out.println("Kortilla ei ole tarpeeksi rahaa");
        }
    }

    public int getMyytyjaLounaita() {
        return myytyjaLounaita;
    }
}
