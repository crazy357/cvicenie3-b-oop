package cvicenie3;

import cvicenie3.student.Student;
import cvicenie3.utility.ZKlavesnice;
import cvicenie3.zoradenie.PodlaID;
import cvicenie3.zoradenie.PodlaMena;
import cvicenie3.zoradenie.PodlaPriezviska;
import cvicenie3.zoradenie.PodlaVeku;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] studenti = {new Student(5678, "Jozko", "Mrkvicka", 21),
                new Student(1234, "Janko", "Hrasko", 22),
                new Student(9023, "Duro", "Trulo", 20)};

        System.out.println("Nezoradene:");
        for (Student student : studenti) {
            System.out.println(student);
        }

        int parameter = 0;
        while (parameter < 1 || parameter > 4) {
            parameter = ZKlavesnice.readInt("\nNapis cislo parametra podla ktoreho sa ma pole " +
                    "zotriedit: meno-1, priezviko-2, ID-3, vek-4");
            if (parameter < 1 || parameter > 4) {
                System.out.println("Zadal si nespravne cislo, skus znova.");
            }
        }

        int smerTriedenia = 0;
        while (smerTriedenia < 1 || smerTriedenia > 2) {
            smerTriedenia = ZKlavesnice.readInt("\nNapis cislo smeru triedenia: vzostupne-1, zostupne-2");
            if (smerTriedenia < 1 || smerTriedenia > 2) {
                System.out.println("Zadal si nespravne cislo, skus znova.");
            }
        }

        if (parameter == 1) {
            Arrays.sort(studenti, new PodlaMena());
            System.out.println("Zoradene podla mena:");
        }
        if (parameter == 2) {
            Arrays.sort(studenti, new PodlaPriezviska());
            System.out.println("Zoradene podla priezvisko:");
        }
        if (parameter == 3) {
            Arrays.sort(studenti, new PodlaID());
            System.out.println("Zoradene podla ID:");
        }
        if (parameter == 4) {
            Arrays.sort(studenti, new PodlaVeku());
            System.out.println("Zoradene podla veku:");
        }

        if (smerTriedenia == 1) {
            for (Student student : studenti) {
                System.out.println(student);
            }
        }
        else {
            for (int i = studenti.length-1; i >= 0; i--) {
                System.out.println(studenti[i]);
            }
        }
    }
}
