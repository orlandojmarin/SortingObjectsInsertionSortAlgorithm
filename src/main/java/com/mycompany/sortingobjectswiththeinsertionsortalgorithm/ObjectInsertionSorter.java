/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sortingobjectswiththeinsertionsortalgorithm;

/**
 *
 * @author orlandomarin
 */

/*
DIRECTIONS:
Create an ObjectInsertionSorter class that can sort Comparable objects.
Demonstrate the class in a program that sorts an array of String objects
*/

public class ObjectInsertionSorter 
{
   public static void insertionSort(Comparable[] array)
   {
       
       // variables
       Comparable unsortedValue;    // the first unsorted value
       int scan;                    // used to scan the array
       
       for (int index = 1; index < array.length; index++)
       {
           /*
           the first element outside the sorted position is array[index].
           store the value of this element in unsortedValue.
           */
           unsortedValue = array[index];
           
           /*
           start scan at the subscript of the first element in the still
           unsorted part
           */
           scan = index;
           
           /*
           move the first element in the still unsorted part into its proper
           position within the sorted part of the array
           */
           while (scan > 0 && array[scan - 1].compareTo(unsortedValue) > 0)
           {
               array[scan] = array[scan - 1];
               scan--;
           }
           /*
           insert the unsorted value in its proper position within the sorted
           part
           */
           array[scan] = unsortedValue;
       }
   }
}
