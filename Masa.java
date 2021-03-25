import java.util.Scanner;
public class Masa{
	public static void main(String[] args){
    Scanner sc= new Scanner (System.in);
    System.out.println("Ingrese su altura en m");
    float altura= sc.nextFloat();
    System.out.println("Ingrese su peso en kg");
    double peso= sc.nextDouble();
    double imc;//Indice de masa corporal
    imc=peso/(altura*altura);
    if(imc<=18.5)
    {
    	System.out.println("Usted se encuentra bajo de peso");
    }
    if(imc>=18.6 && imc<=24.9)
    {
    	System.out.println("Ustes se encuentra en un peso normal");
    }
    if(imc>=25.0 && imc<=29.9)
    {
    	System.out.println("Usted se encuentra en sobre peso");
    }
    if(imc>30)
    {
    	System.out.println("Usted se encuentra obeso");
    }
    System.out.println("Su resultado de imc es: "+imc);
	}
}