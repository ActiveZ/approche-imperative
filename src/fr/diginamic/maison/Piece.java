package fr.diginamic.maison;

public abstract class Piece {
    float superficie;
    int etage;

    public Piece(float superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public float getSuperficie() {
        return superficie;
    }

//    public void setSuperficie(float superficie) {
//        this.superficie = superficie;
//    }

    public int getEtage() {
        return etage;
    }

//    public void setEtage(int etage) {
//        this.etage = etage;
//    }
}
