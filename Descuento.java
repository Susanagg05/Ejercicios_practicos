public class Descuento{
	public static void main(String[] args){
		double pago;
		double resultado;
		double valorapagar;
		double descuento;
		pago=50000;
		descuento=0.5;
		resultado=0;
		valorapagar=0;
		resultado=(pago*descuento);
		valorapagar=pago-resultado;
		System.out.print("El resultado final es "+valorapagar);
	}
}