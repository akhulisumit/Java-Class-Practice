package main

import (
	"fmt"
)

// Function to calculate Prefix Sum
func prefixSum(arr []int) []int {
	prefix := make([]int, len(arr))
	prefix[0] = arr[0]
	for i := 1; i < len(arr); i++ {
		prefix[i] = prefix[i-1] + arr[i]
	}
	return prefix
}

// Function to print a 2D List
func print2DList(matrix [][]int) {
	for _, row := range matrix {
		for _, val := range row {
			fmt.Printf("%d ", val)
		}
		fmt.Println()
	}
}

// Main function
func main() {
	// Variables
	var x int = 10
	y := 20 // shorthand for variable declaration
	fmt.Println("Variables:")
	fmt.Printf("x = %d, y = %d\n\n", x, y)

	// If/Else
	fmt.Println("If/Else Example:")
	if x > y {
		fmt.Println("x is greater than y")
	} else if x < y {
		fmt.Println("x is less than y")
	} else {
		fmt.Println("x is equal to y")
	}
	fmt.Println()

	// Loops
	fmt.Println("Loops Example:")
	for i := 0; i < 5; i++ {
		fmt.Printf("i = %d\n", i)
	}
	fmt.Println()

	// Lists
	fmt.Println("Lists Example:")
	list := []int{1, 2, 3, 4, 5}
	fmt.Printf("List: %v\n", list)

	// Prefix Sum
	fmt.Println("\nPrefix Sum Example:")
	prefix := prefixSum(list)
	fmt.Printf("Prefix Sum: %v\n", prefix)

	// 2D Lists
	fmt.Println("\n2D Lists Example:")
	matrix := [][]int{
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9},
	}
	fmt.Println("2D List:")
	print2DList(matrix)

	// Functions
	fmt.Println("\nFunctions Example:")
	sum := add(10, 15)
	fmt.Printf("Sum of 10 and 15 is: %d\n", sum)
}

// Function to add two numbers
func add(a int, b int) int {
	return a + b
}
