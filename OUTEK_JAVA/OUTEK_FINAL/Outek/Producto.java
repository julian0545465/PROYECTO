package Outek;
import java.util.Scanner;

public class Producto 
{
        
   int id;
   String descripcion;
   String modelo;
    String nombre;
    Double precioVenta;
   int cantidad;
    String categoria;
     int [] ids = new int [100000];
        String [] modelos = new String [1000000];
       String [] descripcions = new String [1000000];
       String [] nombres = new String [100000];
        double [] precioVentas = new double [100000];
    String [] categorias = new String [100000];
    
   Scanner Leer =new Scanner(System.in);
   public void MProducto()
   {
       
       int cantidad;
       System.out.println("Ingrese la cantidad de productos que desea ingresar:");
       cantidad = Leer.nextInt();
       for (int i = 0; i < cantidad; i ++)
       {
           System.out.println("Ingrese el Id del producto " + (i + 1));
           this.id=Leer.nextInt();
           ids[i]=this.id;

           System.out.println("Ingrese el modelo del producto " + ids[i]);
           this.modelo=Leer.next();
           modelos[i]=this.modelo;

           System.out.println("Ingrese la descripcion del producto " + ids[i]);
           this.descripcion=Leer.next();
           descripcions[i]=this.descripcion;

           System.out.println("Ingrese el nombre del producto " + ids[i]);
           this.nombre=Leer.next();
           nombres[i]=this.nombre;

           System.out.println("Ingrese el precio de la venta del producto " + ids[i]);
           this.precioVenta=Leer.nextDouble();
           precioVentas[i]=this.precioVenta;

           System.out.println("Ingrese la categoria del producto " + ids[i]);
           this.categoria=Leer.next();
           categorias[i]=this.categoria;
       }
           
       

       for (int v = 0; v < cantidad; v++) 
       {
           
               System.out.println("El Id del producto es :   |   " + ids[v] );
               System.out.println("--------------------------------------------------");
               System.out.println("Modelo del producto:      |   " + modelos[v] );
               System.out.println("--------------------------------------------------");
               System.out.println("Descripcion del producto: |   " + descripcions[v] );
               System.out.println("--------------------------------------------------");
               System.out.println("Nombre del producto:      |   " + nombres[v]);
               System.out.println("--------------------------------------------------");
               System.out.println("Precio del producto:      |   " + precioVentas[v] );
               System.out.println("--------------------------------------------------");
               System.out.println("Categoria del producto:   |   " + categorias[v] );
               System.out.println("--------------------------------------------------");
       }
   
       int menu = 0;
       System.out.println("Dijite 1) Si desea CONSULTAR un producto, 2) Si desea Modificar un producto, 3) Si desea Eliminar un producto");
       menu = Leer.nextInt();

       if (menu == 1) 
       {

           int Continuar;
           do 
           {
           System.out.println("Ingrese el Id del producto que desea consultar:");
           int nConsultar = Leer.nextInt();
           Boolean encontrado = false;
           

           for (int i = 0; i < ids.length; i++) 
           {
               if (ids[i]==nConsultar)
               {
                   
                   System.out.println("El Id del producto es :   |   " + ids[i] );
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

           System.out.println("Ingrese el Id del producto que desea modificar");
           int nModificar = Leer.nextInt();
           Boolean modificado = false;

           for (int i = 0; i < ids.length; i++) 
           {
               if (ids[i]==nModificar) 
               {
                   System.out.println("Ingrese el dato que desea remplezar del producto con el Id: " + ids[i]);

                   System.out.println("Ingrese el modelo del producto " + ids[i]);
                   modelos[i] = Leer.next();
       
                   System.out.println("Ingrese la descripcion del producto " + ids[i]);
                   descripcions[i] = Leer.next();
       
                   System.out.println("Ingrese el nombre del producto " + ids[i]);
                   nombres[i] = Leer.next();
       
                   System.out.println("Ingrese el precio de la venta del producto " + ids[i]);
                   precioVentas[i] = Leer.nextDouble(); 
       
                   System.out.println("Ingrese la categoria del producto " + ids[i]);
                   categorias[i] = Leer.next();
                   modificado = true;
                   System.out.println("Modificacion Exitosa");

                   System.out.println("El Id del producto es :   |   " + ids[i] );
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

       else if (menu == 3) 
       {
           for (int i = 0; i < ids.length; i++) 
           {
               System.out.println("Digite el id del producto que quiere eliminar");
               int nEliminar=Leer.nextInt();  
               if(ids[i]==nEliminar)
               {
                   System.out.println("Va a eliminar el producto con codigo "+ ids[i] );
                   System.out.println("Eliminacion Exitosa");
                   break;
               }
           }
       }
   }
   public void  MostrarCatalogo()
   {    
     
     for (int i = 0; i < id; i++) 

           {   
               System.out.println("El Id del producto es :   |   " + ids[i] );
               System.out.println("--------------------------------------------------");
               System.out.println("Modelo del producto:      |   " + modelos[i] );
               System.out.println("--------------------------------------------------");
               System.out.println("Descripcion del producto: |   " + descripcions[i] );
               System.out.println("--------------------------------------------------");
               System.out.println("Nombre del producto:      |   " + nombres[i]);
               System.out.println("--------------------------------------------------");
               System.out.println("Precio del producto:      |   " + precioVentas[i] );
               System.out.println("--------------------------------------------------");
               System.out.println("Categoria del producto:   |   " + categorias[i] );
               System.out.println("--------------------------------------------------");
           }     
   }
   public static void main(String[] args) 
   {
       Producto producto = new Producto(); 
       producto.MProducto();
       producto.MostrarCatalogo();   
   } 
}


    
   