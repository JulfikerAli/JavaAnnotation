package main;

/**
 * Calculator class implements that
 * simplify addition of two given double and print
 * simplify multiplication of two given double and Print
 * simplify subtraction of two given double and print
 * simplify modulus of two given double and print
 * @author Julfiker
 *@version 1.0
 *@since 2018-10-29
 */
public class Calculator 
{
	/**
	 * this method used to add two double number
	 * simplify two given integer and print
	 * @param Num1 this is first parameter of Calculating Summation
	 * @param Num2 this is second parameter of Calculating Summation
	 * @return this return summation of Num1 and Num2 parameter
	 */
	public static double CalSum(double Num1,double Num2)
	{
		return Num1+Num2;
	}
	/**
	 * this method used to multiply two double number
	 * simplify two given integer and print
	 * @param Num1 this is first parameter of Calculating Summation
	 * @param Num2 this is second parameter of Calculating Summation
	 * @return this return multiplication of Num1 and Num2 parameter
	 */
	public static double CalMul(double Num1,double Num2)
	{
		return Num1*Num2;
	}
	 
	 
	/**
	 * this method used to multiply two double number
	 * simplify two given integer and print
	 * @param Num1 this is first parameter of Calculating Summation method 
	 * @param Num2 this is second parameter of Calculating Summation method
	 * @return this return subtraction of Num1 and Num2 parameter
	 */
	public static double CalSub(double Num1,double Num2)
	{
		return Num1-Num2;
	}
	public static void main(String arg[])
	{
		double Sum,Mul,Sub;
		/**
		 * Calculating Summation method call
		 *print summation of two double parameter
		 */
		Sum=CalSum(2,3);
		System.out.println(Sum);
		/**
		 * Calculating Subtraction method call
		 * print subtraction of two double parameter
		 */
		Sub=CalSub(10,5);
		System.out.println(Sub);
		/**
		 * Calculating Multiplication method call
		 * print multiplication of two double parameter
		 */
		Mul=CalMul(6,5);
		System.out.println(Mul);
	}
}