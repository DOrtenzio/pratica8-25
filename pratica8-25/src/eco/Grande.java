package eco;

public class Grande extends Elettrodomestico implements Eco {
    private String luogoStoccaggio;

    //Costruttore
    public Grande(String articolo, String codice, int quantita, int consumo, double costoBase, String luogoStoccaggio) throws IllegalArgumentException{
        super(articolo, codice, quantita, consumo,costoBase);
        this.luogoStoccaggio = luogoStoccaggio;
    }
    public Grande() throws IllegalArgumentException {
        super();
        this.luogoStoccaggio = "Non inserito";
    }

    //get e set
    public String getLuogoStoccaggio() { return luogoStoccaggio; }
    public void setLuogoStoccaggio(String luogoStoccaggio) { this.luogoStoccaggio = luogoStoccaggio; }

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
        if (super.getConsumo()<=51)
            return 'a';
        else if (super.getConsumo()<=59)
            return 'b';
        else if (super.getConsumo()<=68)
            return 'c';
        else if (super.getConsumo()<=79)
            return 'd';
        else if (super.getConsumo()<=89)
            return 'e';
        else if (super.getConsumo()<=100)
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
        return super.toString()+", luogo di stoccaggio=" + this.luogoStoccaggio +", classe energetica=" + getClasseEnergetica()+'}';
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Grande){
            Grande r=(Grande) o;
            return super.equals(r) && r.getLuogoStoccaggio().equalsIgnoreCase(this.luogoStoccaggio);
        }
        return false;
    }
}
