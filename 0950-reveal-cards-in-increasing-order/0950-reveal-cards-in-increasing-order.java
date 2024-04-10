class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        int [] ans =new int[deck.length];
        Deque<Integer> que=new LinkedList<>();

        for(int i=0;i<deck.length;i++){
            que.add(i);
        }

        for (int x:deck){
            int index=que.poll();
            ans[index]=x;
            if(!que.isEmpty()){
                que.add(que.poll());
            }
        }

        return ans;
    }
}