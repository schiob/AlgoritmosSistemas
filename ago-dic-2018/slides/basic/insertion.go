package main

import "fmt"

// start insertionSort OMIT
func insertionSort(arr []int) []int {
	for j := 1; j < len(arr); j++ {
		actual := arr[j]

		i := j - 1
		for i >= 0 && arr[i] > actual {
			arr[i+1] = arr[i]
			i--
		}
		arr[i+1] = actual
	}
	return arr
}

// end insertionSort OMIT

// start main OMIT
func main() {
	arr := []int{4, 2, 5, 6, 2, 4, 5, 9, 1, 3}
	fmt.Println(arr)
	sortedArr := insertionSort(arr)
	fmt.Println(sortedArr)
}

// end main OMIT
