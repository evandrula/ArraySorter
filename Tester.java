public class Tester{
    public static void main(String args[]){
        int bu[] = {9,8,9,0,1,8,7,4,7,5};
         ArraySorter.bubbleSort(bu);
        for(int i: bu){
            System.out.print(i);
        }
        System.out.println();
        int[] tu = {9,4,2,2,2,3,5,6,5,7};
        ArraySorter.selectionSort(tu);
        for(int i: tu){
            System.out.print(i);
        }
    }
}