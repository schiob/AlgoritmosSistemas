package main

import "fmt"

// start function OMIT
func Sum(x int, y int) int {
	return x + y
}

// end function OMIT

// start main OMIT
func main() {
	numero := Sum(4, 7)
	fmt.Println(numero)
}

// end main OMIT
