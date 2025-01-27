package eco;

public class Piccolo extends Elettrodomestico implements Eco{
    private String tipologia;

    //Costruttore
    public Piccolo(String articolo, String codice, int quantita, int consumo, double costoBase, String tipologia) throws IllegalArgumentException{
        super(articolo, codice, quantita, consumo,costoBase);
        this.tipologia = tipologia;
    }
    public Piccolo() throws IllegalArgumentException{
        super();
        this.tipologia = "Non inserita";
    }

    //get e set
    public String getTipologia() { return tipologia; }
    public void setTipologia(String tipologia) { this.tipologia = tipologia; }

    //metodi
    @Override
    public double costo() {
        if (super.getQuantita() > 10 && this.isEcosostenibile())
            return super.getCostoBase()*2.0;
        else if (super.getQuantita() > 10) {
            return super.getCostoBase()*1.7;
        } else if (this.isEcosostenibile()) {
            return super.getCostoBase()*1.4;
        }else
            return super.getCostoBase()*1.1;
    }
    @Override
    public char getClasseEnergetica(){
        if (super.getConsumo()<=47)
            return 'a';
        else if (super.getConsumo()<=54)
            return 'b';
        else if (super.getConsumo()<=62)
            return 'c';
        else if (super.getConsumo()<=72)
            return 'd';
        else if (super.getConsumo()<=82)
            return 'e';
        else if (super.getConsumo()<=92)
            return 'f';
        else
            return 'g';
    }
    @Override
    public boolean isEcosostenibile() {
        return getClasseEnergetica() == 'a' || getClasseEnergetica() == 'b';
    }
    @Override
    public String toString(){
        return super.toString()+", tipologia=" + this.tipologia+", classe energetica=" + getClasseEnergetica()+'}';
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Piccolo){
            Piccolo r=(Piccolo) o;
            return super.equals(r) && r.getTipologia().equalsIgnoreCase(this.tipologia);
        }
        return false;
    }
}
