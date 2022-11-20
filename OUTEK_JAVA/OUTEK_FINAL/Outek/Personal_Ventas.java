package Outek;
import java.util.Scanner;


public class Personal_Ventas 
{
    int [] ids = {1,2,3,4};
    String [] estados = {"Activo","Inactivo","Activo","Inactivo"};
    int [] idsPro = {1,2,3,4};
    String [] modelos = {"Cv650","H410_m2","Intel_I5","KDA_G305_Lightspeed"};
    String [] descripcions = {"Fuente_de_energia","Placa_base","Procesador","Mouse"};
    String [] nombres = {"Fuente_corsair","Placa_GigaByte","Procesaror_10ma_Genaracion,","Mouse_Logitech"};
    double [] precioVentas = {310000,456555,755000,160000};
    String [] categorias =  {"Componentes","Componentes","Componentes","Perifericos"};
    Scanner Leer =new Scanner(System.in);

        
    public static void main(String[] args) 
    {
        Personal_Ventas personal_Ventas = new Personal_Ventas();
        personal_Ventas.consultarEstadoOrden();
        personal_Ventas.actualizarEstadoOrden();
        personal_Ventas.modificarCatalogo();
        
    }
    public void consultarEstadoOrden()
    {
            System.out.println("Solo existen 4 Id de pedido por favor seleccione el que desea consultar.");
            System.out.println("Ingrese el Id del pedido que desea consultarle el estado:");
            int nConsultar = Leer.nextInt();
            for (int i = 0; i < ids.length; i++) 
            {
                if (ids[i]==nConsultar)
                {
                    System.out.println("El Id del pedido es :        |   " + ids[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("El estado del pedido es :            |   " + estados[i] );
                    System.out.println("--------------------------------------------------");
                }
            }
    }
    public void actualizarEstadoOrden()
    {
        System.out.println("Ingrese el Id del producto que desea actualizar el estado de la orden");
            int nModificar = Leer.nextInt();

            for (int i = 0; i < ids.length; i++) 
            {
                if (ids[i]==nModificar) 
                {
                    System.out.println("Ingrese el estado al que desea actualizar el pedido con Id: " + ids[i]);

                    System.out.println("Ingrese el estado del pedido " + ids[i]);
                    estados[i] = Leer.next();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Modificacion Exitosa");
                    System.out.println("--------------------------------------------------");
                    System.out.println("El Id del pedido es :   |   " + ids[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("El nuevo estado del pedido es:      |   " + estados[i] );
                    System.out.println("--------------------------------------------------");
                }     
            }
    }
    public void modificarCatalogo()
    {
        System.out.println("Ingrese el Id del producto que desea modificar");
            int nModificar = Leer.nextInt();
            for (int i = 0; i < idsPro.length; i++) 
            {
                if (idsPro[i]==nModificar) 
                {
                    System.out.println("Ingrese el dato que desea remplezar del producto con el Id: " + idsPro[i]);

                    System.out.println("Ingrese el modelo del producto " + idsPro[i]);
                    modelos[i] = Leer.next();
        
                    System.out.println("Ingrese la descripcion del producto " + idsPro[i]);
                    descripcions[i] = Leer.next();
        
                    System.out.println("Ingrese el nombre del producto " + idsPro[i]);
                    nombres[i] = Leer.next();
        
                    System.out.println("Ingrese el precio de la venta del producto " + idsPro[i]);
                    precioVentas[i] = Leer.nextDouble(); 
        
                    System.out.println("Ingrese la categoria del producto " + idsPro[i]);
                    categorias[i] = Leer.next();

                    System.out.println("Modificacion Exitosa");

                    System.out.println("El Id del producto es :   |   " + idsPro[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Modelo del producto:      |   " + modelos[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Descripcion del producto: |   " + descripcions[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nombre del producto:      |   " + nombres[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Precio del producto:      |   " + precioVentas[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Categoria del producto:   |   " + categorias[i] );
                    System.out.println("--------------------------------------------------");
                    break;
                }     
            }
    }
}

