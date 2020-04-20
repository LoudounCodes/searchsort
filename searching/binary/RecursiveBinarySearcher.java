// only look at this code if you have read and understood the
// LinearSeach example.
//
// start by looking at the SearchDriver.java file.

// This is exactly the same algorithm in the other BinarySearcher
// file, but this one uses recursion instead of a while loop.
// why recursion?
// Well... lets think about the algorithm...
// look at the middle element.  If its not it, split the list
// in half and ... look at the middle element.  It thats not it,
// split the list in half and... so on and so on...  The problem
// definition refers to itself... recursion is a natural fit!
public class RecursiveBinarySearcher {

  // this is our public method that looks the same as the other
  // definition.  All it does is set the left and right to the
  // maximum values, then calls the internal recursive definition.
  public static int search(int[] data, int candidate) {
  
    int left = 0;
    int right = data.length - 1;
    
    return internalSearch(data, candidate, left, right);
    
  }

  // our recursive definition:
  private static int internalSearch(int[] data, int candidate, int left, int right) {
  
       // Our recursive base case if we've found nothing.
       if (right < left) {
         return -1;
       }
       
       // our recursive base case if we've found the element.
       int middle = (left + right)/2;
       if ( data[middle] == candidate ){
         return middle;
       }

       // Here's where we recurse... on the lower half if our tested
       // element is too big, and on the upper half if our tested
       // element is too low.
       if ( data[middle] < candidate ){  
         return internalSearch(data,candidate, middle+1, right);
       } else {
         return internalSearch(data,candidate, left, middle-1);
       }
  }
}