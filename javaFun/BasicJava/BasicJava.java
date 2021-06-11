import java.util.ArrayList;
public class BasicJava {
	public static void oneTo255(){
		for ( int i=1 ; i<=255; i++){
			System.out.println(i);
		}
	}

	public static void oddNumberFrom1To255(){
		for (int i=1;i<=255;i++){
			if(i%2 !=0){
				System.out.println(i);
			}
		}
	}

	public static void sumNumberFrom1To255(){
		int sum=0;
		for (int i=0;i<=255;i++){
			sum+=i;
			System.out.println("New number: "+ i +" "+" Sum: "+sum);
		}
	}

	public static  void valuesInArray(int[] arr){
		for (int value:arr){
			System.out.println(value);
		}
	}

	public static Integer findMax(int [] arr){
		int max=arr[0];
		for(int value:arr){
			if (value>max){
				max=value;
			}
		}
		return max;
	}

	public static Double getAverage(int [] arr){
		int sum=0;
		int count=0;
		for (int value:arr){
			sum+=value;
			count++;
		}
		double avg=sum/count;
		return avg;
	}

	public static ArrayList<Integer> oddArray(){
		ArrayList<Integer> arr= new ArrayList<Integer>();
		for (int i=1; i<=255;i++){
			if(i%2!=0){
				arr.add(i);
			}
		}
		System.out.println(arr);
		return arr;
	}

	public static void greaterThanY(int [] arr,int y){
		int count=0;
		for(int value:arr){
			if (value>y){
				count++;
			}
		}
		System.out.println(count);
	}

	public static ArrayList<Integer> squareArray(int[] arr){
		ArrayList<Integer> newArr= new ArrayList<Integer>();
		for(int value:arr){
			int x = value* value;
			newArr.add(x);
		}
		System.out.println(newArr);
		return newArr;
	}
	public static ArrayList<Object> minMaxAverageArray(int [] arr){
		ArrayList<Object> newArr= new ArrayList<Object>();
		int min = arr[0];
		for (int value:arr){
			if(value<min){
				min=value;
			}
		}
		newArr.add(min);
		int max=findMax(arr);
		double avg=getAverage(arr);
		newArr.add(max);
		newArr.add(avg);
		System.out.println(newArr);
		return newArr;

	}
	public static void EliminateNegatives(int[] arr) {
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] < 0){
			arr[i] = 0;
		}
	}
	}

	public static void main(String[] args){
		int [] arr= {20,50,-1,1,3,5,7,9,13};
		int [] arr2={2,10,3};
		BasicJava.oneTo255();
		oddNumberFrom1To255();
		sumNumberFrom1To255();
		valuesInArray(arr);
		int max=findMax(arr);
		System.out.println("max number = "+max);
		double avg=getAverage(arr2);
		System.out.println(avg);
		oddArray();
		greaterThanY(arr,13);
		squareArray(arr2);
		minMaxAverageArray(arr);
	}
}
