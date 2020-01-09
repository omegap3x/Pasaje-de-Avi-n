package core;

public class Viaje {
    private Double distanciaARecorrer;
    private Double numeroDeDiasEstancia;
    final private Double PRECIOKM =35.00;
    private double totalAPagar;




    public void CostoViaje(double distanciaARecorrer, double numeroDeDiasEstancia){

        if(distanciaARecorrer>1000 && numeroDeDiasEstancia>7){
          double descuento= (distanciaARecorrer*PRECIOKM)*0.30;

          setTotalAPagar(descuento);

          System.out.println("Tienes un descuento del: 30% ");
            System.out.println("Total a pagar Antes: "  + distanciaARecorrer*PRECIOKM);
            System.out.println("Total a pagar Ahora: "  + descuento);

        }
        else{
            setTotalAPagar(distanciaARecorrer*PRECIOKM);
        }

    }

    public double getTotalAPagar() {

        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {


        this.totalAPagar = totalAPagar;
    }


}
