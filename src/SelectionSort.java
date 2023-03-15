public class SelectionSort {
    static void sort(int array[]){
        for(int i  = 0; i < array.length-1; i++){
            int indexI = i;
            for (int x = indexI + 1; x < array.length; x++){
                if(array[x]  < array[indexI]){
                    indexI = x;
                }
            }
            int item = array[indexI];
            array[indexI] = array[i];
            array[i] = item;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,1,10,8,0,98,78,4};
        SelectionSort.sort(array);

        for(int i = 0; i < array.length; i++){
            System.out.print(" " + array[i] + " ");
        }
    }
}
