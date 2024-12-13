package Herencia;
public class Circulo extends FigurasGeo{
    float radio;
    public void calcularArea(){
        this.area=(float) (Math.PI*Math.pow(radio,2));
        System.out.println("calculando area del circulo" + this.area);

    }
    public void dibujarFigura(){
        System.out.println("dibujando circulo de area: " + this.area);

    }
}
