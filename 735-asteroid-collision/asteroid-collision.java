class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        for(int i=0; i<n; i++){
            if(asteroids[i] > 0 || st.isEmpty()){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty()){
                    if(st.peek() < 0){
                        st.push(asteroids[i]);
                        break;
                    }
                    int Aval = Math.abs(asteroids[i]);
                    if(st.peek() == Aval){
                        st.pop();
                        break;
                    }
                    else if(Aval < st.peek()){
                        break;
                    }
                    else{
                        st.pop();
                        if(st.isEmpty()){
                            st.push(asteroids[i]);
                            break;
                        }
                        
                    }
                }
            }
        }
        int[] res = new int[st.size()];
        for(int i = st.size()-1; i>=0; i--){
            res[i] = st.pop();
        }
        return res;
    }
}