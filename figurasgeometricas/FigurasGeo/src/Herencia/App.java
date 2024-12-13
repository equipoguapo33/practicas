package Herencia;
import java.util.Scanner;
public class App{
    public static void main(String[]args){
       int opcion;
       Scanner tec = new Scanner(System.in);
       Triangulo objtriangulo = new triangulo();
       Tirculo objcirculo = new circulo();
       Rectangulo objrectangulo = new rectangulo();
       System.out.println("menu de opciones ");
       System.out.println("1. calculo del area y dibujo de un triangulo");
       System.out.println("2. calculo del area y dibujo de un circulo");
       System.out.println("3. calculo del area y dibujo de un rectangulo");
       System.out.println("4. salir");
       opcion = tec.nextInt();
       switch(opcion){
            case 1:
                objtriangulo.nombre = "soy un triangulo";
                System.out.println("dame la base del triangulo: ");
                objtriangulo.base=tec.nextFloat();
                System.out.println("dame la altura del triangulo: ");
                objtriangulo.altura=tec.nextFloat();
                objtriangulo.area();
                objtriangulo.dibujarFigura();
            break;
            case 2:
                objcirculo.nombre = "soy un circulo";
                System.out.println("dame el radio del circulo: ");
                objcirculo.radio=tec.nextFloat();
                objcirculo.calcularArea();
                objcirculo.dibujarFigura();
            break;
            case 3:
                objrectangulo.nombre="soy un rectangulo";
                System.out.println("dame la base del rectangulo: ");
                objrectangulo.base=tec.nextFloat();
                System.out.println("dame la altura del rectangulo: ");
                objrectangulo.altura=tec.nextFloat();
                objrectangulo.calcularArea();
                objrectangulo.dibujarFigura();
            break;
            case 4:
                System.out.println("adios");
                System.exit(0);
            break;

       }


    }
}