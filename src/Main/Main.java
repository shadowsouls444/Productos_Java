package Main;

import Controllers.ProveedorController;
import Controllers.VentaController;
import Models.Proveedor;
import Models.Venta;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        //Variable para elegir la opcion
        int opcion;

        //------------------------   PROVEEDOR  ----------------------------------
        // Crear una sola instancia del controlador de proveedores
        ProveedorController proveedorController = new ProveedorController();

        //Instancia de la clase como proveedor
        Proveedor proveedor;

        //------------------------   VENTA  ----------------------------------
        // Crear una sola instancia del controlador de venta
        VentaController ventaController = new VentaController();

        //Instancia de la clase como proveedor
        Venta venta;

        do {

            System.out.println("GESTOR DE PRODUCTOS");
            System.out.println();

            System.out.println("1. Proveedor");
            System.out.println("2. Venta");
            System.out.println("0. Salir del programa");
            System.out.println();

            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {

                //CRUD PROVEEDOR
                case 1:

                    //Variable para elegir la opcion en el CRUD PROVEEDOR
                    int opcionProveedor;

                    do {

                        //Variables del atributo proveedor
                        int id = 0;
                        String nombre = "";
                        String correo = "";
                        String numero = "";
                        String direccion = "";

                        System.out.println("CRUD PROVEEDOR");
                        System.out.println();

                        System.out.println("1. Crear un proveedor");
                        System.out.println("2. Eliminar un proveedor");
                        System.out.println("3. Ver proveedores");
                        System.out.println("4. Editar el proveedor");
                        System.out.println("0. Salir del CRUD PROVEEDOR");
                        System.out.println();

                        System.out.print("Elija una opcion: ");
                        opcionProveedor = leer.nextInt();

                        switch (opcionProveedor) {

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
                                numero = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la direccion del proveedor");
                                direccion = leer.next();
                                System.out.println("");

                                proveedor = new Proveedor(id, nombre, correo, numero, direccion);
                                proveedorController.InsertarProveedor(proveedor);

                                break;

                            //ELIMINAR
                            case 2:

                                System.out.println("Porfavor ingrese el id del proveedor que desea elimininar");

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
                                numero = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la direccion del proveedor");
                                direccion = leer.next();
                                System.out.println("");

                                proveedor = new Proveedor(id, nombre, correo, numero, direccion);
                                proveedorController.EditarProveedor(proveedor);

                                break;

                            //SALIR
                            case 0:

                                System.out.println("Saliendo del CRUD PROVEEDOR......");

                                break;

                            default:

                                System.out.println("Opcion incorrecta elija de nuevo");

                        }

                    } while (opcionProveedor != 0);

                    break;

                //CRUD VENTA
                case 2:

                    //Variable para elegir la opcion en el CRUD VENTA
                    int opcionVenta;

                    do {

                        //Variables del atributo Venta
                        int id = 0;
                        double total = 0;
                        int cantidad = 0;
                        int codigoFactura = 0;

                        System.out.println("CRUD VENTA");
                        System.out.println();

                        System.out.println("1. Crear una venta");
                        System.out.println("2. Eliminar una venta");
                        System.out.println("3. Ver ventas");
                        System.out.println("4. Editar la venta");
                        System.out.println("0. Salir del CRUD VENTA");
                        System.out.println();

                        System.out.print("Elija una opcion: ");
                        opcionVenta = leer.nextInt();

                        switch (opcionVenta) {

                            //INSERTAR
                            case 1:

                                System.out.println("Por favor ingrese el id del proveedor");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el total de la venta");
                                total = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la cantidad que se compro");
                                cantidad = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el codigo de la factura de la compra");
                                codigoFactura = leer.nextInt();
                                System.out.println("");

                                venta = new Venta(id, total, cantidad, codigoFactura);
                                ventaController.InsertarProveedor(venta);

                                break;

                            //ELIMINAR
                            case 2:

                                System.out.println("Porfavor ingrese el id de la venta que desea elimininar");

                                id = leer.nextInt();

                                ventaController.BorrarVenta(id);

                                break;

                            //LEER 
                            case 3:

                                ventaController.imprimir();

                                break;

                            //EDITAR
                            case 4:

                                System.out.println("Por favor ingrese el ID de la venta que desea editar:");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el total de la venta");
                                total = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la cantidad que se compro");
                                cantidad = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el codigo de la factura de la compra");
                                codigoFactura = leer.nextInt();
                                System.out.println("");

                                venta = new Venta(id, total, cantidad, codigoFactura);
                                ventaController.EditarVenta(venta);

                                break;

                            //SALIR
                            case 0:

                                System.out.println("Saliendo del CRUD VENTA......");

                                break;

                            default:

                                System.out.println("Opcion incorrecta elija de nuevo");

                        }

                    } while (opcionVenta != 0);

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