package fr.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/fr/fichier/recensement.csv");

        // fichier source
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        // fichier cible
        List<String> target = new ArrayList<>();

        // suppression de la 1ère ligne du fichier source
        lines.remove(0);

        for (String line : lines) {
            if (Integer.parseInt(line.split(";")[9].trim().replaceAll(" ", "")) > 25000) {
                String str = ("Ville: " + line.split(";")[6] +
                        ", Dept: " + line.split(";")[0] +
                        ", Hab: " + line.split(";")[9]);
                // System.out.println("str = " + str);  //debug
                target.add(str);
            }
        }

        // écriture dans le fichier cible
        Path pathTarget = Paths.get("src/fr/fichier/tp_14.txt");
        Files.write(pathTarget, target, StandardCharsets.UTF_8);
        System.out.println("Fichier tp_14.txt créé avec succès !");
    }
}
