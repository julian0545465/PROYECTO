package Outek;
import java.util.*;
public class Cliente 
{
       int cedula[]=new int[1];
       String nombre[]=new String[1];
       String apellido[]=new String[1];
       int telefono[]=new int[1];
       String correo[]=new String[1];
       String dirreccion[]=new String[1];
       String nom, ape, cor, dire;
       int ced, tel; 
        
       int Orden[] = new int[1000];
        Scanner leer = new Scanner(System.in);
        String[] ContenidoOrden = new String[500];

        int [] ids = {1,2,3,4};
        String [] modelos = {"Cv650","H410_m2","Intel_I5","KDA_G305_Lightspeed"};
        String [] descripcions = {"Fuente_de_energia","Placa_base","Procesador","Mouse"};
        String [] nombres = {"Fuente_corsair","Placa_GigaByte","Procesaror_10ma_Genaracion,","Mouse_Logitech"};
        double [] precioVentas = {310000,456555,755000,160000};
        String [] categorias =  {"Componentes","Componentes","Componentes","Perifericos"};


        
        public void Registrarse()
        {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("BIENVENIDO AL PROGRAMA");
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("POR FAVOR REGISTRARSE");
            System.out.println("Si necesita aplicar un espacio entre datos por favor colocar un raya a piso ");
            System.out.println("Ingrese su cedula: ");
            ced=leer.nextInt();
            cedula[0]=ced;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingrese su nombre: ");
            nom=leer.next();
            nombre[0]=nom;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingrese su apellido: ");
            ape=leer.next();
            apellido[0]=ape;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingrese su correo: ");
            cor=leer.next();
            correo[0]=cor;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingrese su direccion: ");
            dire=leer.next();
            dirreccion[0]=dire;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("Ingrese su telefono:");
            tel=leer.nextInt();
            telefono[0]=tel;
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("GRACIAS POR REGISTRARSE");
            System.out.println("--------------------------------------------------------------------------");
        }
        public void IniciarSesion()
        {
            System.out.println("INICIAR SESION PARA PODER INGRESAR AL PROGRAMA");
            System.out.println("INGRESE SU CEDULA:");
            ced=leer.nextInt();
            for(int i=0;i<cedula.length;i++)
            {
                if(ced==(cedula[i])) 
                {
                    System.out.println("Cedula correcta puede continuar");
                }
                else
                {
                    System.out.println("Cedula incorrecto no puede seguir.");
                    System.exit(i);
                }
            }
            System.out.println("INGRESE SU TELEFONO:");
            tel=leer.nextInt();
            for(int i=0;i<telefono.length;i++)
            {
                if(tel==telefono[i])
                {
                    System.out.println("Telefono correcto puede ingresar.");
                }
                else
                {
                    System.out.println("Telefono incorrecta no puede ingresar.");
                    System.exit(i);
                }
            }
        }
        public void MostrarCatalogo()
        {
            System.out.println("\n.........................Mostrando catalogo...............................");
            for (int v = 0; v < ids.length; v++) 
        {
                
                System.out.println("\nEl Id del producto es :   |   " + ids[v] );
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Modelo del producto:      |   " + modelos[v] );
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Descripcion del producto: |   " + descripcions[v] );
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Nombre del producto:      |   " + nombres[v]);
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Precio del producto:      |   " + precioVentas[v] );
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("Categoria del producto:   |   " + categorias[v] );
                System.out.println("\n"+"\n");
                
        }       
        }
        public void RealizarOrden()
        {
            int seleccion,cantidad;
            double precio=0;
            System.out.println("Digite cuantos productos va a agregar a su carrito");
            cantidad=leer.nextInt();               
                for(int i=0;i<cantidad;i++)
                {
                    System.out.println("Ingrese el id del producto que quiere agregar a su carrito");
                    seleccion = leer.nextInt();
                    Orden[i]=seleccion;       
                    if(ids[i]==seleccion)
                    {
                        System.out.println("\nEl Id del producto es :   |   " + ids[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Modelo del producto:      |   " + modelos[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Descripcion del producto: |   " + descripcions[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Nombre del producto:      |   " + nombres[i]);
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Precio del producto:      |   " + precioVentas[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Categoria del producto:   |   " + categorias[i] );
                        System.out.println("\n"+"\n");
                    } 
                    precio=precio+precioVentas[i];                   
                } 
                System.out.println("Orden final");
                System.out.println("\n--------------------------------------------------------------------------");
                for(int i=0;i<cantidad;i++)
                {
                        System.out.println("\nEl Id del producto es :   |   " + ids[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Modelo del producto:      |   " + modelos[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Descripcion del producto: |   " + descripcions[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Nombre del producto:      |   " + nombres[i]);
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Precio del producto:      |   " + precioVentas[i] );
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("Categoria del producto:   |   " + categorias[i] );
                        System.out.println("El total de su compra es: "+precio);
                        System.out.println("Sus numero de orden es:"+Orden[1]);
                }
                int eleccion=0;
                System.out.println("Seleccione un metodo de pago\nSeleccione 1 para efectivo\nSeleccione 2 para tarjeta");
                eleccion=leer.nextInt();
                switch(eleccion)
                {
                    case 1:
                    {
                        System.out.println("Para empezar el proceso debes llevar el dinero a nuestras instalaciones");
                        break;
                    }
                    case 2:
                    {
                        System.out.println("El dinero se descontara de tu cuenta proximamente ");
                        break;
                    } 
                    
                } 
                    int menu = 0;
                    System.out.println("Dijite 1 Si desea CONSULTAR su orden\n2) Si desea Eliminar orden");
                    menu = leer.nextInt(); 
                    if (menu == 1) 
                    {
            
                        int Continuar;
                        do 
                        {
                        System.out.println("Ingrese el numero de orden que desea consultar:");
                        int nConsultar = leer.nextInt();
                        for(int i=0;i<cantidad;i++)
                        {
                                System.out.println("\nEl Id del producto es :   |   " + ids[i] );
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Modelo del producto:      |   " + modelos[i] );
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Descripcion del producto: |   " + descripcions[i] );
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Nombre del producto:      |   " + nombres[i]);
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Precio del producto:      |   " + precioVentas[i] );
                                System.out.println("--------------------------------------------------------------------------");
                                System.out.println("Categoria del producto:   |   " + categorias[i] );
                                System.out.println("El total de su compra es: "+precio);
                                System.out.println("Sus numero de orden es:"+Orden[1]);
                        }
                        
                            
                            System.out.println("\nEscriba el numero 0 si desea continuar o cualquier numero para salir ");
                            Continuar= leer.nextInt();
            
                        } while (Continuar == 0);           
                    } 
                    else if (menu == 2) 
                    {
                        for (int i = 0; i <=1; i++) 
                        {
                            System.out.println("Digite el id de la orden que quiere cancelar");
                            int nEliminar=leer.nextInt();  
                            if(Orden[i]==nEliminar)
                            {
                                System.out.println("Confirmando");
                                System.out.println("Va a cancelar el producto con codigo "+ ids[i] );                         
                                System.out.println("Cancelación Exitosa");
                                break;
                            }
                        }
                    }
        }
    public void SalirSesion()
        {
            int sesion;
            System.out.println("Digite 1 para Cerrar sesion");
            sesion=leer.nextInt();
            if(sesion==1)
            {
                System.exit(0);
            }
        }
    public static void main(String[] args) 
        {
            Cliente cliente = new Cliente();
            cliente.Registrarse();
            cliente.IniciarSesion();
            cliente.MostrarCatalogo();
            cliente.RealizarOrden();
            cliente.SalirSesion();
        }   
}