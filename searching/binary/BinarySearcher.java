// only look at this code if you have read and understood the
// LinearSeach example.
//
// start by looking at the SearchDriver.java file.


// given the data and a candidate, this code:
// looks at the middle element in the range.
// is it our candidate?
// if its lower, repeat the strategy on the lower half.
// if its higher, repeat the strategy on the higher half.
// if we run out of candidates, return -1.
public class BinarySearcher {

  public static int search(int[] data, int candidate) {
    int left = 0;  // leftmost element of range to test
    int right = data.length - 1; // rightmost element of range to test
    
    while(left <= right) {
       int middle = (left + right)/2;
       
       if ( data[middle] == candidate ){
         return middle; // we found it!
       }

       if ( data[middle] < candidate ){  
         left = middle + 1; // next loop we look in the upper half
       } else {
         right = middle - 1; // next loop we look in the lower half
       }
    }
    
    return -1; // we didn't find it. Spec says to return -1.
  }
  
}

