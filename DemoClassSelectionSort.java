package demoSelectionSortPackage;

public class DemoClassSelectionSort {
	public static void main (String[] args) {
		double[] myList = {2, 9, 5, 4, 8, 1, 6};
		selectionSort(myList);
		for (int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + " ");
		}
		
		
	}
    /** the method for sorting the number IN DECREASING ORDER*/
	  public static void selectionSort(double[] list) {
		    for (int i = list.length - 1; i > 0; i--) {
		      // Find the MAXIMUM in the list[0..i]
		      double currentMax = list[i];
		      int currentMaxIndex = i;

		      for (int j = i - 1; j >= 0; j--) {
		        if (currentMax < list[j]) {
		          currentMax = list[j];
		          currentMaxIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMaxIndex != i) {
		        list[currentMaxIndex] = list[i];
		        list[i] = currentMax;
		      }
		    }
		  }

	
	

}
