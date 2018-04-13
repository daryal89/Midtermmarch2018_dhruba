package algorithm;

import databases.ConnectDB;
import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] expectedSortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();

        //apply unsorted array to selectionSort.
        int[] actualSortedArray = sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : SelectionSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //-------------------------------------------------------------------------
        //apply unsorted array to InsertionSort.
        actualSortedArray = sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : InsertionSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to bubbleSort.
        actualSortedArray = sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubbleSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : bubbleSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to mergeSort.
        actualSortedArray = sort.mergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the mergeSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : mergeSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to quickSort.
        actualSortedArray = sort.quickSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubbleSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : quickSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to heapSort.
        actualSortedArray = sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heapSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : heapSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to bucketSort.
        actualSortedArray = sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucketSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : bucketSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //--------------------------------------------------------------------------
        //apply unsorted array to shellSort.
        actualSortedArray = sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the shellSort algorithm.
        try {
            Assert.assertEquals(expectedSortedArray, actualSortedArray, "Array is not Sorted");
            System.out.println("Array Sorted : shellSort");
        } catch (Exception ex) {
            ex.getMessage();
        }
        //----------------------------------------------------------------------------
        ConnectDB connectDB = new ConnectDB();
        Sort sort1 = new Sort();
        //verify if the unsorted array is sorted by the selectionSort algorithm
        int[] actualSortedArray1 = sort1.selectionSort(unSortedArray);
        connectDB.insertDataFromArrayToMySql(actualSortedArray1, "selection_sort_unit_test", "sortingNumbers");
        System.out.println("Sorting completed");
        // Convert list to array
        /*
        int[] numbers = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numbers[i] = Integer.parseInt(numbers.get(i));
            //verify if the unsorted array is sortedby the selection sort algorithm
            try {
                Assert.assertEquals(actualSortedArray1, numbers, "Array is not sorted");
                System.out.println("Array is sorted");
            } catch (Exception ex) {
                ex.getMessage();
            }
*/
        }
    }


