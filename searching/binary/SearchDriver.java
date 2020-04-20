// only look at this code if you have read and understood the
// LinearSeach example.

// this is our driver.  We have two different versions of the
// binary search you can switch between below.

// in this example, we have the same data as before, it has
// just been sorted to its in a 'natural order'. (We'll talk
// more about sorting and how its accomplished in the next lab).

// When we know the data is sorted, we can find our data much 
// more quickly.  Think if I handed you a sorted deck of cards
// and asked you the same question from last time, 'find me the
// 3 of clubs'.  You can easily select the black cards, ignoring
// all the red.  You can easily select the clubs, ignoring all
// the spades.  You look at the values starting in the middle
// and note that '3 is less than 8', then '3 is less than 4',
// then 'there it is!'.  Because th deck was sorted, you could
// ignore half the deck every time you made a decision.

// thats a 'binary search'.

public class SearchDriver {

  public static void main(String[] args) {
    // same data as before, just sorted.
    int[] data = {0, 15, 19, 43, 44, 54, 58, 85, 99, 112, 139,
                  142, 143, 149, 187, 189, 193, 202, 205, 217,
                  229, 231, 244, 264, 267, 298, 313, 317, 339,
                  341, 352, 353, 356, 358, 370, 371, 382, 384,
                  389, 398, 400, 402, 414, 416, 434, 460, 471,
                  481, 490, 511, 522, 529, 533, 534, 551, 560,
                  563, 565, 572, 591, 599, 607, 610, 617, 647,
                  662, 664, 667, 674, 696, 698, 701, 703, 708,
                  711, 712, 715, 724, 734, 740, 761, 784, 785,
                  793, 800, 804, 815, 832, 856, 860, 862, 867,
                  879, 881, 895, 896, 935, 971, 983, 993};
    
    // 
    int element = 895;

    // here are the two different implementations you can switch
    // between.  They both do the same thing, but the way the
    // code does it is different.
    int index = BinarySearcher.search(data, element);
    //int index = RecursiveBinarySearcher.search(data, element);


    // same code from before.
    if (index > -1) {
      System.out.println("Data element " + element + " found at index " + index + ".");
    } else {
      System.out.println("Data element " + element + " not found");
    }
  
  }

}

// Several questions:
// 1. In our linear search, the worst case in a 100 element list was
//    100 comparisons.  What is the worst case with a binary search?
//
// 2. In our linear search, on average we'd need 50 comparisons to
//    find our element.  Whats the average here?
//
// 3. how does this performance change if you have to search 1000
//    elements? 10,000 elements?
//
// 4. Can you think of a mathematical function you've learned in
//    any of your math classes that might predict the max number of
//    comparisons you need to find an element in a data set of a given
//    size?
//
// 5. Based on learning to count in binary earlier this year, can you
//    explain why this might be called a 'binary search'?
//
// 6. How can we sort our data so we can take advantage of that gain?
