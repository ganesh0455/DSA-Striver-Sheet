class Solution{

    public int[] selection_sort(int[] array){
        int array_size = array.length;
        int exclude_last_index = array_size - 1;

        for(int start_index = 0; start_index < exclude_last_index; start_index++){
            int min_index = start_index;
            for(int from_index = start_index + 1; from_index < array_size; from_index++){
                if(array[from_index] < array[min_index]){
                    int temp = array[from_index];
                    array[from_index] = array[min_index];
                    array[min_index] = temp;
                }
            }
        }

        return array;
    }
}

public class SelectionSort {

    public static void display_array_elements(int[] updated_array){
        for(int i = 0; i < updated_array.length; i++){
            System.out.print(updated_array[i] + " ");
        }
        System.err.println();
    }

    public static void main(String[] args){
        int[] array = new int[]{11,12,10,9,8,7,5,6,4,3,2,1};
        System.err.print("Before sorting : ");
        display_array_elements(array);
        Solution solution = new Solution();
        int[] sorted_array = solution.selection_sort(array);
        System.err.print("After sorting : ");
        display_array_elements(sorted_array);
    }
}