package eco;

import java.util.ArrayList;

public class Magazzino {
    private ArrayList<Eco> elementi;

    //Costruttore
    public Magazzino(ArrayList<Eco> elementi) {
        this.elementi = elementi;
    }
    public Magazzino(){
        this(new ArrayList<Eco>());
    }

    //Get e set
    public ArrayList<Eco> getElementi() { return this.elementi; }
    public void setElementi(ArrayList<Eco> elementi) { this.elementi = elementi; }
    public int getNumeroElementiInseriti(){ return this.elementi.size(); }

    //Metodi
    public void addProdotto(Eco o){
        this.elementi.add(o);
    }
    public boolean removeProdottoNome(String nomeProdotto){
        Eco prodotto=ricercaProdottoNome(nomeProdotto);
        if (prodotto!=null){
            this.elementi.remove(prodotto);
            return true;
        }else
            return false;
    }

    public Eco ricercaProdottoNome(String nomeProdotto) {
        for (Eco prodotto : this.elementi) {
            if (prodotto instanceof ProdottoAlimentare ) {
                if (nomeProdotto.equalsIgnoreCase(((ProdottoAlimentare) prodotto).getArticolo()))
                    return prodotto;
            }else if(prodotto instanceof Elettrodomestico){
                if (nomeProdotto.equalsIgnoreCase(((Elettrodomestico) prodotto).getArticolo()))
                    return prodotto;
            }
        }
        return null;
    }
    public String stampa(){
        String s="PRODOTTI:\n";
        for (Eco prodotto : this.elementi){
            s=s+prodotto.toString();
        }
        return s;
    }
    public ArrayList<Eco> getEcologici(){
        ArrayList<Eco> prodottiEcologici=new ArrayList<Eco>();
        for (Eco prodotto : this.elementi){
            if (prodotto.isEcosostenibile())
                prodottiEcologici.add(prodotto);
        }
        return prodottiEcologici;
    }
    public ArrayList<Eco> getInquinanti(){
        ArrayList<Eco> prodottiNonEcologici=new ArrayList<Eco>();
        for (Eco prodotto : this.elementi){
            if (!prodotto.isEcosostenibile())
                prodottiNonEcologici.add(prodotto);
        }
        return prodottiNonEcologici;
    }
}
