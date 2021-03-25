public class Condicionales{
	public static void main(String[] args){
		byte hora=23;
		if(hora<12)
		{
			System.out.println("Buenos días");
		}
		if(hora>12&&hora<18)
		{
			System.out.println("Buenas tardes");
		}
		if(hora>18&&hora<22)
		{
			System.out.println("Buenas noches");
		}
		else
		{
			System.out.println("Feliz año");
		}
	}
}