package eco;

public abstract class Elettrodomestico {
    private String articolo;
    private String codice;
    private double costoBase;
    private int quantita;
    private int consumo;

    //Costruttore
    public Elettrodomestico(String articolo, String codice, int quantita, int consumo, double costoBase) throws IllegalArgumentException{
        this.articolo = articolo;
        this.codice = codice;
        setQuantita(quantita);
        setConsumo(consumo);
        setCostoBase(costoBase);
    }
    public Elettrodomestico() throws IllegalArgumentException{
        this("Non inserito","XXXXX",0,0,0.0);
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
    public int getConsumo() { return consumo; }
    public void setConsumo(int consumo) throws IllegalArgumentException{
        if (consumo<=0)
            throw new IllegalArgumentException("Valore errato");
        else
            this.consumo = consumo;
    }
    public double getCostoBase() { return costoBase; }
    public void setCostoBase(double costoBase) throws IllegalArgumentException{
        if (costoBase<=0.0)
            throw new IllegalArgumentException("Valore errato");
        else
            this.costoBase = costoBase;
    }

    //Metodi
    public abstract double costo();
    public abstract char getClasseEnergetica();
    @Override
    public String toString() {
        return "Elettrodomestico{" +
                "articolo='" + this.articolo + '\'' +
                ", codice='" + this.codice + '\'' +
                ", quantita=" + this.quantita +
                ", consumo=" + this.consumo+
                ", costo base=" + this.costoBase;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Elettrodomestico){
            Elettrodomestico r=(Elettrodomestico) o;
            return r.getArticolo().equalsIgnoreCase(this.articolo) && r.getCodice().equalsIgnoreCase(this.codice) && r.getQuantita()==this.quantita && r.getConsumo()==this.consumo && this.costoBase == r.getCostoBase();
        }
        return false;
    }
}
