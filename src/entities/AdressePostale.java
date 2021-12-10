package entities;

public class AdressePostale {
    int numberRoad;
    String nameRoad;
    String postCode;
    String city;

    public AdressePostale(int numero, String rue, String codePostal, String ville) {
        numberRoad = numero;
        nameRoad = rue;
        postCode = codePostal;
        city = ville;
    }
}

