/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingobjectswiththeinsertionsortalgorithm;

/**
 *
 * @author orlandomarin
 */

// CHAPTER 16 CHALLENGE #1: SORTING OBJECTS WITH THE INSERTION SORT ALGORITHM

/*
DIRECTIONS FROM BOOK:
The insertionSort method in the IntInsertionSorter class presented in this
chapter sorts an array of int values. Create an ObjectInsertionSorter class
that can sort Comparable objects. Demonstrate the class in a program that
sorts an array of String objects.
*/

/*
DIRECTIONS FROM BLACKBOARD:
Using constructs from this chapter or earlier, complete either
Programming Challenges #1, Sorting Objects with the Insertion Sort Algorithm on p1076
State which programming challenge you are submitting.
Create the object versions for the classes in the text. For your test program, you need to display the initial array, call your method, then display the sorted array.
Refer to the examples in the text for the bubble and selection sorts.
In addition to your program running correctly, you will be graded on:
use of comments. Your program needs to be properly commented.
use of appropriate variable names.
use of proper formatting of your output
Each class should be in a separate file.
When you are done, find the source file(s) in the project directory, find your java file(s) there and attach them to this assignment.
You also need to include a screenshot of the results. Your screenshot needs to display your name somewhere in the results.
*/

public class SortingObjectsWithTheInsertionSortAlgorithm 
{

    public static void main(String[] args) 
    {
        // create a String array called programmingLanguages
        String[] programmingLanguages = {"Swift", "Python", "Java", "Ruby", "COBOL", "Golang"};
        
        System.out.println("Sorting Objects with the Insertion Sort Algorithm: by Orlando Marin");
        
        // display the initial (unsorted) array
        System.out.print("Unsorted array:\n");
        for (int index = 0; index < programmingLanguages.length; index++)
        {
            System.out.print(programmingLanguages[index] + " ");
        }
        
        // sort the array by calling the insertionSort method from the ObjectInsertionSorter class
        ObjectInsertionSorter.insertionSort(programmingLanguages);
        
        // display the sorted array
        System.out.print("\nSorted array:\n");
        for (int index = 0; index < programmingLanguages.length; index++)
        {
            System.out.print(programmingLanguages[index] + " ");
        }
    }
}
