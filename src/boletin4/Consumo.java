package boletin4;

public class Consumo {    
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    
    public Consumo(){                
    }    
    public Consumo(double kms,double li,double vM,double pG) {
        km=kms;
        litros=li;
        vMed=vM;
        pGas=pG;        
    }    
    public double getTiempo(double a,double b){        
        km=a;
        vMed=b;
        return a/b;        
    }
    public double getVmed () {
        return vMed;
    }
    public double consumoMedio(double kilo,double litro){
        km=kilo;
        litros=litro;
        return litro*100/kilo;               
    }
    public double consumoEuros(double precioGas, double kmetros){
        pGas=precioGas;
        km=kmetros;
        return precioGas*100/kmetros;
    }    
    public void setKms(double kilometros){
        km=kilometros;
    }        
    public void setLitros(double litros){
        this.litros=litros;        
    }
    public void setVmed(double vMed){
        this.vMed=vMed;        
    }        
    public void setPgas(double pGas){
        this.pGas=pGas;        
    }        
        
}