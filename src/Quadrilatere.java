public class Quadrilatere {
    private double cote;


    public Quadrilatere(){
        this.cote=2.5;
    }
    public Quadrilatere(double cote){
        this.cote=cote;


    }
    public double getCote(){
        return cote;
    }

    public void setCote(double cote){
        this.cote=cote;
    }

public double calculerPerimetreCarre(){
        return cote*4;
}
public double calculerSurface(){
        return  cote*cote;
}
}
