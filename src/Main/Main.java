package Main;

import Controllers.ProveedorController;
import Models.Proveedor;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProveedorController proveedorController = new ProveedorController();

        Scanner leer = new Scanner(System.in);

        int opcion;

        do {

            //Variables
            int id = 0;
            String nombre = "";
            String correo = "";
            int numero = 0;
            String direccion = "";
            
            //Instancia del constructor como variable
            Proveedor proveedor;

            System.out.println("GESTOR DE PRODUCTOS");
            System.out.println();

            System.out.println("1. Crear un producto");
            System.out.println("2. Eliminar un producto");
            System.out.println("3. Ver productos");
            System.out.println("4. Editar el producto");
            System.out.println("0. Salir del programa");
            System.out.println();

            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {

                //INSERTAR
                case 1:
                    
                    System.out.println("Por favor ingrese el id del proveedor");
                    id = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el nombre del proveedor");
                    nombre = leer.next();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el correo del proveedor");
                    correo = leer.next();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el numero del proveedor");
                    numero = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese la direccion del proveedor");
                    direccion = leer.next();
                    System.out.println("");

                    proveedor = new Proveedor(id, nombre, correo, numero, direccion);
                    proveedorController.InsertarProveedor(proveedor);

                    break;

                //ELIMINAR
                case 2:

                    System.out.println("Porfavor ingrese el id del libro que desea elimininar");

                    id = leer.nextInt();

                    proveedorController.BorrarProveedor(id);

                    break;

                //LEER 
                case 3:

                    proveedorController.imprimir();

                    break;

                //EDITAR
                case 4:

                    System.out.println("Por favor ingrese el ID del proveedor que desea editar:");
                    id = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el nombre del proveedor");
                    nombre = leer.next();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el correo del proveedor");
                    correo = leer.next();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese el numero del proveedor");
                    numero = leer.nextInt();
                    System.out.println("");
                    
                    System.out.println("Porfavor ingrese la direccion del proveedor");
                    direccion = leer.next();
                    System.out.println("");

                    proveedor = new Proveedor(id, nombre, correo, numero, direccion);
                    proveedorController.EditarProveedor(proveedor);

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
