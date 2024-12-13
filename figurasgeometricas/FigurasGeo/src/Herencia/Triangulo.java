package Herencia;
public class Triangulo extends FigurasGeo{
    float base, altura;

    public void calcularArea(){
        this.area=(base*altura)/2;
        System.out.println("calculando area del triangulo" + this.area);

    }
    public void dibujarFigura(){
        System.out.println("dibujando triangulo de area: " + this.area);
    }
}
