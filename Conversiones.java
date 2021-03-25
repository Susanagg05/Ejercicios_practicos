public class Conversiones {
	public static void main(String[] args){
		byte byte1;//Declaración de variables
		short short1, short2;
		char caracter;
		int int1, int2, int3, int4;
		float float1, float2, float3, float4, float5, float6;
		long long1, long2, long3, long4, long5;
		double double1, double2, double3, double4, double5, double6;

		byte1=125;//Byte
		short1=byte1;//De byte a short
		int1=byte1;//De byte a int
		float1=byte1;//De byte a float
		long1=byte1;//De byte a long
		double1=byte1;//De byte a double

		short2=31000;//Short
		double2=short2;//De short a double
		long2=short2;//De short a long
		float2=short2;//De short a float
		int2=short2;//De short a int

		caracter='-';//Char
		double3=caracter;//De char a double
		long3=caracter;//De char a long
		float3=caracter;//De char a float
		int3=caracter;//De char a int

		int4=2147483647;//int
		double4=int4;//De int a double
		long4=int4;//De int a long
		float4=int4;//De int a float

		long5=9223372036854775807l;//Long
		double5=long5;//De long a double
		float5=long5;//De long a float

		float6=77338829929202082833838888882929222029f;//Float
		double6=float6;//De float a double

		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(float1);
		System.out.println(long1);
		System.out.println(double1);
		System.out.println(short2);
		System.out.println(double2);
		System.out.println(long2);
		System.out.println(float2);
		System.out.println(int2);
		System.out.println(caracter);
		System.out.println(double3);
		System.out.println(long3);
		System.out.println(float3);
		System.out.println(int3);
		System.out.println(int4);
		System.out.println(double4);
		System.out.println(long4);
		System.out.println(float4);
		System.out.println(long5);
		System.out.println(double5);
		System.out.println(float5);
		System.out.println(float6);
		System.out.println(double6);
	}
}