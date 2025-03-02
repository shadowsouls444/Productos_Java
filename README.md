MAIN COMPRA

para actualizacion del proyecto se le a agregado la crud de compra esta se le agrega el menu el cuel se deja aca por motivos de compativilidad

package Main;

import Controllers.CompraController;
import Models.Compra;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        CompraController compraController = new CompraController();

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {

            //Variables
            int id = 0;
            double total = 0.0;
            int cantidad = 0;
            int codFoctura = 0;

            
            //Instancia del constructor como variable
            Compra compra;

            System.out.println("GESTOR DE PRODUCTOS");
            System.out.println();

            System.out.println("1. Crear una compra");
            System.out.println("2. Eliminar una compra");
            System.out.println("3. Ver compras");
            System.out.println("4. Editar la compra");
            System.out.println("0. Salir del programa");
            System.out.println();

            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {

                //INSERTAR
                case 1:
                    
                    System.out.println("Por favor ingrese el id de la compra");
                    id = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el total de la compra");
                    total = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el cantidad de la compra");
                    cantidad = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el codigo de la factura de compra");
                    codFoctura = leer.nextInt();
                    System.out.println("");

                    compra = new Compra(id, total, cantidad, codFoctura);
                    compraController.InsertarCompra(compra);

                    break;

                //ELIMINAR
                case 2:

                    System.out.println("Porfavor ingrese el id de la compra que desea elimininar");

                    id = leer.nextInt();

                    compraController.BorrarCompra(id);

                    break;

                //LEER 
                case 3:

                    compraController.imprimir();

                    break;

                //EDITAR
                case 4:

                    System.out.println("Por favor ingrese el ID del proveedor que desea editar:");
                    id = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el total de la compra");
                    total = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el cantidad de la compra");
                    cantidad = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el codigo de la factura de compra");
                    codFoctura = leer.nextInt();
                    System.out.println("");

                    compra = new Compra(id, total, cantidad, codFoctura);
                    compraController.EditarCompra(compra);

                    break;

                //SALIR
                case 0:

                    System.out.println("Saliendo del programa......");

                    break;

                default:
                    
                    System.out.println("Opcion incorrecta elija de nuevo");

            }

        } while (opcion != 0);
    }

}

MAIN VENTA
