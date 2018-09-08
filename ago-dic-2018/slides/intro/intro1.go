package main

import "fmt"

// start func 1 OMIT
func MasPopular1(arr []string) string {
	bestCount := 0
	bestName := ""

	for i := 0; i < len(arr); i++ {
		name := arr[i]
		count := 0

		for j := 0; i < len(arr); i++ {
			if arr[j] == name {
				count++
			}
		}
		if count > bestCount {
			bestCount = count
			bestName = name
		}
	}

	return bestName
}

// end func 1 OMIT

// start func 2 OMIT
func MasPopular2(arr []string) string {
	mapa := make(map[string]int)

	for i := 0; i < len(arr); i++ {
		mapa[arr[i]]++
	}

	best := 0
	bestName := ""
	for k, v := range mapa {
		if v > best {
			best = v
			bestName = k
		}
	}

	return bestName
}

//end func 2 OMIT

// start main OMIT
func main() {
	alumnos := []string{"Juan", "Lupe", "Mario", "Juan", "Miguel", "Sofia"}

	popular1 := MasPopular1(alumnos)
	popular2 := MasPopular2(alumnos)

	fmt.Println(popular1)
	fmt.Println(popular2)

}

// end main OMIT
