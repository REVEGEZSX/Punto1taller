package punto1taller;
import java.util.Scanner;
/**
 *
 * @author Stiven Rafael Melendez Tovar
 */
public class Punto1taller 
{
    public static String nombre[] = new String[50];
    public static double nota;
    public static void main(String[] args) 
    {
        int cantE, posmay = 0, posmen = 0, Apro = 0;
        
        double notamay=0,notamen=5, notaprom = 0, notaacum = 0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el numero de estudiantes");
        cantE = leer.nextInt();
        
        for (int i = 0; i < cantE; i++) 
        {
            System.out.println("Ingrese el nombre del estudiante");
            nombre[i] = leer.next();
            
            System.out.println("ingrese la nota (1 a 5)");    
            nota = leer.nextDouble();
           
            notaacum = notaacum + nota;
            
            if(nota > notamay)
            {
                posmay = i;
                notamay = nota;
            }
            if(nota < notamen)
            {
                posmen = i;
                notamen = nota; 
            }
            
            if(nota == 3)
            {
                Apro++;
            }
        }
        notaprom = notaacum/cantE;
        System.out.println("el promedio de los estudiantes es: "+notaprom);
        System.out.println("El numero de estudiantes Aprobados cn el minimo es :"+Apro);
        
        System.out.println("La nota mayor es: "+notamay+" del estudiante "+nombre[posmay]);
        System.out.println("La nota menor es: "+notamen+" del estudiante "+nombre[posmen]);
        
        System.out.println("Lista de estudiantes");
        for(int x = 0; x<cantE;x++)
        {
            System.out.println(nombre[x]);
        }
    } 
}
