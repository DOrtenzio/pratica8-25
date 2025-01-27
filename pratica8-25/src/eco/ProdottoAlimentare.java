package eco;

public abstract class ProdottoAlimentare{
    private String articolo;
    private String codice;
    private int quantita;
    private int giorniConservazione;
    private boolean biologico;
    private double costoBase;

    //Costruttore
    public ProdottoAlimentare(String articolo, String codice, int quantita, int giorniConservazione, boolean biologico, double costoBase) throws IllegalArgumentException{
        this.articolo = articolo;
        this.codice = codice;
        this.biologico = biologico;
        setQuantita(quantita);
        setGiorniConservazione(giorniConservazione);
        setCostoBase(costoBase);
    }
    public ProdottoAlimentare() throws IllegalArgumentException {
        this("NON INSERITO","XXXXXX",0,0,false,0.0);
    }

    //Get e set
    public String getArticolo() { return articolo; }
    public void setArticolo(String articolo) { this.articolo = articolo; }
    public String getCodice() { return codice; }
    public void setCodice(String codice) { this.codice = codice; }
    public int getQuantita() { return quantita; }
    public void setQuantita(int quantita) throws IllegalArgumentException{
        if (quantita<=0)
            throw new IllegalArgumentException("Valore errato");
        else
            this.quantita = quantita;
    }
    public int getGiorniConservazione() { return giorniConservazione; }
    public void setGiorniConservazione(int giorniConservazione) throws IllegalArgumentException{
        if (giorniConservazione<=0)
            throw new IllegalArgumentException("Valore errato");
        else
            this.giorniConservazione = giorniConservazione;
    }
    public boolean isBiologico() { return biologico; }
    public void setBiologico(boolean biologico) { this.biologico = biologico; }
    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) throws IllegalArgumentException{
        if (costoBase<=0.0)
            throw new IllegalArgumentException("Valore errato");
        else
            this.costoBase = costoBase;
    }

    //Metodi
    public abstract double costo();
    @Override
    public String toString() {
        return "ProdottoAlimentare{" +
                "articolo='" + this.articolo + '\'' +
                ", codice='" + this.codice + '\'' +
                ", quantita=" + this.quantita +
                ", giorniConservazione=" + this.giorniConservazione +
                ", biologico=" + this.biologico +
                ", costo base=" + this.costoBase
                ;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof ProdottoAlimentare){
            ProdottoAlimentare r=(ProdottoAlimentare) o;
            return r.getArticolo().equalsIgnoreCase(this.articolo) && r.getCodice().equalsIgnoreCase(this.codice) && r.getQuantita()==this.quantita && r.getGiorniConservazione()==this.giorniConservazione && r.isBiologico()==this.biologico && this.costoBase==r.getCostoBase();
        }
        return false;
    }
}
