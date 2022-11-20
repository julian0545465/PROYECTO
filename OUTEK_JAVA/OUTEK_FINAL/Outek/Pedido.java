package Outek;
import java.util.Scanner;
public class Pedido 
{

    int id;
    int fecha;
    int cantidad = 0;
    String descripcion;
    Double valorUnitario;
    Double valorTotal;
    String nombreCliente;
    String estado;
    String DatosEnvio;
    String MetodoPago;
    int idfac;
    double detPrecio;
    int cantidadPro;
    double detPrecioTotal;

    Scanner Leer =new Scanner(System.in);

    public void MPedido() 
    {
        System.out.println("Ingrese la cantidad de pedidos que desea ingresar:");
        cantidad = Leer.nextInt();
        int [] id = new int [cantidad];
        int [] fecha = new int [cantidad];
        String [] descripcion = new String [cantidad];
        double [] valorUnitario= new double [cantidad];
        double [] valorTotal= new double [cantidad];
        String [] nombreCiente = new String [cantidad];
        String [] estado = new String [cantidad];
        String [] datosEnvio = new String [cantidad];
        String [] metodoPago  = new String [cantidad];
        
        for (int i = 0; i < cantidad; i ++)
        {
            System.out.println("Ingrese el Id del pedido" + (i + 1));
            id[i] = Leer.nextInt();

            System.out.println("Ingrese la fecha del pedido " + id[i]);
            fecha[i] = Leer.nextInt();

            System.out.println("Ingrese la descripcion del pedido " + id[i]);
            descripcion[i] = Leer.next();

            System.out.println("Ingrese el valor unitario del Pedido " + id[i]);
            valorUnitario[i] = Leer.nextDouble();

            System.out.println("Ingrese el valor total del pedido " + id[i]);
            valorTotal[i] = Leer.nextDouble(); 

            System.out.println("Ingrese el nombre del Cliente que realizo el pedido " + id[i]);
            nombreCiente[i] = Leer.next();

            System.out.println("Ingrese el estado del pedido pedido (entregado o en proceso) " + id[i]);
            estado[i] = Leer.next();

            System.out.println("Ingrese por que dicho estado en que se encuentra el pedido " + id[i]);
            datosEnvio[i] = Leer.next();

            System.out.println("Ingrese el metodo de pago del pedido " + id[i]);
            metodoPago[i] = Leer.next();
        }

        for (int v = 0; v < cantidad; v++) 
        {
            
                System.out.println("El Id del pedido es :        |   " + id[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Fecha del pedido:            |   " + fecha[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Descripcion del pedido:      |   " + descripcion[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Valor unitario del pedido:   |   " + valorUnitario[v]);
                System.out.println("--------------------------------------------------");
                System.out.println("Valor total del pedido:      |   " + valorTotal[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Nombre del cliente:          |   " + nombreCiente[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Estado del pedido:           |   " + estado[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Datos de envio del pedido:   |   " + datosEnvio[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("Metodo de pago del pedido:   |   " + metodoPago[v] );
                System.out.println("--------------------------------------------------");
        }
    
        int menu = 0;
        System.out.println("Dijite 1) Si desea CONSULTAR un pedido, 2) Si desea Modificar un pedido, 3) Si desea Eliminar un pedido");
        menu = Leer.nextInt();

        if (menu == 1) 
        {

            int Continuar;
            do 
            {
            System.out.println("Ingrese el Id del pedido que desea consultar:");
            int nConsultar = Leer.nextInt();
            Boolean encontrado = false;
            

            for (int i = 0; i < id.length; i++) 
            {
                if (id[i]==nConsultar)
                {
                    
                    System.out.println("El Id del pedido es :        |   " + id[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Fecha del pedido:            |   " + fecha[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Descripcion del pedido:      |   " + descripcion[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor unitario del pedido:   |   " + valorUnitario[i]);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor total del pedido:      |   " + valorTotal[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nombre del cliente:          |   " + nombreCiente[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Estado del pedido:           |   " + estado[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Datos de envio del pedido:   |   " + datosEnvio[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Metodo de pago del pedido:   |   " + metodoPago[i] );
                    System.out.println("--------------------------------------------------");
                    encontrado =true;
                    break;
                }
            }
                
                System.out.println("\nEscriba el numero 0 si desea continuar o cualquier numero para salir ");
                Continuar= Leer.nextInt();

            } while (Continuar == 0);
            
        } 
        else if (menu == 2)
        {

            System.out.println("Ingrese el Id del pedido que desea modificar");
            int nModificar = Leer.nextInt();
            Boolean modificado = false;

            for (int i = 0; i < id.length; i++) 
            {
                if (id[i]==nModificar) 
                {
                    System.out.println("Ingrese el dato que desea remplezar del pedido con el Id: " + id[i]);

                    System.out.println("Ingrese el Id del pedido" + (i + 1));
                    id[i] = Leer.nextInt();

                    System.out.println("Ingrese la fecha del pedido " + id[i]);
                    fecha[i] = Leer.nextInt();

                    System.out.println("Ingrese la descripcion del pedido " + id[i]);
                    descripcion[i] = Leer.next();

                    System.out.println("Ingrese el valor unitario del Pedido " + id[i]);
                    valorUnitario[i] = Leer.nextDouble();

                    System.out.println("Ingrese el valor total del pedido " + id[i]);
                    valorTotal[i] = Leer.nextDouble(); 

                    System.out.println("Ingrese el nombre del Cliente que realizo el pedido " + id[i]);
                    nombreCiente[i] = Leer.next();

                    System.out.println("Ingrese el estado del pedido pedido (entregado o en proceso) " + id[i]);
                    estado[i] = Leer.next();

                    System.out.println("Ingrese por que dicho estado en que se encuentra el pedido " + id[i]);
                    datosEnvio[i] = Leer.next();

                    System.out.println("Ingrese el metodo de pago del pedido " + id[i]);
                    metodoPago[i] = Leer.next();
                    modificado = true;

                    System.out.println("Modificacion Exitosa");

                    System.out.println("El Id del pedido es :        |   " + id[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Fecha del pedido:            |   " + fecha[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Descripcion del pedido:      |   " + descripcion[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor unitario del pedido:   |   " + valorUnitario[i]);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor total del pedido:      |   " + valorTotal[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nombre del cliente:          |   " + nombreCiente[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Estado del pedido:           |   " + estado[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Datos de envio del pedido:   |   " + datosEnvio[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Metodo de pago del pedido:   |   " + metodoPago[i] );
                    System.out.println("--------------------------------------------------");
                    break;
                }     
            }
        }

        else if (menu == 3) 
        {
            for (int i = 0; i < id.length; i++) 
            {
                System.out.println("Digite el id del pedido que quiere eliminar");
                int nEliminar=Leer.nextInt();  
                if(id[i]==nEliminar)
                {
                    System.out.println("Va a eliminar el pedido con codigo "+ id[i] );
                    System.out.println("Eliminacion Exitosa");
                    break;
                }
            }
        }
    }


    public void pedidoPredeterminado()
    {
        
        int [] id = {111};
        int [] fecha = {2022/03/20};
        int [] cantidad ={10};
        String [] descripcion = {"Tarjeta Madre Asus h410M-E"};
        double [] valorUnitario= {20.000};
        double [] valorTotal= {200,000};
        String [] nombreCiente = {"Pepe Perez"};
        String [] estado = {"Inactivo"};
        String [] datosEnvio = {"El pedido llego exitosamente"};
        String [] metodoPago  = {"Efectivo"};


        for (int j = 0; j < metodoPago.length; j++) 
        {
            System.out.println("////////////////////////////////////");
            System.out.println("El Id del pedido es :        |   " + id[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Fecha del pedido:            |   " + fecha[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Cantidad del pedido:         |   " + cantidad[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Descripcion del pedido:      |   " + descripcion[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Valor unitario del pedido:   |   " + valorUnitario[j]);
            System.out.println("--------------------------------------------------");
            System.out.println("Valor total del pedido:      |   " + valorTotal[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Nombre del cliente:          |   " + nombreCiente[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Estado del pedido:           |   " + estado[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Datos de envio del pedido:   |   " + datosEnvio[j] );
            System.out.println("--------------------------------------------------");
            System.out.println("Metodo de pago del pedido:   |   " + metodoPago[j] );
            System.out.println("--------------------------------------------------");
        }
    }
    public void crearFactura()
    {
        
        int [] id_ = new int [100000];
        double [] detPrecio_ = new double [1000000];
        double [] detCantidad_ = new double [1000000];
        int cantidad;
        System.out.println("Ingrese la cantidad de facturas que desea ingresar:");
        cantidad = Leer.nextInt();
        for (int i = 0; i < cantidad; i ++)
        {
            System.out.println("Ingrese el Id de la factura " + (i + 1));
            this.id=Leer.nextInt();
            id_[i]=this.id;

            System.out.println("Ingrese el Precio por unidad del producto " + id_[i]);
            this.detPrecio=Leer.nextDouble();
            detPrecio_[i]=this.detPrecio;

            System.out.println("Ingrese la cantidad del producto " + id_[i]);
            this.cantidadPro=Leer.nextInt();
            detCantidad_[i]=this.cantidadPro;

            detPrecioTotal=(detPrecio*cantidadPro);
            System.out.println("El total de su factura es: "+detPrecioTotal);
        }
    }

    public static void main(String[] args) 
    {
        Pedido  T = new Pedido();
        T.MPedido();
        T.pedidoPredeterminado();
        T.crearFactura();
    } 

}

