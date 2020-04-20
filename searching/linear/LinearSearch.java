// Lets say you have a bunch of data in an array (or in a file, or in
// a database...), and you want to know where a paricular pieceof data
// is.  Below is an array of 100 numbers, a random selection from 0 to
// 1000.  We want to write a method that will search the array for a
// given element and return its index in the array (or return -1 if
// the value isn't in the array).
//
// How can we do that?
//
// This code shows what's called a 'linear search'.  We look at the 0th
// element, then the 1st, then the 2nd, and so on until we either find
// the piece of data or run out the list.
//
// This is pretty much the same technique you'd use if I handed you a
// shuffled deck of cards and said "find me the 3 of spades'.

public class LinearSearch {


  // and here is the linear search. We loop through the array. Note the
  // 'for' loop, the 'return i' that will exit the loop once the element
  // is found, and the final 'return -1' if we exit the loop without
  // finding our piece of data.
  //
  // We'll call this method below.
  public static int search(int[] data, int element){
  
    for (int i = 0; i < data.length; i++) {
      if (data[i] == element) {
        return i;
      }
    }
    return -1;
  }  
  
  
  // and here is our main entry point for our code.
  public static void main(String[] args) {

    // 100 random numbers between 0 and 1000 we'll use as our data
    int[] data = {414, 935, 202, 511, 832, 784, 724, 44, 99, 353,
                  389, 591, 607, 0, 664, 460, 971, 617, 149, 356,
                  19, 313, 205, 298, 896, 54, 862, 142, 804, 15,
                  398, 856, 434, 696, 217, 563, 229, 800, 534,
                  112, 384, 860, 139, 264, 193, 189, 85, 815,
                  599, 43, 416, 712, 400, 701, 317, 565, 715,
                  551, 698, 58, 793, 490, 187, 662, 533, 711,
                  895, 867, 402, 881, 481, 785, 983, 993, 703,
                  879, 339, 674, 610, 761, 740, 143, 529, 708,
                  267, 667, 341, 382, 358, 560, 371, 231, 647,
                  471, 734, 572, 244, 370, 352, 522};
              
    // this is the element of data we are looking for
    int element = 352;
    
    // Here we call our search, getting the index of the element
    int index = search(data, element);

    // display a message appropriate to what we found.  Note that
    // if index == -1, we didn't find the element.
    if (index > -1) {
      System.out.println("Data element " + element + " found at index " + index + ".");
    } else {
      System.out.println("Data element " + element + " not found");
    }
  }
}

// Linear searches are common in computer programs, but they have
// a drawback.  Let me ask you a few questions based on the code
// for the search:
//
// 1. with 100 data elements, how many compares do we have to do
//    in order to determine the element we're looking for isn't
//    in the data?
//
// 2. Thinking in percentages, if the element we are looking for
//    is in the data, how often will we find it on the first
//    comparison?
//
// 3. How often will we find iton the last comparison?
//
// 4. If we were to search for, say, 20 elements we know are in
//    the list, how many comparisons will we have to do on average
//    to find each element?
//
// 5. How do those answers change if you're searching 10,000
//    data elements?  What if you were searching through the
//    social security numbers of every person in the U.S.?
//
// 6. Is there a more efficient way we can search?