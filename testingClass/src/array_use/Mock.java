package array_use;

public class Mock {

		public static void main(String[] args) {
			  int[] arr = { 11, 22, 44, 66, 77, 88, 99, 12, 23, 45, 67 };

		       
		        int largest = arr[0]; 

		        
		        for (int num : arr) {
		            if (num > largest) {
		                largest = num;
		            }
		        }

		        
		        System.out.println("The largest number is: " + largest);
		}

	}
	


