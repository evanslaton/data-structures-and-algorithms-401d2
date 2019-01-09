# Find Edges
Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?

## Challenge
Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## Approach & Efficiency
O(n2) time - there is a loop within a loop
O(n) space - the space used is dependent on the size of the inputs

## Solution
![get-edge](../assets/get-edges.jpg)