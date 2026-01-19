class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int second = -1;

        for(char c : s.toCharArray()){ // converting sring to charector array
            if(Character.isDigit(c)){ // check whether chactor is number or not
                int d = c - '0';      // subtract ASCII value of charector with 48 (0th ASCII value)and store it 
                                      // a variable d

                if(d > largest){
                    second = largest;
                    largest = d;
                }
                else if(d < largest && d > second){
                    second = d;
                }
            }
        }
        return second;
    }
}