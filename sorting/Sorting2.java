import java.util.ArrayList;


// in this example, we're going to roll our own sorting algorithm rather than
// rely on the built-in java sorting method.  Other than that, the basic
// structure of generating 1000 random numbers is the same.

public class Sorting2 {


  // and here is our algorithm, the granddaddy of them all, Bubblesort.
  // Rather than explain it here, check out this Youtube video:
  //
  // https://youtu.be/aXXWXz5rF64
  //
  // That video shows both Bubblesort and Quicksort.  Once you understand how
  // bubblesort works, step through this code. the comments will make sense:
  
  public static void bubblesort(ArrayList data) {
    // the outerloop counts from the top down because after every run of the
    // inner loop, the last element is in sorted position. (sorresponding to
    // the 'brightest ball' in the video.
    for (int outerloop = data.size()-1 ; outerloop > 0; outerloop--) {
      // we run through the list inspecting the values and swapping when needed.
      for (int innerloop = 0; innerloop < outerloop; innerloop++) {
        int first = (int) data.get(innerloop);
        int second = (int) data.get(innerloop+1);
        if ( first > second) {
          // and here's the swap.  If first is bigger than second, we swap the values
          data.set(innerloop, second);
          data.set(innerloop+1, first);
        }
      }
    }
  }
   
  // Bubblesort is an easy-to-understand algorithm, but it is also horribly
  // inefficient.  In the video above you can see that QuickSort is faster.
  // And this is where 'sorting is a class in Computer Science' comes from...
  // there are literally dozens of sorting algorithms, and people drag-race
  // them all the time.  Some are better when data is completely random,
  // some are better when the data is already semi-sorted, some are more
  // memory efficient, etc.  Here are some great resources for going deeper
  // on this subject.
  //
  // Insertion Sort: https://youtu.be/TZRWRjq2CAg
  // Merge Sort: https://youtu.be/es2T6KY45cA
  // Heap Sort: https://youtu.be/H5kAcmGOn4Q
  // a noisy visualization of 16 different sorting algorithms: https://youtu.be/kPRA0W1kECg
  // 
  // and finally, a video that touches on the details of how we can measure
  // softing algorithms with the computer science concept of 'algorithmic complexity'
  // and 'big O notation'.
  // https://youtu.be/RGuJga2Gl_k
   
   
  // This code is almost exactly the same as the 'main' code in Sorting1.
  // The only different is the call to our own 'bubblesort' as opposed to
  // the built-in Collections.sort() method in Java.
  public static void main(String[] args) {
    // container for the data we're working with in this example
    ArrayList data = new ArrayList();
  
    //lets generate 1,000 random numbers and stick them in our ArrayList:
    for (int i = 0; i < 1000; i++) {
      data.add((int) (Math.random() * 100000));
    }
  
    // display some data to show it is random:
    System.out.println("First 20 random numbers:");
    for (int i = 0; i < 20; i++) {
      System.out.print(data.get(i) + " ");
    }
    System.out.println();
    
    // here's the only line that is different from the 'main' method in Sorting1
    bubblesort(data);


    // display some data to show it is now sorted:
    System.out.println("First 20 sorted numbers:");    
    for (int i = 0; i < 20; i++) {
      System.out.print(data.get(i) + " ");
    }
    
  }
}

// I'm done with asking you questions for this lab, but if you
// want to be challenged a little more, watch some of those videos
// above and implement one of those algorithms. You could also
// research which algorithm Java is using under the hood and why.