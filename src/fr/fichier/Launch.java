package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Launch {
    public static void main(String[] args) throws IOException {
        // menu principal
        Scanner sc = new Scanner(System.in);
        String s; // choix utilisateur
        do {
            System.out.println("Choisissez:\n" +
                    "0: Sortir\n" +
                    "1: Population d'une ville\n" +
                    "2: Population d'un département\n" +
                    "3: Population d'une région\n" +
                    "4: Les 10 régions les plus peuplées\n" +
                    "5: Les 10 départements les plus peuplés\n" +
                    "6: Les 10 villes les plus peuplées d'un département\n" +
                    "7: Les 10 villes les plus peuplées d'une réion\n" +
                    "8: Les 10 villes les plus peuplées de France"
            );
            s = sc.nextLine();
        } while (!s.matches("[0-8]"));
        int choix = Integer.parseInt(s);

        // récupération des données
        Path path = Paths.get("src/fr/fichier/recensement.csv");
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); // fichier source
        List<Data> listData = new ArrayList<>(); // liste de données

        // suppression de la 1ère ligne du fichier source (en-tête)
        lines.remove(0);

        // peuplement de la liste data
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
            listData.add(data);
        }

//        System.out.println("listData = " + listData.get(0)); // debug
        int population = 0;
        switch (choix) {
            // population d'une ville donnée
            case 1:
                Data ville = null;
                do {
                    System.out.println("Choisissez une ville:");
                    s = sc.nextLine();
                    for (Data d : listData) {
                        if (d.nomCommune.toLowerCase().compareTo(s.toLowerCase()) == 0) {
                            ville = d;
                            break;
                        }
                    }
                } while (ville == null && !s.startsWith("0"));
                System.out.println("Il y a " + ville.population + " habitants à " + ville.nomCommune);
                break;


            // poulation d'un département donné
            case 2:
                population = 0;
                do {
                    do {
                        System.out.println("Choisissez un numéro de département:");
                        s = sc.nextLine();
                    } while (!s.matches("\\d+"));
                    if (Integer.parseInt(s) == 0) break; // annulation utilisateur

                    for (Data d : listData) {
                        if (d.dept.compareTo(s) == 0) {
                            population += d.population;
                        }
                    }
                } while (population == 0 && !s.startsWith("0"));
                if (population > 0) {
                    System.out.println("Il y a " + population + " habitants dans le département " + s);
                }
                break;


            // Population d’une région donnée
            case 3:
                population = 0;
                String region = "";
                do {
                    do {
                        System.out.println("Choisissez un numéro de région (ex PdL: 52):");
                        s = sc.nextLine();
                    } while (!s.matches("\\d+"));
                    if (Integer.parseInt(s) == 0) break; // annulation utilisateur

                    for (Data d : listData) {
                        if (d.codeRegion == Integer.parseInt(s)) {
                            population += d.population;
                            region = d.nomRegion;
                        }
                    }
                } while (population == 0 && !s.startsWith("0"));
                if (population > 0) {
                    System.out.println("Il y a " + population + " habitants dans la région " + region);
                }
                break;


            // Afficher les 10 régions les plus peuplées
            case 4:
                // TODO: 15/12/2021
                HashMap<Integer, Integer> mapRegion = new HashMap<>();
                for (Data d : listData) {
                    mapRegion.put(d.codeRegion, d.popMunicipale); // NOOOOOOOONNNNNN
                }

                break;


            // Afficher les 10 départements les plus peuplés
            case 5:
                // TODO: 15/12/2021
                break;


            // Afficher les 10 villes les plus peuplées d’un département
            case 6:
                // TODO: 15/12/2021
                break;


            // Afficher les 10 villes les plus peuplées d’une région
            case 7:
                // TODO: 15/12/2021
                break;


            // les 10 villes les plus peuplées de France
            case 8:
                Collections.sort(listData, new compFrance());
                System.out.println("Les 10 villes les plus peuplées de France:");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + 1 + ": " + listData.get(i).nomCommune + " -- " + listData.get(i).popMunicipale + " hab.");
                    System.out.println("listData = " + listData.get(i));
                }
                break;
            default:
                System.exit(0);
        }

    }

}