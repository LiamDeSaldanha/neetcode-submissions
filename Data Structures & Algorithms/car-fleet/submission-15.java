class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<position.length;i++){

            map.put(position[i], speed[i]);
        }

        Arrays.sort(position);
        Stack<Float> stack = new Stack<>();

        for(int i =position.length-1;i>=0;i--){
            float time = (target-position[i]) / (float) map.get(position[i]);

            if(i==position.length-1){
                stack.push(time);
            }else{
                if(time<=stack.peek()){

                }else{
                    stack.push(time);
                }
            
                

            }

            

            


        }
        System.out.println(stack);
        return stack.size();




    }
}
