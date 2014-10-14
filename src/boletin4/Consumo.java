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
    
    public double consumoMedio(double kilo,double litro){
        km=kilo;
        litros=litro;
        return litro*kilo;
        //Matematicas de aqui a corregir        
        
    }
    public double consumoEuros(double precioGas, double kmetros){
        pGas=precioGas;
        km=kmetros;
        return precioGas*kmetros;
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