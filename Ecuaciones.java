import java.util.Scanner;
public class Ecuaciones{
	public static void main(String[] args){

    Scanner sc= new Scanner (System.in);
    System.out.println("Ingrese valor para variable X");
    long variablex= sc.nextLong();
    System.out.println("Ingrese valor para variable Y");
    Long variabley= sc.nextLong();
    System.out.println("Ingrese valor para variable Z");
    Long variablez= sc.nextLong();
    System.out.println("Ingrese valor para variable W");
    long variablew= sc.nextLong();

    Long resultado;

    resultado=0l;
    resultado=(2*variablex)+(8-variabley)-(30/variablez)+(3^variablew);

    System.out.println("El resultado de la ecuación es:"+resultado);

	}
}