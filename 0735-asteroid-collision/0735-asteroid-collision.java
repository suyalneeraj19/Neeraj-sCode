class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int x : asteroids){
            boolean destroyed = false;

            while(!stack.isEmpty() && x < 0 && stack.peek() > 0){

                if(stack.peek() < Math.abs(x)){
                    stack.pop();
                    continue;
                }else if(stack.peek() == Math.abs(x)){
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            if(!destroyed){
                stack.push(x);
            }
        }

        int [] ans = new int[stack.size()];

        for(int i=stack.size()-1; i>=0;i--){
            ans[i]=stack.pop();
        }

        return ans;
    }
}