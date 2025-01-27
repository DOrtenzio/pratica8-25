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

                                //DOMANDE COMUNI A PRODOTTO ALIMENTARE
                                System.out.println("Inserire articolo: ");
                                String articolo=in.next();
                                System.out.println("Inserire codice prodotto: ");
                                String codice=in.next();
                                System.out.println("Inserire quantità");
                                int quantita=Integer.parseInt(in.next());

//                                do {
//                                    System.out.println("Inserire quantità");
//                                    quantita=Integer.parseInt(in.next());
//                                    if (quantita<=0)
//                                        System.out.println("ERRORE");
//                                }while (quantita<=0);

                                System.out.println("Inserire la durata del prodotto");
                                int giorniConservazione=Integer.parseInt(in.next());

//                                int giorniConservazione;
//                                do {
//                                    System.out.println("Inserire la durata del prodotto");
//                                    giorniConservazione=Integer.parseInt(in.next());
//                                    if (giorniConservazione<=0)
//                                        System.out.println("ERRORE");
//                                }while (giorniConservazione<=0);

                                System.out.println("E' biologico? \n" +
                                        "0 - Si\n" +
                                        "1- No");
                                int isBio=Integer.parseInt(in.next());
                                boolean isBiologico = false;
                                if(isBio==0)
                                    isBiologico=true;

//                                int isBio;
//                                do {
//                                    System.out.println("E' biologico? \n" +
//                                            "0 - Si\n" +
//                                            "1- No");
//                                    isBio=Integer.parseInt(in.next());
//                                    if(isBio==0)
//                                        isBiologico=true;
//                                    else if (isBio!=1)
//                                        System.out.println("Scegli solo 0 o 1");
//                                }while (isBio!=0 && isBio!=1);

                                System.out.println("Inserire il costo base");
                                double costoBase=Double.parseDouble(in.next());

//                                double costoBase;
//                                do {
//                                    System.out.println("Inserire il costo base");
//                                    costoBase=Double.parseDouble(in.next());
//                                    if (costoBase<=0.0)
//                                        System.out.println("ERRORE");
//                                }while (costoBase<=0.0);

                                //DOMANDE SPECIFICHE
                                System.out.println("Inserire la tipologia del prodotto");
                                String tipologia =in.next();

//                                magazzino.addProdotto(new Deperibile(articolo,codice,quantita,giorniConservazione,isBiologico,costoBase,tipologia));

                                try {
                                    magazzino.addProdotto(new Deperibile(articolo,codice,quantita,giorniConservazione,isBiologico,costoBase,tipologia));
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }

                                System.out.println("\n------------------------------\n"+"AGGIUNTO CON SUCCESSO"+"\n------------------------------\n");
                                break;
                            case 1:
                                System.out.println("AGGIUNTA PRODOTTO ALIMENTARE NON DEPERIBILE");

                                //DOMANDE COMUNI A PRODOTTO ALIMENTARE
                                System.out.println("Inserire articolo: ");
                                String articolo1=in.next();
                                System.out.println("Inserire codice prodotto: ");
                                String codice1=in.next();

                                System.out.println("Inserire quantità");
                                int quantita1=Integer.parseInt(in.next());
//                                int quantita1;
//                                do {
//                                    System.out.println("Inserire quantità");
//                                    quantita1=Integer.parseInt(in.next());
//                                    if (quantita1<=0)
//                                        System.out.println("ERRORE");
//                                }while (quantita1<=0);

                                System.out.println("Inserire la durata del prodotto");
                                int giorniConservazione1=Integer.parseInt(in.next());
//                                int giorniConservazione1;
//                                do {
//                                    System.out.println("Inserire la durata del prodotto");
//                                    giorniConservazione1=Integer.parseInt(in.next());
//                                    if (giorniConservazione1<=0)
//                                        System.out.println("ERRORE");
//                                }while (giorniConservazione1<=0);

                                System.out.println("E' biologico? \n" +
                                        "0 - Si\n" +
                                        "1- No");
                                int isBio1=Integer.parseInt(in.next());
                                boolean isBiologico1 = false;
                                if(isBio1==0)
                                    isBiologico1=true;
//                                boolean isBiologico1 = false;
//                                int isBio1;
//                                do {
//                                    System.out.println("E' biologico? \n" +
//                                            "0 - Si\n" +
//                                            "1- No");
//                                    isBio1=Integer.parseInt(in.next());
//                                    if(isBio1==0)
//                                        isBiologico1=true;
//                                    else if (isBio1!=1)
//                                        System.out.println("Scegli solo 0 o 1");
//                                }while (isBio1!=0 && isBio1!=1);

                                System.out.println("Inserire il costo base");
                                double costoBase1=Double.parseDouble(in.next());
//                                double costoBase1;
//                                do {
//                                    System.out.println("Inserire il costo base");
//                                    costoBase1=Double.parseDouble(in.next());
//                                    if (costoBase1<=0.0)
//                                        System.out.println("ERRORE");
//                                }while (costoBase1<=0.0);

                                //DOMANDE SPECIFICHE
                                System.out.println("Inserire il luogo di stoccaggio del prodotto");
                                String luogoDiStoccaggio =in.next();

