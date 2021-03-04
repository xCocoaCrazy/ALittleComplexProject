package rosca.studiu.test;

import rosca.studiu.classes.Masina;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clasa Main in care vom lucra
 */
public class Main {
    /**
     * Metoda main in care vom lucra
     * @param args argumente
     */
    public static void main(String[] args) {
        //Definim variabilele
        List<Masina> listaMasini = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        int continua = 214;

        //Dam valori masinilor
        listaMasini.add(new Masina(214, "BMW", "X6", 2014, "Negru", 20491.35, "XCC643"));
        listaMasini.add(new Masina(523, "Opel", "Astra", 2008, "Gri", 5731.64, "AJF532"));
        listaMasini.add(new Masina(68, "Mercedes-Benz", "A45", 2009, "Alba", 12999, "ACB321"));
        listaMasini.add(new Masina(99, "Mitsubishi", "Lancer", 2005, "Rosu", 8999.67, "LKR929"));
        listaMasini.add(new Masina(82, "BMW", "M5", 2017, "Albastru", 67239, "OOO001"));
        listaMasini.add(new Masina(887, "Audi", "RS6", 2016, "Gri", 45600, "OOO887"));
        listaMasini.add(new Masina(432, "Mercedes-Benz", "C300", 2009, "Alba", 34912.34, "HHG493"));
        listaMasini.add(new Masina(12, "Ford", "Mondeo", 2001, "Galben", 3400, "TYR643"));
        listaMasini.add(new Masina(53, "Ford", "Mustang", 1999, "Gri", 6943, "LSG667"));
        listaMasini.add(new Masina(32, "Opel", "Zefira", 2004, "Negru", 5422, "OZZ333"));

        while (continua != 0) {
            Masina.meniu();
            continua = read.nextInt();
            Masina.clearScreen();

            switch (continua) {
                case 0 -> {
                    System.out.println("La revedere!");
                }
                case 1 -> {
                    int nrDate;
                    int id;
                    String marca;
                    String model;
                    int anCrearii;
                    String culoare;
                    double pret;
                    String numarInregistrare;

                    System.out.println("Cate masini doriti sa adaugati? ");
                    nrDate = read.nextInt();

                    Masina.clearScreen();

                    for (int i = 0; i < nrDate; i++) {
                        System.out.println("Introduceti datele pentru masina " + (i + 1));
                        System.out.print("Id = ");
                        id = read.nextInt();

                        System.out.print("Marca = ");
                        marca = read.next();

                        System.out.print("Model = ");
                        model = read.next();

                        System.out.print("Anul crearii = ");
                        anCrearii = read.nextInt();

                        System.out.print("Culoare = ");
                        culoare = read.next();

                        System.out.print("Pret = ");
                        pret = read.nextDouble();

                        System.out.print("Numar de inregistrare = ");
                        numarInregistrare = read.next();

                        listaMasini.add(new Masina(id, marca, model, anCrearii, culoare, pret, numarInregistrare));
                        Masina.clearScreen();
                    }

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 2 -> {
                    Masina.afisareLista(listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 3 -> {
                    String marca;
                    System.out.print("Introduceti marca pentru a vedea numarul de masini de aceasta marca: ");
                    marca = read.next();

                    Masina.afisareaConformMarca(marca, listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 4 -> {
                    String model;
                    int an;
                    System.out.println("Introduceti modelul si anul pentru a efectua operatia: ");

                    System.out.print("Model = ");
                    model = read.next();

                    System.out.print("An = ");
                    an = read.nextInt();


                    Masina.afisareaModelAn(model, an, listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 5 -> {
                    String culoare;
                    System.out.print("Introduceti culoarea pentru a vedea masinile de aceasta culoare: ");
                    culoare = read.next();

                    Masina.afisareaDupaCuloare(culoare, listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 6 -> {
                    String numar;
                    System.out.print("Introduceti numarul de inregistrare pentru a vedea datele masinii: ");
                    numar = read.next();

                    Masina.afisareaDupaNumar(numar, listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                case 7 -> {
                    String marca;
                    int pret;
                    System.out.println("Introduceti marca si pretul pentru a efectua operatia: ");

                    System.out.print("Marca = ");
                    marca = read.next();

                    System.out.print("Pret = ");
                    pret = read.nextInt();


                    Masina.afisareaMarcaPret(marca, pret, listaMasini);

                    System.out.println("Apasati orice tasta si apoi ENTER pentru a reveni la meniul principal...");
                    read.next();
                    Masina.clearScreen();
                }
                default -> {
                    Masina.clearScreen();
                    System.out.println("A-ti introdus un numar care nu este valid. Introduceti alt numar...");
                }
            }
        }
    }
}
