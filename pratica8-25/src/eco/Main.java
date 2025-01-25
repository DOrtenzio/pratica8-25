package eco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Magazzino magazzino=new Magazzino();

        int scelta;
        do {
            System.out.println("Scegli un'opzione: \n" +
                    "0 - Aggiungi un nuovo prodotto; \n" +
                    "1 - Rimuovi un prodotto;\n" +
                    "2 - Ricerca per articolo un prodotto;\n" +
                    "3 - Stampa tutti i prodotti;\n" +
                    "4 - Stampa tutti i prodotti ecologici;\n" +
                    "5 - Stampa tutti i prodotti non ecologici;\n" +
                    "6 - Esci.");
            scelta=Integer.parseInt(in.next());
            switch (scelta){
                case 0:
                    System.out.println("Aggiunta di un nuovo prodotto: ");
                    int scelta2;
                    do {
                        System.out.println("Scegli la tipologia di prodotto da aggiungere: \n" +
                                "0- Alimento Deperibile;\n" +
                                "1- Alimento non Deperibile;\n" +
                                "2- Piccolo Elettrodomestico;\n" +
                                "3- Grande Elettrodomestico;");
                        scelta2=Integer.parseInt(in.next());
                        switch (scelta2){
                            case 0:
                                System.out.println("AGGIUNTA PRODOTTO ALIMENTARE DEPERIBILE");
                                System.out.println("Inserire articolo: ");
                                String articolo=in.next();
                                System.out.println("Inserire codice prodotto: ");
                                String codice=in.next();
                                int quantita;
                                do {
                                    System.out.println("Inserire quantità");
                                    quantita=Integer.parseInt(in.next());
                                }while ();
                                //TODO: FINIRE
                                break;
                            case 1:

                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                System.out.println("Inserimento errato");
                        }
                    }while (scelta2<0 || scelta2 > 3);
                    break;
                case 1:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{

                    }
                    break;
                case 2:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{

                    }
                    break;
                case 3:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{
                        System.out.println(magazzino.stampa());
                    }
                    break;
                case 4:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{
                        System.out.println("ELEMENTI ECOLOGICI");
                        for (Eco prodotto : magazzino.getEcologici()) {
                            if (prodotto instanceof ProdottoAlimentare ) {
                                System.out.println(((ProdottoAlimentare) prodotto).getArticolo());
                            }else if(prodotto instanceof Elettrodomestico){
                                System.out.println(((Elettrodomestico) prodotto).getArticolo());
                            }
                        }
                    }
                    break;
                case 5:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{
                        System.out.println("ELEMENTI NON ECOLOGICI");
                        for (Eco prodotto : magazzino.getInquinanti()) {
                            if (prodotto instanceof ProdottoAlimentare ) {
                                System.out.println(((ProdottoAlimentare) prodotto).getArticolo());
                            }else if(prodotto instanceof Elettrodomestico){
                                System.out.println(((Elettrodomestico) prodotto).getArticolo());
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Grazie e buona giornata!");
                    break;
                default:
                    System.out.println("Scegli solo una fra le opzioni proposte");
            }
        }while (scelta!=6);
    }
}