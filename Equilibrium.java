 /* 16. Equilibrium Position 
                An index is an equilibrium position if the sum of elements on its left equals the sum of elements on its right.
                Example: 1 3 5 2 2
                Output: 2
            */
class Equilibrium{
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 2};
        
        for(int i = 1; i < arr.length; i++){
            int sum1 = 0; int sum2 = 0;
            for(int j = 0; j < i; j++){
                sum1 = sum1 + arr[j];
            }
            for(int k = arr.length - 1; k > i; k--){
                sum2 = sum2 + arr[k];
            }
    .out.println()        if(sum1 == sum2){
                System.out.println(i);
            }
        }
    }
}
