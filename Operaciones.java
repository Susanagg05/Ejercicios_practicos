import java.util.Scanner;
public class Operaciones{
public static void main(String[] args)
{
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre= sc.nextLine();
		System.out.println("Ingrese numero1");
		int numero1=sc.nextInt();
		System.out.println("Ingrese numero2");
    	int numero2=sc.nextInt();

    	double dd= (double)numero1/numero2;
    
    System.out.println(nombre);
	System.out.println(numero1+numero2);
	System.out.println(numero1-numero2);
	System.out.println(numero1*numero2);
	System.out.println(dd);
	System.out.println(numero1^numero2);
	System.out.println(numero1=numero2);
	System.out.println(numero1<numero2);
	System.out.println(numero1>numero2);
	System.out.println(numero1>=numero2);
	System.out.println(numero1<=numero2);
    System.out.println(numero1!=numero2);

}
}