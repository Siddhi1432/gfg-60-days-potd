class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> list = new HashSet<>();
         for(int item: a){
             list.add(item);
         }
         
         for(int item: b){
             list.add(item);
         }
         
         ArrayList<Integer> filteredList = new ArrayList<>(list);
         
         return filteredList;
    }
}