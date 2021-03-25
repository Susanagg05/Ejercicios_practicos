public class Ecuacion{
	public static void main(String[] args){
		float a,b,c,d,x;//Declaración
		byte y=2, z=5;
		x=0.0f;//Inicialización, literal flotante por eso la f

		a=1;
		b=3*y+(1/((2+3*z)));
		c=1/(1+(y*y));
		d=1 + (1/((z*z*z)+z));
		x=(a/b) + (c/d);//Cuando se asigan un valor a float, no se pone F

		System.out.println("x="+x);


	}
}