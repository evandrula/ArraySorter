public class ArraySorter {
    //ElementSwitcher
    protected static void switchElements(int[] inputArray, int a, int b){
        int d = inputArray[b];
        inputArray[b] = inputArray[a];
        inputArray[a] = d;
    }

    //Bubble Sort
    public static void  bubbleSort(int[] inputArray) {
        for(int i = 0; i< inputArray.length; i++){
            for(int j = 0; j < inputArray.length-i-1; j++){
                if(inputArray[j] > inputArray[j+1]){
                    switchElements(inputArray, j,j+1);
                }
            }
        }
    }

    //Selection Sort
    public static void selectionSort(int[] inputArray){
        int min;
        for (int i = 0; i < inputArray.length-1; i++){
            min = i;
            for (int j = i+1; j < inputArray.length; j++){
                if(inputArray[j] < inputArray[min])
                    min = j;
            }
            switchElements(inputArray, min, i);
        }
    }
    
        //Insertion Sort
    public static void insertionSort(int[] inputArray){
        for(int i = 2; i < inputArray.length; i++){
            int key = inputArray[i];
            int j = i-1;
            while(j > 0 && inputArray[j] > key){
                inputArray[j+1] = inputArray[j];
                --j;
            }
            inputArray[j+1] = key;
            for (int a:
                 inputArray) {
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
