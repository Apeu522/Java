package pl.sda.binarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		 int array[] = {13,14,15,16,17,18,19,20,21};
		 
		 System.out.println(search(array, 15));
	}
	
	public static int search(int array[], int search){
		int start, end, middle;
		
		start = 0;
		end = array.length;
		
		middle = end / 2;
		
		while (start <= end){
			if (array[middle] < search){
				start = middle + 1;
			} else if(array[middle] == search) {
				return middle;
			} else {
				end = middle - 1;
			}
			
			middle = (start + end) / 2;
		}
		return -1;
	}
}

