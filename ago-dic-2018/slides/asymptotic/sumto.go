package main

import (
	"fmt"
	"time"
)

// start f1 OMIT
func sumTo(n int) int {
	return n * (n - 1) / 2
}

// end f1 OMIT

// start f2 OMIT
func sumTo2(n int) int {
	sum := 0

	for i := 0; i < n; i++ {
		sum += i
	}

	return sum
}

// end f2 OMIT

// start f3 OMIT
func sumTo3(n int) int {
	sum := 0

	for i := 0; i < n; i++ {
		for j := 0; j < i; j++ {
			sum++
		}
	}

	return sum
}

// end f3 OMIT

// start main OMIT
func main() {
	n := 1000000

	start := time.Now()
	fmt.Print(sumTo(n))
	fmt.Printf(" took %s\n", time.Since(start))

	start = time.Now()
	fmt.Print(sumTo2(n))
	fmt.Printf(" took %s\n", time.Since(start))

	start = time.Now()
	fmt.Print(sumTo3(n))
	fmt.Printf(" took %s\n", time.Since(start))
}

// end main OMIT
