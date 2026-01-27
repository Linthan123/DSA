class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        //base condition
        if(numRows == 0) return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if(numRows == 1) return result;

        for(int i = 1; i<numRows; i++){
            List<Integer> prevRow = result.get(i-1);       //previous row


            //start the next row
            List<Integer> row = new ArrayList<>();
            row.add(1);                                 // add 1 to the list(first element)
            for(int j = 1; j < i; j++){
                row.add(prevRow.get(j -1) + prevRow.get(j));
            }
            row.add(1);                                // add 1 to the list(last element)

           result.add(row); //add it to final result
        }
        return result;
    }
}