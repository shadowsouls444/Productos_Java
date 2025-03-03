package Main;

import Controllers.CategoriaController;
import Controllers.CompraController;
import Controllers.ProductoController;
import Controllers.ProveedorController;
import Controllers.VentaController;
import Models.Categoria;
import Models.Compra;
import Models.Producto;
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

        //------------------------   COMPRA  ----------------------------------
        // Crear una sola instancia del controlador de compra
        CompraController compraController = new CompraController();

        //Instancia de la clase como proveedor
        Compra compra;

        //------------------------   PRODUCTO  ----------------------------------
        // Crear una sola instancia del controlador de producto
        ProductoController productoController = new ProductoController();

        //Instancia de la clase como proveedor
        Producto producto;

        //------------------------   CATEGORIA  ----------------------------------
        // Crear una sola instancia del controlador de producto
        CategoriaController categoriaController = new CategoriaController();

        //Instancia de la clase como proveedor
        Categoria categoria;

        do {

            System.out.println("GESTOR DE PRODUCTOS");
            System.out.println();

            System.out.println("1. Proveedor");
            System.out.println("2. Venta");
            System.out.println("3. Compra");
            System.out.println("4. Categoria");
            System.out.println("5. Producto");
            System.out.println("0. Salir del programa");
            System.out.println();

            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {

                //------------------------- CRUD PROVEEDOR  --------------------------------------
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

                //------------------------- CRUD VENTA  --------------------------------------
                case 2:

                    //Variable para elegir la opcion en el CRUD VENTA
                    int opcionVenta;

                    do {

                        //Variables del atributo Venta
                        int id = 0;
                        double total = 0;
                        int cantidad = 0;
                        int codigoFactura = 0;
                        int idProducto = 0;

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

                                System.out.println("Por favor ingrese el id de la venta");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el total de la venta");
                                total = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la cantidad de la venta");
                                cantidad = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el codigo de la factura de la venta");
                                codigoFactura = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor ingrese el id del producto de la venta");
                                idProducto = leer.nextInt();
                                System.out.println("");

                                venta = new Venta(id, total, cantidad, codigoFactura, idProducto);
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

                                System.out.println("Porfavor ingrese la cantidad de la venta");
                                cantidad = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el codigo de la factura de la venta");
                                codigoFactura = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor ingrese el id del producto de la venta");
                                idProducto = leer.nextInt();
                                System.out.println("");

                                venta = new Venta(id, total, cantidad, codigoFactura, idProducto);
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

                //------------------------- CRUD COMPRA  -------------------------------------- 
                case 3:

                    //Variable para elegir la opcion en el CRUD 
                    int opcionCompra;

                    do {

                        //Variables del atributo Compra
                        int id = 0;
                        double total = 0.0;
                        int cantidad = 0;
                        int codFoctura = 0;
                        int idProducto = 0;

                        System.out.println("CRUD COMPRA");
                        System.out.println();

                        System.out.println("1. Crear una compra");
                        System.out.println("2. Eliminar una compra");
                        System.out.println("3. Ver compras");
                        System.out.println("4. Editar la compra");
                        System.out.println("0. Salir del CRUD COMPRA");
                        System.out.println();

                        System.out.print("Elija una opcion: ");
                        opcionCompra = leer.nextInt();

                        switch (opcionCompra) {

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
                                
                                System.out.println("Porfavor ingrese el id del producto de la compra");
                                idProducto = leer.nextInt();
                                System.out.println("");

                                compra = new Compra(id, total, cantidad, codFoctura, idProducto);
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

                                System.out.println("Por favor ingrese el ID de la compra que desea editar:");
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
                                
                                System.out.println("Porfavor ingrese el id del producto de la compra");
                                idProducto = leer.nextInt();
                                System.out.println("");

                                compra = new Compra(id, total, cantidad, codFoctura, idProducto);
                                compraController.EditarCompra(compra);

                                break;

                            //SALIR
                            case 0:

                                System.out.println("Saliendo del CRUD COMPRA......");

                                break;

                            default:

                                System.out.println("Opcion incorrecta elija de nuevo");

                        }

                    } while (opcionCompra != 0);

                    break;

                //------------------------- CRUD CATEGORIA  -------------------------------------- 
                case 4:

                    //Variable para elegir la opcion en el CRUD 
                    int opcionCategoria;

                    do {

                        //Variables del atributo Categoria
                        int id = 0;
                        String nombre = "";

                        System.out.println("CRUD CATEGORIA");
                        System.out.println();

                        System.out.println("1. Crear una categoria");
                        System.out.println("2. Eliminar una categoria");
                        System.out.println("3. Ver categorias");
                        System.out.println("4. Editar una categoria");
                        System.out.println("0. Salir del CRUD CATEGORIA");
                        System.out.println();

                        System.out.print("Elija una opcion: ");
                        opcionCategoria = leer.nextInt();

                        switch (opcionCategoria) {

                            //INSERTAR
                            case 1:

                                System.out.println("Por favor ingrese el id de la categoria");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el nombre de la categoria");
                                nombre = leer.next();
                                System.out.println("");

                                categoria = new Categoria(id, nombre);
                                categoriaController.InsertarCategoria(categoria);

                                break;

                            //ELIMINAR
                            case 2:

                                System.out.println("Porfavor ingrese el id de la categoria que desea elimininar");

                                id = leer.nextInt();

                                categoriaController.BorrarCategoria(id);

                                break;

                            //LEER 
                            case 3:

                                categoriaController.imprimir();

                                break;

                            //EDITAR
                            case 4:

                                System.out.println("Por favor ingrese el ID del proveedor que desea editar:");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el nombre de la categoria");
                                nombre = leer.next();
                                System.out.println("");

                                categoria = new Categoria(id, nombre);
                                categoriaController.EditarCategoria(categoria);

                                break;

                            //SALIR
                            case 0:

                                System.out.println("Saliendo del CRUD CATEGORIA......");

                                break;

                            default:

                                System.out.println("Opcion incorrecta elija de nuevo");

                        }

                    } while (opcionCategoria != 0);

                    break;

                //------------------------- CRUD PRODUCTO  --------------------------------------
                case 5:

                    //Variable para elegir la opcion en el CRUD 
                    int opcionProducto;

                    do {

                        //int id,String nombreProducto, int categoria,String fechaVencimiento, int cantidad, int precio
                        //Variables del atributo Compra
                        int id = 0;
                        String nombreProducto = "";
                        int categoriaProducto = 0;
                        String fechaVencimiento = "";
                        int cantidad = 0;
                        double precio = 0.0;

                        System.out.println("CRUD PRODUCTO");
                        System.out.println();

                        System.out.println("1. Crear una producto");
                        System.out.println("2. Eliminar una producto");
                        System.out.println("3. Ver productos");
                        System.out.println("4. Editar un producto");
                        System.out.println("0. Salir del CRUD PRODUCTO");
                        System.out.println();

                        System.out.print("Elija una opcion: ");
                        opcionProducto = leer.nextInt();

                        switch (opcionProducto) {

                            //INSERTAR
                            case 1:

                                System.out.println("Por favor ingrese el id del producto");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el nombre del producto");
                                nombreProducto = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el id de la categoria del producto");
                                categoriaProducto = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor la fecha de vencimiento del producto");
                                fechaVencimiento = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la cantidad que tiene el producto");
                                cantidad = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor ingrese el precio de su producto");
                                precio = leer.nextDouble();
                                System.out.println("");

                                producto = new Producto(id, nombreProducto, categoriaProducto, fechaVencimiento, cantidad, precio);
                                productoController.InsertarProducto(producto);

                                break;

                            //ELIMINAR
                            case 2:

                                System.out.println("Porfavor ingrese el id del producto que desea eliminar");

                                id = leer.nextInt();

                                productoController.BorrarProducto(id);

                                break;

                            //LEER 
                            case 3:

                                productoController.imprimir();

                                break;

                            //EDITAR
                            case 4:
                                
                                System.out.println("Por favor ingrese el id del producto que sea editar");
                                id = leer.nextInt();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el nombre del producto");
                                nombreProducto = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese el id de la categoria del producto");
                                categoriaProducto = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor la fecha de vencimiento del producto");
                                fechaVencimiento = leer.next();
                                System.out.println("");

                                System.out.println("Porfavor ingrese la cantidad que tiene el producto");
                                cantidad = leer.nextInt();
                                System.out.println("");
                                
                                System.out.println("Porfavor ingrese el precio de su producto");
                                precio = leer.nextDouble();
                                System.out.println("");

                                producto = new Producto(id, nombreProducto, categoriaProducto, fechaVencimiento, cantidad, precio);
                                productoController.EditarProducto(producto);

                                break;

                            //SALIR
                            case 0:

                                System.out.println("Saliendo del CRUD PRODUCTO......");

                                break;

                            default:

                                System.out.println("Opcion incorrecta elija de nuevo");

                        }

                    } while (opcionProducto != 0);

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
