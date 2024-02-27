package LAB7_P;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Csvplik {

        public static void main(String[] args) {
            // Przykładowe dane do zapisu
            List<String[]> daneDoZapisu = new ArrayList<>();
            daneDoZapisu.add(new String[]{"2,3,8,16,7,56"});
            daneDoZapisu.add(new String[]{"1.2, 56, 100, KARKA"});

            // Nazwa pliku CSV
            String nazwaPlikuCsv = "plik.csv";

            // Zapis do pliku CSV
            System.out.println(new File(nazwaPlikuCsv).getAbsolutePath());
            zapiszDoPlikuCsv(nazwaPlikuCsv, daneDoZapisu);

            // Odczyt z pliku CSV
            List<String[]> daneZPlikuCsv = odczytajZPlikuCsv(nazwaPlikuCsv);
            System.out.println("Dane odczytane z pliku CSV:");
            for (String[] linia : daneZPlikuCsv) {
                for (String pole : linia) {
                    System.out.print(pole + " ");
                }
                System.out.println();
            }
        }

        private static void zapiszDoPlikuCsv(String nazwaPliku, List<String[]> dane) {
            try (BufferedWriter pisarz = new BufferedWriter(new FileWriter(nazwaPliku))) {
                for (String[] linia : dane) {
                    StringBuilder liniaCsv = new StringBuilder();
                    for (String pole : linia) {
                        liniaCsv.append(pole).append(",");
                    }
                    // Usuń ostatni przecinek
                    liniaCsv.deleteCharAt(liniaCsv.length() - 1);
                    pisarz.write(liniaCsv.toString());
                    pisarz.newLine();
                }
                System.out.println("Dane zapisane do pliku " + nazwaPliku);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static List<String[]> odczytajZPlikuCsv(String nazwaPliku) {
            List<String[]> dane = new ArrayList<>();
            try (BufferedReader czytelnik = new BufferedReader(new FileReader(nazwaPliku))) {
                String linia;
                while ((linia = czytelnik.readLine()) != null) {
                    String[] pola = linia.split(",");
                    dane.add(pola);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return dane;
        }
    }


