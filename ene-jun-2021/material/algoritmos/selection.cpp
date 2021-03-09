#include <iostream>

using namespace std;

int main(){
    int arr[] = {3,5,6,7,453,56,7,3,45,6,72,4,6,73,4,5,74,1};

    for(int i = 0; i < sizeof(arr)/sizeof(*arr); i++){
        cout << arr[i] << " ";
    }
    cout << endl;

    // Selection Sort
    for(int i = 0; i < sizeof(arr)/sizeof(*arr); i++){
        int min = arr[i];
        int min_idx = i;

        for(int j = i+1; j < sizeof(arr)/sizeof(*arr); j++){
            if(min > arr[j]){
                min = arr[j];
                min_idx = j;
            }
        }

        int temp = arr[i];
        arr[i] = min;
        arr[min_idx] = temp;
    }
    // END selection sort

    for(int i = 0; i < sizeof(arr)/sizeof(*arr); i++){
        cout << arr[i] << " ";
    }
    cout << endl;
}