//                                magazzino.addProdotto(new NonDeperibile(articolo1,codice1,quantita1,giorniConservazione1,isBiologico1,costoBase1,luogoDiStoccaggio));

                                try {
                                    magazzino.addProdotto(new NonDeperibile(articolo1,codice1,quantita1,giorniConservazione1,isBiologico1,costoBase1,luogoDiStoccaggio));
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }

                                System.out.println("\n------------------------------\n"+"AGGIUNTO CON SUCCESSO"+"\n------------------------------\n");
                                break;
                            case 2:
                                System.out.println("AGGIUNTA PICCOLO ELETTRODOMESTICO");

                                //DOMANDE COMUNI A PRODOTTO ALIMENTARE
                                System.out.println("Inserire articolo: ");
                                String articolo2=in.next();
                                System.out.println("Inserire codice prodotto: ");
                                String codice2=in.next();

                                System.out.println("Inserire quantità");
                                int quantita2=Integer.parseInt(in.next());
//                                int quantita2;
//                                do {
//                                    System.out.println("Inserire quantità");
//                                    quantita2=Integer.parseInt(in.next());
//                                    if (quantita2<=0)
//                                        System.out.println("ERRORE");
//                                }while (quantita2<=0);

                                System.out.println("Inserire il consumo dichiarato in Kw/anno");
                                int consumo=Integer.parseInt(in.next());
//                                int consumo;
//                                do {
//                                    System.out.println("Inserire il consumo dichiarato in Kw/anno");
//                                    consumo=Integer.parseInt(in.next());
//                                    if (consumo<=0)
//                                        System.out.println("ERRORE");
//                                }while (consumo<=0);

                                System.out.println("Inserire il costo base");
                                double costoBase2=Double.parseDouble(in.next());
//                                double costoBase2;
//                                do {
//                                    System.out.println("Inserire il costo base");
//                                    costoBase2=Double.parseDouble(in.next());
//                                    if (costoBase2<=0.0)
//                                        System.out.println("ERRORE");
//                                }while (costoBase2<=0.0);

                                //DOMANDE SPECIFICHE
                                System.out.println("Inserire la tipologia del prodotto");
                                String tipologia2 =in.next();

//                                magazzino.addProdotto(new Piccolo(articolo2,codice2,quantita2,consumo,costoBase2,tipologia2));
                                try {
                                    magazzino.addProdotto(new Piccolo(articolo2,codice2,quantita2,consumo,costoBase2,tipologia2));
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println("\n------------------------------\n"+"AGGIUNTO CON SUCCESSO"+"\n------------------------------\n");
                                break;
                            case 3:
                                System.out.println("AGGIUNTA GRANDE ELETTRODOMESTICO");

                                //DOMANDE COMUNI A PRODOTTO ALIMENTARE
                                System.out.println("Inserire articolo: ");
                                String articolo3=in.next();
                                System.out.println("Inserire codice prodotto: ");
                                String codice3=in.next();

                                System.out.println("Inserire quantità");
                                int quantita3=Integer.parseInt(in.next());
//                                int quantita3;
//                                do {
//                                    System.out.println("Inserire quantità");
//                                    quantita3=Integer.parseInt(in.next());
//                                    if (quantita3<=0)
//                                        System.out.println("ERRORE");
//                                }while (quantita3<=0);

                                System.out.println("Inserire il consumo dichiarato in Kw/anno");
                                int consumo3=Integer.parseInt(in.next());
//                                int consumo3;
//                                do {
//                                    System.out.println("Inserire il consumo dichiarato in Kw/anno");
//                                    consumo3=Integer.parseInt(in.next());
//                                    if (consumo3<=0)
//                                        System.out.println("ERRORE");
//                                }while (consumo3<=0);

                                System.out.println("Inserire il costo base");
                                double costoBase3=Double.parseDouble(in.next());
//                                double costoBase3;
//                                do {
//                                    System.out.println("Inserire il costo base");
//                                    costoBase3=Double.parseDouble(in.next());
//                                    if (costoBase3<=0.0)
//                                        System.out.println("ERRORE");
//                                }while (costoBase3<=0.0);

                                //DOMANDE SPECIFICHE
                                System.out.println("Inserire il luogo di stoccaggio del prodotto");
                                String luogoStoccaggio3 =in.next();

//                                magazzino.addProdotto(new Grande(articolo3,codice3,quantita3,consumo3,costoBase3,luogoStoccaggio3));
                                try {
                                    magazzino.addProdotto(new Grande(articolo3,codice3,quantita3,consumo3,costoBase3,luogoStoccaggio3));
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                System.out.println("\n------------------------------\n"+"AGGIUNTO CON SUCCESSO"+"\n------------------------------\n");

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
                        System.out.println("RIMOZIONE ARTICOLO RICERCATO TRAMITE NOME");
                        System.out.println("Inserire il nome dell'articolo (Campo articolo)");
                        String articolo=in.next();
                        if (magazzino.removeProdottoNome(articolo))
                            System.out.println("\n------------------------------\n"+"ELIMINATO CON SUCCESSO"+"\n------------------------------\n");
                        else
                            System.out.println("\n------------------------------\n"+"ERRORE ELEMENTO INESISTENTE"+"\n------------------------------\n");

                    }
                    break;
                case 2:
                    if (magazzino.getNumeroElementiInseriti()==0)
                        System.out.println("ELEMENTI INSERITI PARI A ZERO");
                    else{
                        System.out.println("RICERCA TRAMITE NOME");
                        System.out.println("Inserire il nome dell'articolo (Campo articolo)");
                        String articolo=in.next();
                        Eco prodotto=magazzino.ricercaProdottoNome(articolo);
                        if (prodotto==null)
                            System.out.println("\n------------------------------\n"+"ERRORE ELEMENTO INESISTENTE"+"\n------------------------------\n");
                        else
                            System.out.println(prodotto);
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