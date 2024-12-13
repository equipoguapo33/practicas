package Herencia;
public class Rectangulo extends FigurasGeo{
    float base, altura;
    public void calcularArea(){
        this.area=(float) base * altura;
        System.out.println("calculando area del rectangulo: " + this.area);

    }
    public void dibujarFigura(){
        System.out.println("dibujando rectangulo de area: " + this.area);
    }
    
}
