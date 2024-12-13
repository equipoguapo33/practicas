package Libreria;
import java.util.Scanner;
public class Libreria {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int opcion, opc;
        Libro libro = new Libro();
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        do{
            System.out.println("*****menu principal*****");
            System.out.println("1. Libros");
            System.out.println("2. Autores");
            System.out.println("3. Editoriales");
            System.out.println("4. Salir");
            System.out.println(" Edscribe la opcion que quieres realizar");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    do{
                        System.out.println("****Menu de libros*****");
                        System.out.println("1.Agregar libros");
                        System.out.println("2.Modificar libro");
                        System.out.println("3.Elimianr libro");
                        System.out.println("4.Listar libros");
                        System.out.println("5.Regresar");
                        System.out.println("Escribe la opcion que quieres realizar");
                        opc = entrada.nextInt();
                        switch (opc) {  
                        case 1:
                            System.out.println("****Agregando libro****");
                            System.out.println("ingresa el titulo del libro: ");
                            libro.setTitulo(entrada.nextLine()); 
                            entrada.next();
                            System.out.println("ingresa el autor del libro: ");
                            libro.setAutor(entrada.nextLine()); 
                            entrada.next();
                            System.out.println("ingresa la fecha de publicacion del libro: ");
                            libro.setFechapub(entrada.nextLine());
                            entrada.next();
                            System.out.println("ingresa la editorial del libro: ");
                            libro.setEditorial(entrada.nextLine());
                            entrada.next();
                            System.out.println("ingresa el precio del libro:");
                            libro.setPrecio(entrada.nextFloat());
                            entrada.next();
                            System.out.println("-----libro agregado corrctamente-----");
                            break;
                        case 2:
                            do{
                            System.out.println("****Modificando libro****");
                            System.out.println("titulo: " + libro.getTitulo());
                            System.out.println("autor: " +  libro.getAutor());
                            System.out.println("fecha de publicacion: " + libro.getFechapub());
                            System.out.print("editorial: " + libro.getEditorial());
                            System.out.println("precio: " + libro.getPrecio());
                            System.out.println("------¿que deseas modificar?------");
                            System.out.println("1. titulo");
                            System.out.println("2. autor: " );
                            System.out.println("3. fecha de publicacion: ");
                            System.out.print("4. editorial: ");
                            System.out.println("5. precio: ");
                            System.out.println("6. regresar");
                            opc = entrada.nextInt();
                            entrada.nextLine();
                            switch (opc) {
                                case 1 :
                                    System.out.println("ingrese el nuevo titulo: ");
                                    libro.setTitulo(entrada.next());
                                    break;
                                case 2:
                                    System.out.println("ingrese el nuevo autor: ");
                                    libro.setAutor(entrada.next());
                                    break;
                                case 3:
                                    System.out.println("ingrese la nueva fecha de publicacion");
                                    libro.setFechapub(entrada.next());
                                    break;
                                case 4:
                                    System.out.println("ingrese la nueva editorial: ");
                                    libro.setEditorial(entrada.next());
                                    break;
                                case 5:
                                    System.out.println("ingrese el nuevo precio: ");
                                    libro.setPrecio(entrada.nextFloat());
                                    break;
                                
                                default:
                                    throw new AssertionError();
                            }
                    }while(opc != 6);
                        break;
                        case 3:
                            System.out.println("Eliminando libro");
                            break;
                        case 4:
                            System.out.println("*****Listando libros*****");
                            System.out.println("titulo: " + libro.getTitulo());
                            System.out.println("autor: " +  libro.getAutor());
                            System.out.println("fecha de publicacion: " + libro.getFechapub());
                            System.out.print("editorial: " + libro.getEditorial());
                            System.out.println("precio: " + libro.getPrecio());

                            break;
                        case 5:
                            break;
                        default:
                            System.out.println("opcion no valida");
                    
                            break;
                        }
                    }while (opc != 5);
                    break;
            case 2:
                do{
                System.out.println("****Menu Autor****");
                System.out.println("1.Informacion autores");
                System.out.println("2.Agregar autores");
                System.out.println("3.eliminar autor");
                System.out.println("4.listar autores");
                System.out.println("5.salir");
                System.out.println("Escribe el numero que vas a realizar");
                opc= entrada.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("****Agregando autor****");
                        System.out.println("ingrese el nombre del autor: ");
                        autor.setName(entrada.nextLine());
                        entrada.next();
                        System.out.println("ingrese la pagina web del autor: ");
                        autor.setWeb(entrada.nextLine());
                        entrada.next();
                        System.out.println("ingrese el email del autor");
                        autor.setEmail(entrada.nextLine());
                        entrada.next();
                        
                        break;
                    case 2:
                        do{
                        System.out.println("****Modificando autor****");
                        System.out.println("nombre: " + autor.getName());
                        System.out.println("pagina web: " +  autor.getWeb());
                        System.out.println("email: " + autor.getName());
                        System.out.println("****que opcion quiere modificar? *****");
                        System.out.println("1. nombre");
                        System.out.println("2. pagina web");
                        System.out.println("3. email");
                        System.out.println("4. regresar");
                        opc = entrada.nextInt();
                        entrada.next();
                        switch(opc){
                            case 1:
                                System.out.println("ingrese el nuevo nombre: ");
                                autor.setName(entrada.nextLine());
                                break;
                            case 2:
                                System.out.println("ingrese la nueva pagina web: ");
                                autor.setWeb(entrada.nextLine());
                                break;
                            case 3:
                                System.out.println("ingrese el nuevo email: ");
                                autor.setEmail(entrada.nextLine());
                                break;
                            default:
                                System.out.println("opcion no valida");
                        }
                        }while (opc != 4);
                    break;
                    case 3:
                        System.out.println("Eliminando autor");
                        break;
                    case 4:
                        System.out.println("Listando autores");
                        System.out.println("nombre: " + autor.getName());
                        System.out.println("pagina web" + autor.getWeb());
                        System.out.print("email"+ autor.getEmail());
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                    }
                }while(opc != 5);
                break;
            case 3:
                do{
                System.out.println("*****menu de editoriales*****");
                System.out.println("1.Agregar editorial");
                System.out.println("2.Modificar editorial");
                System.out.println("3.Eliminar editorial");
                System.out.println("4.listar editoriales");
                System.out.println("5.Salir");
                opc = entrada.nextInt();
                switch (opc) {
                    case 1:
                        System.out.println("******Agregando editorial******");
                        System.out.println("ingrese el nombre de la editorial: ");
                        editorial.setNombre(entrada.next());
                        System.out.println("ingrese la direccion de la editorial: ");
                        editorial.setDireccion(entrada.next());
                        System.out.println("ingrese el telefono de la editorial: ");
                        editorial.setTelefono(entrada.next());
                        System.out.println("ingrese el contacto de la editorial: ");
                        editorial.setContacto(entrada.next());
                        System.out.println("----editorial agregada correctamente----");
                        break;
                    case 2:
                    do{
                        System.out.println("****Modificando editorial****");
                        System.out.println("nombre: " + editorial.getNombre());
                        System.out.println("direccion: " +  libro.getAutor());
                        System.out.println("telefono: " + libro.getFechapub());
                        System.out.print("contacto: " + libro.getEditorial());
                        System.out.println("------¿que deseas modificar?------");
                        System.out.println("1. nombre: ");
                        System.out.println("2. direccion: " );
                        System.out.println("3. telefono: ");
                        System.out.print("4. contacto: ");
                        System.out.println("5. regresar");
                        opc = entrada.nextInt();
                        switch (opc){
                            case 1:
                                System.out.println("ingrese el nuevo nombre: ");
                                editorial.setNombre(entrada.next());
                                break;
                            case 2:
                                System.out.println("ingrese la nueva direccion: ");
                                editorial.setDireccion(entrada.next());
                                break;
                            case 3:
                            System.out.println("ingrese el nuevo telefono: ");
                                editorial.setTelefono(entrada.next());
                                break;
                            case 4:
                                System.out.println("ingrese el nuevo contacto: ");
                                editorial.setContacto(entrada.next());
                                break;
                        
                    }
                    
                }while(opc!=5);
                break;
                    case 3:
                        System.out.println("Eliminando editorial");
                        break;
                    case 4:
                        System.out.println("*****Listando editoriales*****");
                        System.out.println("Nombre" + editorial.getNombre());
                        System.out.println("Direccion" + editorial.getDireccion());
                        System.out.println("Telefono" + editorial.getTelefono());
                        System.out.println("Contacto" + editorial.getContacto());


                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("opcion no valida");
                        break;
                
                    }
                    }while(opc != 5);
                break;
                
            case 4:
                System.out.println("gracias por usar el sistema");
                break;
            default:
                System.out.println("opcion no valida");

                break;
            }            
        }while(opc != 4);
    entrada.close();
    }
}