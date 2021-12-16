package fr.fichier;

public class Data {
    int codeRegion;
    String nomRegion;
    String dept; // ! corse 2A et 2B
    String codeArrt;
    String codeCanton;
    String codeCommune;
    String nomCommune;
    int popMunicipale;
    int popAPart;
    int population;

    public Data(int codeRegion, String nomRegion, String dept, String codeArrt, String codeCanton, String codeCommune, String nomCommune, int popMunicipale, int popAPart, int population) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.dept = dept;
        this.codeArrt = codeArrt;
        this.codeCanton = codeCanton;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.popMunicipale = popMunicipale;
        this.popAPart = popAPart;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Data{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", dept='" + dept + '\'' +
                ", codeArrt='" + codeArrt + '\'' +
                ", codeCanton='" + codeCanton + '\'' +
                ", codeCommune='" + codeCommune + '\'' +
                ", nomCommune='" + nomCommune + '\'' +
                ", popMunicipale=" + popMunicipale +
                ", popComptee=" + popAPart +
                ", population=" + population +
                '}' + "\n";
    }
}
