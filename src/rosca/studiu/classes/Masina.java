package rosca.studiu.classes;

import java.util.List;

/**
 * Clasa Masina care va avea toate metodele de care avem nevoie
 */
public class Masina {
    //Fields
    /**
     * Astea sunt field-urile mele
     */
    private final int id;
    private final String marca;
    private final String model;
    private final int anCrearii;
    private final String culoare;
    private final double pret;
    private final String numarInregistrare;

    //Constructor / a)Introducerea datelor despre masina

    /**
     * Acest constructor da datele pentru obiect de tip Masina.
     * @param id id-ul masinii
     * @param marca marca masinii
     * @param model modelul masinii
     * @param anCrearii anul cand a fost produsa masina
     * @param culoare culoarea masinii
     * @param pret pretul masinii in $
     * @param numarInregistrare numarul de inregistrare al masinii
     */
    public Masina(int id, String marca, String model, int anCrearii, String culoare, double pret, String numarInregistrare) {
        this.id = id;
        this.marca = marca;
        this.model = model;
        this.anCrearii = anCrearii;
        this.culoare = culoare;
        this.pret = pret;
        this.numarInregistrare = numarInregistrare;
    }

    //Methods

    //b) Afisarea datelor colectate
    /**
     * Functia toString() in Override folosita
     * pentru a afisa datele despre un automobil.
     */
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append("\nInformatii despre masina ").append(id).append(":\n");
        sb.append("\nMarca: ").append(marca);
        sb.append("\nModel: ").append(model);
        sb.append("\nAnul Crearii: ").append(anCrearii);
        sb.append("\nCuloare: ").append(culoare);
        sb.append("\nPret: ").append(pret).append("$");
        sb.append("\nNumar de inregistrare: ").append(numarInregistrare);

        return sb.toString();
    }

    //c) Afisarea numarului de masini conform unei marci

    /**
     * Aceasta metoda va afisa la ecran automobilele de o marca anumita
     * @param marca marca automobilului care il cautam
     * @param lista lista de masini din care cautam marca
     */
    public static void afisareaConformMarca(String marca, List<Masina> lista) {
        //Initiem o variabila care tine cont de cate masini sunt cu marca ceruta
        int numarMasini = 0;

        //Facem un for loop pentru a trece prin obiecte si a verifica cate masini sunt cu marca ceruta
        for (Masina masina : lista) {
            if (masina.marca.equals(marca)) {
                numarMasini++;
            }
        }

        //Afisam la consola cate masini sunt cu marca ceruta
        System.out.println("Sunt " + numarMasini + " masini cu marca " + marca);
    }

    //d) Afișarea listei mașinilor de un anumit model lansate după un an anumit;

    /**
     * Aceasta metoda va afisa masinile de un anumit model care au fost produse
     * dupa un anumit an.
     * @param model este modelul de automobil care il cautam.
     * @param an este anul dupa care vom afisa masinile.
     * @param lista lista de masini din care cautam.
     */
    public static void afisareaModelAn(String model, int an, List<Masina> lista) {
        short temp = 0;
        System.out.println("Lista masinilor de model " + model + " dupa anul " + an + ":");
        for (Masina masina : lista) {
            if (masina.model.equals(model) && masina.anCrearii >= an) {
                System.out.println(masina.toString());
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Nu exista automobile de modelul " + model + " produse dupa anul " + an + "!");
        } else {
            System.out.println("Au fost gasite " + temp + " automobile de modelul " + model + " produse dupa anul " + an + "!");
        }
    }

    //e) Afișarea listei mașinilor de o culoare anumită;

    /**
     * Va afisa automobilele de o anumita culoare.
     * @param culoare culoarea pe care o cautam.
     * @param lista lista de masini din care facem cautarea.
     */
    public static void afisareaDupaCuloare(String culoare, List<Masina> lista) {
        short temp = 0;
        System.out.println("Lista masinilor de culoarea " + culoare + ":");
        for (Masina masina : lista) {
            if (masina.culoare.equals(culoare)) {
                System.out.println(masina.toString());
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Nu exista automobile de culoarea " + culoare + "!");
        } else {
            System.out.println("Au fost gasite " + temp + " automobile de culoarea " + culoare + "!");
        }
    }

    //Afișarea datelor unei mașini în dependență de numărul de înregistrare

    /**
     * Va afisa automobilul cu numarul de inregistrare
     * @param numarInregistrare numarul de inregistrare dupa care cautam automobilul
     * @param lista lista din care cautam automobilul
     */
    public static void afisareaDupaNumar(String numarInregistrare, List<Masina> lista) {
        short temp = 0;
        System.out.println("Informatia despre masina cu numarul de inregistrare " + numarInregistrare + ":");
        for (Masina masina : lista) {
            if (masina.numarInregistrare.equals(numarInregistrare)) {
                System.out.println(masina.toString());
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Nu exista automobile de culoarea " + numarInregistrare + "!");
        }
    }

    //Afișarea listei mașinilor de o marcă anumită ce nu depășesc un preț anumit

    /**
     * Va afisa automobilele de o anumita marca care nu depasesc un pret anumit
     * @param marca marca care este cautata
     * @param pret pretul pe care nu ar trebuie sa il depaseasca
     * @param lista lista din care cautam automobilul
     */
    public static void afisareaMarcaPret(String marca, double pret, List<Masina> lista) {
        short temp = 0;
        System.out.println("Lista masinilor de marca " + marca + " care nu depasesc pretul de " + pret + "$:");
        for (Masina masina : lista) {
            if (masina.marca.equals(marca) && masina.pret <= pret) {
                System.out.println(masina.toString());
                temp++;
            }
        }
        if (temp == 0) {
            System.out.println("Nu exista automobile de marca " + marca + " care nu depasesc pretul de " + pret + "$!");
        } else {
            System.out.println("Au fost gasite " + temp + " automobile de marca " + marca + " care nu depasesc pretul de " + pret + "$!");
        }
    }

    //Afiseaza lista la ecran

    /**
     * Afiseaza intreaga lista de automobile la ecran
     * @param lista lista care va fi afisata
     */
    public static void afisareLista(List<Masina> lista) {
        for (Masina masina : lista) {
            System.out.println(masina);
        }
    }

    //Folosim pentru a curati consola si a fi textul mai citibil

    /**
     * Introduce mai multe randuri goale pentru a face curat in consola
     */
    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    //Afisam meniul

    /**
     * Afiseaza meniul principalJ
     *
     */
    public static void meniu() {
        System.out.println("----------MENIUL PRINCIPAL----------");
        System.out.println("1 - Introducerea datelor");
        System.out.println("2 - Afisarea datelor");
        System.out.println("3 - Afișarea numărului de mașini conform unei mărcii");
        System.out.println("4 - Afișarea listei mașinilor de un anumit model lansate după un an anumit");
        System.out.println("5 - Afișarea listei mașinilor de o culoare anumită");
        System.out.println("6 - Afișarea datelor unei mașini în dependență de numărul de înregistrare");
        System.out.println("7 - Afișarea listei mașinilor de o marcă anumită ce nu depășesc un preț anumit");
        System.out.println("0 - Iesire");

        System.out.println("\nCe alegeti? ");
    }

}
