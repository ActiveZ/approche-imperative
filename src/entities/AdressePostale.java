package entities;

public class AdressePostale {
    public int numberRoad;
    public String nameRoad;
    public String postCode;
    public String city;

    public AdressePostale(int numero, String rue, String codePostal, String ville) {
        numberRoad = numero;
        nameRoad = rue;
        postCode = codePostal;
        city = ville;
    }
}

