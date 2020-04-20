import java.util.ArrayList;
import java.util.Collections;

// In the Searching lab, we learned that there can be a big improvement in searching
// through sorted data... but now we need to learn how we can sort data in the first
// place.
//
// Sorted data is everywhere.  Your phone sorts your address book contacts alphabetically.
// Your teacher's attendance sheet has all the students in alphabetical order. The school
// sorts you all be GPA to decide your fates.  The photographer for any club you're in
// probably sorted you all be height for that yearbook photo.  Google sorts search results
// by some secret measure of 'relevance'.  In fact, sorting might be the most common
// thing computers do.
//
// So how do they do it?
//
// There's an old joke that in Software Engineering, 'sort' is a method you'll call, while
// in Computer Science, 'sort' in a class you'll take.  In thie example, we're going to
// use the built-in 'sort' function in Java.  Later examples will show you various ways
// to write your own sorting algorithm.

public class Sorting1 {

  
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
    
    // Here is where the magic happens. This one call takes the 1000 elements in our
    // data and sorts them according to their 'natural ordering'. For integers, that's
    // just their value... but 'natural ordering' is a deep rabbit hole... for instance,
    // if you were sorting all the students in Loudoun Valley High School, would you
    // sort them by name? GPA? Height?  Later on, we'll see how we can choose.
    Collections.sort(data);


    // display some data to show it is now sorted:
    System.out.println("First 20 sorted numbers:");    
    for (int i = 0; i < 20; i++) {
      System.out.print(data.get(i) + " ");
    }
    
  }
}

// you know enough about how computer programs work now to make some guesses about
// what might be happening underneath the hood of that 'Collections.sort()' call.
// How would you design an algorithm to do that?
//
// and THAT QUESTION is why we learn sorting algorithms.  There are dozens of different
// algorithms, and be learning them you learn:
// - how to think algorithmically. You'll learn a common 'bag of tricks' you can use
//   when designing your own algorithms.
// - some history of computer science. When and how were all these discovered anyway?
// - How to measure performance of algorithms. The most common of which is called
// - 'Big O notation', and by counting the number of comparisons in the searching lab,
//   you've already started to figure this our for yourself.