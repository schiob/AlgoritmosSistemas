package main

import "fmt"

var MAX = 2000000

// start merge OMIT
func merge(arr []int, start int, middle int, end int) {
	leftSize := middle - start + 1
	rightSize := end - middle
	L := make([]int, leftSize+1)
	for i := 0; i < leftSize; i++ {
		L[i] = arr[start+i]
	}
	R := make([]int, rightSize+1)
	for j := 0; j < rightSize; j++ {
		R[j] = arr[middle+1+j]
	}
	L[leftSize] = MAX
	R[rightSize] = MAX
	i := 0
	j := 0
	for k := start; k <= end; k++ {
		if L[i] <= R[j] {
			arr[k] = L[i]
			i++
		} else {
			arr[k] = R[j]
			j++
		}
	}
}

// end merge OMIT

// start mergeSort OMIT
func mergeSort(arr []int, start int, end int) {
	if start != end {
		middle := (start + end) / 2
		mergeSort(arr, start, middle)
		mergeSort(arr, middle+1, end)
		merge(arr, start, middle, end)
	}
}

// end mergeSort OMIT

// start main OMIT
func main() {
	arr := []int{324, 6, 334, 5, 7, 34, 123, 43, 3, 1, 5, 47, 67, 75, 76, 76, 757, 675}
	mergeSort(arr, 0, len(arr)-1)

	fmt.Println(arr)
}

// end main OMIT
