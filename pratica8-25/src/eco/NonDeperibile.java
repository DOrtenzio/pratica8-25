package eco;

public class NonDeperibile extends ProdottoAlimentare implements Eco{
    private String luogoStoccaggio;

    //Costruttore
    public NonDeperibile(String articolo, String codice, int quantita, int giorniConservazione, boolean biologico,double costoBase, String luogoStoccaggio) throws IllegalArgumentException{
        super(articolo, codice, quantita, giorniConservazione, biologico,costoBase);
        this.luogoStoccaggio = luogoStoccaggio;
    }
    public NonDeperibile() throws IllegalArgumentException {
        super();
        this.luogoStoccaggio = "Non inserito";
    }

    //get e set
    public String getLuogoStoccaggio() { return luogoStoccaggio; }
    public void setLuogoStoccaggio(String luogoStoccaggio) { this.luogoStoccaggio = luogoStoccaggio; }

    //Metodi
    @Override
    public double costo() {
        if (super.getQuantita() > 10 && super.isBiologico() && this.isEcosostenibile())
            return super.getCostoBase()*1.9;
        else if (super.getQuantita() > 10 && super.isBiologico()) {
            return super.getCostoBase()*1.5;
        } else if (super.getQuantita() > 10) {
            return super.getCostoBase()*1.2;
        }else
            return super.getCostoBase()*1.05;
    }
    @Override
    public boolean isEcosostenibile() {
        return super.isBiologico();
    }
    @Override
    public String toString(){
        return super.toString()+", luogo di stoccaggio=" + this.luogoStoccaggio +'}';
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof NonDeperibile){
            NonDeperibile r=(NonDeperibile) o;
            return super.equals(r) && r.getLuogoStoccaggio().equalsIgnoreCase(this.luogoStoccaggio);
        }
        return false;
    }
}
