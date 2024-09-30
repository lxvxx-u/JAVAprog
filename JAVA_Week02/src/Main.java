// import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Scanner sc = new Scanner(System.in);
		
		//////////////////// 실습 문제 2 ////////////////////
		// 섭씨 -> 화씨
		// 24.3도
		
		/*
		float celsius = 24.3f;
		float fahrenheit = celsius * (9/5) + 32;
		System.out.printf("Fahrenheit %.2f is %f.2 in Celsius\n", fahrenheit, celsius);
		*/
		///////////////////////////////////////////////////
		
		//////////////////// 실습 문제 6 ////////////////////
		// float
		/*
		float[] MyArr = {1.1f, 2.3f, 4.7f, 7.5f};
		
		System.out.println("<float로 출력>\n");
		for(int i = 0; i<4;i++)
		{
			System.out.printf("MyArr[%d] = %.1f\n", i, MyArr[i]);
		}
		*/
		///////////////////////////////////////////////////
		
		float[] arr1 = {1.1f, 2.3f, 4.7f, 7.5f}; // 초기화
		double[] arr2 = new double[4]; // 선언
		
		for(int i = 0; i < 4;i++)
		{
			arr2[i] = arr1[i];
			System.out.printf("arr2[%d] = %f	arr1[%d] = %f\n", i, arr2[i], i, arr1[i]);
		}
		
	}

}
