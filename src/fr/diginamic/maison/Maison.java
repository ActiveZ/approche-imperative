package fr.diginamic.maison;

public class Maison {
    Piece[] pieces = {}; // tableau des pièces de la maison

    // ajoute une pièce à la maison
    public void ajouterPiece(Piece p) {
        // test cohérence données
        if (p == null || p.getSuperficie() < 0 || p.getEtage() < 0) {
            return;
        }
        // données valides
        int n = pieces.length;
        Piece newArr[] = new Piece[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = pieces[i];
        }
        newArr[n] = p;
        pieces = newArr;
    }


    // retourne la superficie totale de la maison
    public float superficie() {
        float s = 0; // surface
        for (Piece p : pieces) {
            s += p.getSuperficie();
        }
        return s;
    }


    // retourne la superficie de l'étage e de la maison
    public float superficie(int e) {
        float s = 0; // surface
        for (Piece p : pieces) {
            if (p.getEtage() == e) {
                s += p.getSuperficie();
            }
        }
        return s;
    }


    // retourne la superficie selon type de pièce
    public float superficiePieces(int typePiece) {
        float s = 0; // surface
        int n = 0; // nombre de pièces concernées
        for (Piece p : pieces) {
            if (typePiece == 0 && p instanceof Salon) s += p.getSuperficie();
            if (typePiece == 1 && p instanceof Cuisine) s += p.getSuperficie();
            if (typePiece == 2 && p instanceof Chambre) s += p.getSuperficie();
            if (typePiece == 3 && p instanceof SalleDeBain) s += p.getSuperficie();
            if (typePiece == 4 && p instanceof WC) s += p.getSuperficie();
        }
        return s;
    }

    // retourne le nombre de pièce d'un type donné
    public int sommeTypePiece(int typePiece) {
        int n = 0; // nombre de pièces concernées
        for (Piece p : pieces) {
            if (typePiece == 0 && p instanceof Salon) n++;
            if (typePiece == 1 && p instanceof Cuisine) n++;
            if (typePiece == 2 && p instanceof Chambre) n++;
            if (typePiece == 3 && p instanceof SalleDeBain) n++;
            if (typePiece == 4 && p instanceof WC) n++;
        }
        return n;
    }


    // retourne le nombre de pièce
    public int nbPiece() {
        return pieces.length;
    }
}
