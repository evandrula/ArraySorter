public class ArraySorter {
    //ElementSwitcher
    protected static void switchElements(int[] inputArray, int a, int b){
        int d = inputArray[b];
        inputArray[b] = inputArray[a];
        inputArray[a] = d;
    }

    //Bubble Sort
    public static int[] bubbleSort(int[] inputArray) {
        for(int i = 0; i< inputArray.length; i++){
            for(int j = 0; j < inputArray.length-i-1; j++){
                if(inputArray[j] > inputArray[j+1]){
                    switchElements(inputArray, j,j+1);
                }
            }
        }
        return inputArray;
    }

    //Selection Sort
    public static int[] selectionSort(int[] inputArray){
        int min;
        for (int i = 0; i < inputArray.length-1; i++){
            min = i;
            for (int j = i+1; j < inputArray.length; j++){
                if(inputArray[j] < inputArray[min])
                    min = j;
            }
            switchElements(inputArray, min, i);
        }
        return inputArray;
    }
}

