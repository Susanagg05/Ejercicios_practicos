public class Clasificacion{
	public static void main(String[] args) {
		//Declaración
		byte numero1;
		int numero2;
		short numero3;
		char numero4;
		long numero5;
		float numero6;
		double numero7;
		byte numero8;
		int numero9;
		short numero10;
		int totalnegativos=0;
		int totalmenoresde=0;
		long totalmayoresde=0;
		//Inicialización
		numero1=-34;
		numero2=-365;
		numero3= 1234;
		numero4=4;
		numero5= 7846278l;
		numero6=0.25f;
		numero7=123.4;
		numero8=99;
		numero9=101;
		numero10=1287;

		if(numero1<0)
		{
		totalnegativos=totalnegativos+1;
		
		}
		if(numero1<100)
		{
          totalmenoresde=totalmenoresde+1;
		}
		if(numero1>5000)
		{
          totalmayoresde=totalmayoresde+1;
		}
		System.out.println("El total de negativos es :"+totalnegativos);
		System.out.println("El total de menores es :"+totalmenoresde);
		System.out.println("El total de mayores es :"+totalmayoresde);
}
}