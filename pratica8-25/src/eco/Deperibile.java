package eco;

public class Deperibile extends ProdottoAlimentare implements Eco{
    private String tipologia;

    //Costruttore
    public Deperibile(String articolo, String codice, int quantita, int giorniConservazione, boolean biologico,double costoBase, String tipologia) throws IllegalArgumentException{
        super(articolo, codice, quantita, giorniConservazione, biologico,costoBase);
        this.tipologia = tipologia;
    }
    public Deperibile() throws IllegalArgumentException{
        super();
        this.tipologia = "Non inserita";
    }

    //get e set
    public String getTipologia() { return tipologia; }
    public void setTipologia(String tipologia) { this.tipologia = tipologia; }

    //Metodi
    @Override
    public double costo() {
        if (super.getQuantita() > 10 && super.isBiologico() && this.isEcosostenibile())
            return super.getCostoBase()*2.0;
        else if (super.getQuantita() > 10 && super.isBiologico()) {
            return super.getCostoBase()*1.7;
        } else if (super.getQuantita() > 10) {
            return super.getCostoBase()*1.4;
        }else
            return super.getCostoBase()*1.1;
    }
    @Override
    public boolean isEcosostenibile() {
        return super.isBiologico();
    }
    @Override
    public String toString(){
        return super.toString()+", tipologia=" + this.tipologia+'}';
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Deperibile){
            Deperibile r=(Deperibile) o;
            return super.equals(r) && r.getTipologia().equalsIgnoreCase(this.tipologia);
        }
        return false;
    }
}
