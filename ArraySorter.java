public class ArraySorter {
    //ElementSwitcher
    public static int[] switchElements(int[] inputArray,int a, int b){
        int d = inputArray[b];
        inputArray[b] = inputArray[a];
        inputArray[a] = d;
        return inputArray;
    }

    //Bubble Sort
    public static int[] bubbleSort(int[] inputArray) {
        int[] outputArray;
        for(int i = 0; i< inputArray.length; i++){
            for(int j = 0; j < inputArray.length-i-1; j++){
                if(inputArray[j]>inputArray[j+1]){
                    switchElements(inputArray, j,j+1);
                }
            }
        }
        outputArray = inputArray;
        return outputArray;
    }
}
