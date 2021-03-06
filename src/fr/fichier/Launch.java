package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Launch {
    public static void main(String[] args) throws IOException {

        ////////////////////
        // menu principal //
        ////////////////////
        Scanner sc = new Scanner(System.in);
        String s; // choix utilisateur
        do {
            System.out.println("""
                    Choisissez:
                    0: Sortir
                    1: Population d'une ville
                    2: Population d'un département
                    3: Population d'une région
                    4: Les 10 régions les plus peuplées
                    5: Les 10 départements les plus peuplés
                    6: Les 10 villes les plus peuplées d'un département
                    7: Les 10 villes les plus peuplées d'une région
                    8: Les 10 villes les plus peuplées de France"""
            );
            s = sc.nextLine();
        } while (!s.matches("[0-8]"));
        int choix = Integer.parseInt(s);


        //////////////////////////////
        // récupération des données //
        /////////////////////////////
        Path path = Paths.get("src/fr/fichier/recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); // fichier source
        List<Data> listDatas = new ArrayList<>(); // liste de données

        // suppression de la 1ère ligne du fichier source (en-tête)
        lines.remove(0);


        /////////////////////////////////
        // peuplement de la liste data //
        /////////////////////////////////
        for (String line : lines) {
            Data data = new Data(
                    Integer.parseInt(line.split(";")[0]),
                    line.split(";")[1],
                    line.split(";")[2],
                    line.split(";")[3],
                    line.split(";")[4],
                    line.split(";")[5],
                    line.split(";")[6],
                    Integer.parseInt(line.split(";")[7].trim().replaceAll(" ", "")),
                    Integer.parseInt(line.split(";")[8].trim().replaceAll(" ", "")),
                    Integer.parseInt(line.split(";")[9].trim().replaceAll(" ", "")));
            listDatas.add(data);
        }
        // tri des villes (listDatas) par ordre décroissant de population (pour options 6, 7, et 8)
        Collections.sort(listDatas);


        ////////////////////////////////////////
        // peuplement de la liste département //
        ////////////////////////////////////////
        List<Departement> listDepartements = new ArrayList<>();
        HashSet<String> setDepts = new HashSet<>();
        // récupération de la liste des codes des départements (unique)
        for (Data d : listDatas) {
            setDepts.add(d.dept);
        }
        for (String dept : setDepts) {
            Departement departement = new Departement(dept, 0);
            for (Data d : listDatas) {
                if (d.dept.equals(departement.deptCode))
                    departement.deptPopulation += d.population;
            }
            listDepartements.add(departement);
        }


        ///////////////////////////////////
        // peuplement de la liste région //
        //////////////////////////////////
        List<Region> listRegions = new ArrayList<>();
        HashSet<Integer> setRegions = new HashSet<>();
        // récupération de la liste des codes des régions (unique)
        for (Data d : listDatas) {
            setRegions.add(d.codeRegion);
        }
        for (int codeRegion : setRegions) {
            Region region = new Region(codeRegion, "", 0);
            for (Data d : listDatas) {
                if (d.codeRegion == region.regCodeRegion) {
                    region.regNomRegion = d.nomRegion;
                    region.regPopulation += d.population;
                }
            }
            listRegions.add(region);
        }


        ////////////////
        // MAIN CHOIX //
        ///////////////
        int population = 0;
        switch (choix) {

            // population d'une ville donnée
            case 1:
                Data ville = null;
                do {
                    System.out.println("Choisissez une ville:");
                    s = sc.nextLine();
                    for (Data d : listDatas) {
                        if (d.nomCommune.compareToIgnoreCase(s) == 0) {
                            ville = d;
                            break;
                        }
                    }
                } while (ville == null && !s.startsWith("0"));
                System.out.println("Il y a " + ville.population + " habitants à " + ville.nomCommune);
                break;


            // population d'un département donné
            case 2:
                population = 0;
                do {
                    do {
                        System.out.println("Choisissez un numéro de département:");
                        s = sc.nextLine();
                    } while (!s.matches("\\d+"));
                    if (Integer.parseInt(s) == 0) break; // annulation utilisateur
                    for (Departement dept : listDepartements) {
                        if (dept.deptCode.equals(s)) {
                            population = dept.deptPopulation;
                            System.out.println("Il y a " + population + " habitants dans le département " + s);
                        }
                    }
                } while (population == 0 && !s.startsWith("0"));
                break;


            // Population d’une région donnée
            case 3:
                population = 0;
                do {
                    do {
                        System.out.println("Choisissez un numéro de région (ex PdL: 52):");
                        s = sc.nextLine();
                    } while (!s.matches("\\d+"));
                    if (Integer.parseInt(s) == 0) break; // annulation utilisateur

                    for (Region region : listRegions) {
                        if (region.regCodeRegion == Integer.parseInt(s)) {
                            population += region.regPopulation;
                            System.out.println("Il y a " + population + " habitants dans la région " + region.regNomRegion);
                        }
                    }
                } while (population == 0 && !s.startsWith("0"));
                break;


            // Afficher les 10 régions les plus peuplées
            case 4:
                // tri listRegion en ordre décroissant de population
                Collections.sort(listRegions);
                // affichage résultat
                for (int i = 0; i < 10; i++) {
                    System.out.println("Région: " + listRegions.get(i).regNomRegion + " -- Population: " + listRegions.get(i).regPopulation + " habitants");
                }
                break;


            // Afficher les 10 départements les plus peuplés
            case 5:
                System.out.println("Les 10 départements les plus peuplés de France:");
                for (int i = 0; i < 10; i++) {
                    System.out.println("Département:" + listDepartements.get(i).deptCode + " -- Population: " + listDepartements.get(i).deptPopulation + " habitants");
                }
                break;


            // Afficher les 10 villes les plus peuplées d’un département
            case 6:
                do {
                    System.out.println("Choisissez un numéro de Département");
                    s = sc.nextLine();
                } while (!s.matches("\\d+"));
                if (Integer.parseInt(s) == 0) break; // annulation utilisateur

                System.out.println("Les 10 villes les plus peuplées du département " + s + ":");

                int nbVille = 0;// compteur du nombre de villes trouvées
                for (Data d : listDatas) {
                    if (d.dept.equals(s)) {
                        System.out.println("Ville: " + d.nomCommune + " -- Population: " + d.population + " habitants");
                        if (++nbVille == 10) break;
                    }
                }
                break;


            // Afficher les 10 villes les plus peuplées d’une région
            case 7:
                do {
                    System.out.println("Choisissez un numéro de région (ex PdL: 52):");
                    s = sc.nextLine();
                } while (!s.matches("\\d+"));
                if (Integer.parseInt(s) == 0) break; // annulation utilisateur

                System.out.println("Les 10 villes les plus peuplées de la région " + s + ":");

                nbVille = 0;// compteur du nombre de villes trouvées
                for (Data d : listDatas) {
                    if (d.codeRegion == Integer.parseInt(s)) {
                        System.out.println("Ville: " + d.nomCommune + " -- Population: " + d.population + " habitants");
                        if (++nbVille == 10) break;
                    }
                }
                break;


            // les 10 villes les plus peuplées de France
            case 8:
                System.out.println("Les 10 villes les plus peuplées de France:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + 1 + ": " + listDatas.get(i).nomCommune + " -- " + listDatas.get(i).popMunicipale + " habitants");
                }
                break;


            default:
                System.exit(0);
        }
    }
}