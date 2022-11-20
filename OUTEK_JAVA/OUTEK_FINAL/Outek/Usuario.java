package Outek;
import java.util.Scanner;

public class Usuario 
{
  int cantidad = 0;
    int cedula;
    String nombre;
    String apellido;
    int telefono;
    String correo;
    String dirreccion;
        int [] cedulas = new int [10000];
        String [] nombres = new String [10000];
        String [] apellidos = new String [10000];
        int [] telefonos= new int [10000];
        String [] correos= new String [10000];
        String [] dirreccions = new String [10000];

    Scanner Leer =new Scanner(System.in);
    public void personal_Ventas() 
    {
        System.out.println("BIENVENIDO");
        System.out.println("Ingrese la cantidad de empleados que desea registrar:");
        cantidad = Leer.nextInt();
        for (int i = 0; i < cantidad; i ++)
        {
            System.out.println("Ingrese el numero de cedula del personal de ventas " + (i + 1));
            cedulas[i] = Leer.nextInt();

            System.out.println("Ingrese el nombre del personal de ventas " + cedulas[i]);
            nombres[i] = Leer.next();

            System.out.println("Ingrese el apellido del personal de ventas " + cedulas[i]);
            apellidos[i] = Leer.next();

            System.out.println("Ingrese el numero de telefono del personal de ventas " + cedulas[i]);
            telefonos[i] = Leer.nextInt();

            System.out.println("Ingrese el correo del personal de ventas " + cedulas[i]);
            correos[i] = Leer.next();

            System.out.println("Ingrese la dirrección del personal de ventas " + cedulas[i]);
            dirreccions[i] = Leer.next();
        }
            
        

        for (int v = 0; v < cantidad; v++) 
        {
            
                System.out.println("El numero de cedula es:  :        |   " + cedulas[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("El nombre es:            |   " + nombres[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("El apellido es:      |   " + apellidos[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("El numero de telefono es:   |   " + telefonos[v]);
                System.out.println("--------------------------------------------------");
                System.out.println("El correo es:      |   " + correos[v] );
                System.out.println("--------------------------------------------------");
                System.out.println("La dirreccion es:          |   " + dirreccions[v] );
                System.out.println("--------------------------------------------------");
        }
        int menu = 0;
        System.out.println("Dijite 1) Si desea CONSULTAR un personal de ventas, 2) Si desea Modificar un personal de ventas, 3) Si desea Eliminar un personal de ventas");
        menu = Leer.nextInt();

        if (menu == 1) 
        {

            
            System.out.println("Ingrese el numero de cedula del personal de ventas que desea consultar:");
            int nConsultar = Leer.nextInt();
            

            for (int i = 0; i < cedulas.length; i++) 
            {
                if (cedulas[i]==nConsultar)
                {
                    System.out.println("El numero de cedula es:        |   " + cedulas[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("El nombre es:            |   " + nombres[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Descripcion del pedido:      |   " + apellidos[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor unitario del pedido:   |   " + telefonos[i]);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor total del pedido:      |   " + correos[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nombre del cliente:          |   " + dirreccions[i] );
                    System.out.println("--------------------------------------------------");
       
                    break;
                }
            }
        } 
        else if (menu == 2)
        {

            System.out.println("Ingrese el cedula del personal de ventas que desea modificar");
            int nModificar = Leer.nextInt();

            for (int i = 0; i < cedulas.length; i++) 
            {
                if (cedulas[i]==nModificar) 
                {
                    System.out.println("Ingrese el dato que desea remplezar del personal de ventas con el numero de cedula: " + cedulas[i]);

                    System.out.println("Ingrese el numero de cedula del personal de ventas" + (i + 1));
                    cedulas[i] = Leer.nextInt();

                    System.out.println("Ingrese la fecha del pedido " + cedulas[i]);
                    nombres[i] = Leer.next();

                    System.out.println("Ingrese la descripcion del pedido " + cedulas[i]);
                    apellidos[i] = Leer.next();

                    System.out.println("Ingrese el valor unitario del Pedido " + cedulas[i]);
                    telefonos[i] = Leer.nextInt();

                    System.out.println("Ingrese el valor total del pedido " + cedulas[i]);
                    correos[i] = Leer.next(); 

                    System.out.println("Ingrese el nombre del Cliente que realizo el pedido " + cedulas[i]);
                    dirreccions[i] = Leer.next();

                    System.out.println("Modificacion Exitosa");

                   System.out.println("El numero de cedula es:        |   " + cedulas[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("El nombre es:            |   " + nombres [i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Descripcion del pedido:      |   " + apellidos[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor unitario del pedido:   |   " + telefonos[i]);
                    System.out.println("--------------------------------------------------");
                    System.out.println("Valor total del pedido:      |   " + correos[i] );
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nombre del cliente:          |   " + dirreccions[i] );
                    System.out.println("--------------------------------------------------");
                    break;
                }     
            }
        }

        else if (menu == 3) 
        {
            for (int i = 0; i < cedulas.length; i++) 
            {
                System.out.println("Digite el numero de cedula del personal de ventas que desea eliminar");
                int nEliminar=Leer.nextInt();  
                if(cedulas[i]==nEliminar)
                {
                    System.out.println("Va a eliminar el personal de ventas: "+ cedulas[i] );
                    System.out.println("Eliminacion Exitosa");
                    break;
                }
            }
        }
    }
    public void asignarTipoUsuario()
    {
        int seleccion;
        System.out.println("Por favor digite 1 si desea asignar permiso de empleado a un personal de ventas, dijite 2 si desea salir del programa.");
        seleccion=Leer.nextInt();
        switch(seleccion)
        {
            case 1:
            {
                System.out.println("Ingrese el numero de cedula del personal de ventas que desea asignarle el permiso de empleado:");
                int nConsultar = Leer.nextInt();

                for (int i = 0; i < cedulas.length; i++) 
                {
                    if (cedulas[i]==nConsultar)
                    {
                        System.out.println("--------------------------------------------------");
                        System.out.println("El numero de cedula es:        |   " + cedulas[i] );
                        System.out.println("--------------------------------------------------");
                        System.out.println("El permiso de empleado se le asigno al empleado con cedula: " + cedulas[i] );
                    }
                }
                break;
            }
            case 2:
            {
                System.exit(seleccion);
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        Usuario  T = new Usuario();
        T.personal_Ventas();
        T.asignarTipoUsuario();

    } 
}