public class Demo{
	public static void main(String[] args){
	float x;
	float y;
	float resultado;
	y=3f;
	x=2f;
	resultado=(((x*x+y)*(x*x+y))/(2+((y/(1+x)))))+2*x;
	System.out.println("La respuesta es"+ resultado);
	}
}