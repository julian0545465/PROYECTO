package Outek;
import java.util.*;

public class Administrador 
{
    public static void main(String[] args) 
    {
        Administrador administrador= new Administrador();
        administrador.consultarInformesVentas();
    }
    int [] idsVe = {1,2,3,4};
    String [] cliCedulaVe = {"1010840530","10102121","121212","11111111"};
    String [] fechaVe = {"2022-09-01","2001-02-24","2005-24-03","2022-04-12"};
    String [] descripcionVe = {"Se entrega un procesador","Se entrega una grafica","Se Entrega una memoria Ram,","Se entrega un disipador"};
    String [] metodoPagoVe = {"Efectivo","Tarjeta","Efectivo","Tarjeta"};
    String [] empleadoVe =  {"Jose","Jose","Juan","Juan"};
    Scanner leer = new Scanner(System.in);

    public void consultarInformesVentas()
    {
        System.out.println("Solo existen 4 Id de informes de ventas por favor seleccione el que desea consultar, 1, 2, 3 y 4.");
        System.out.println("Ingrese el Id del informe de ventas que desea consultar:");
        int nConsultar = leer.nextInt();
        for (int i = 0; i < idsVe.length; i++) 
        {
            if (idsVe[i]==nConsultar)
            {
                System.out.println("El Id de la venta es :        |   " + idsVe[i] );
                System.out.println("--------------------------------------------------");
                System.out.println("La cedula del cliente es :            |   " + cliCedulaVe[i] );
                System.out.println("--------------------------------------------------");
                System.out.println("La fecha de la venta es :            |   " + fechaVe[i] );
                System.out.println("--------------------------------------------------");
                System.out.println("La descripcion de la venta es :            |   " + descripcionVe[i] );
                System.out.println("--------------------------------------------------");
                System.out.println("El metodo de pago de la venta es :            |   " + metodoPagoVe[i] );
                System.out.println("--------------------------------------------------");
                System.out.println("El empleado que lo vendio fue :            |   " + empleadoVe[i] );
                System.out.println("--------------------------------------------------");
                }
            }
    }
}

