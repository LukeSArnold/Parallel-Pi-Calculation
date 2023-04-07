OVERVIEW
====================================

This project was create for the "Parallel Pi" assignment for CS-3100 Operating Systems and Concurrency offered at 
Utah State University. 
The purpose of this assignment is for student to gain familiarity with writing multi-threaded applications. Additionally, the 
project allows students to gain familiarity with the gradle system.

This project works by created a priority queue in the form of a linked list to store digits 1 - 100. From there, the 
program checks the number of cores present on the user's processor. Using this information, the program generates a number 
of worker threads equal to the number of cores. Each of these threads are created by passing in the same shared priority queue in
their constructor. While this queue has elements, the different threads pull of a digit and pass it into an algorithm to 
generate the respective digit of pi, lastly the threads pass these digits into a hash map.

Once the queue is empty, the program parses over the hashmap and prints out all the digits of pi in their respective location.
