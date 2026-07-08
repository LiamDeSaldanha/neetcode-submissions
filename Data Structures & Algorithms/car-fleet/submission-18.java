class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Float> stack = new Stack<>();
        Map<Integer,Float> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i =0;i<speed.length;i++){
            int distance = target-position[i];
            float time = (distance/(speed[i]*1.0f));
            map.put(distance, time);
            list.add(distance);
        }

        Collections.sort(list);

        for(int i=0;i<list.size();i++){
            if(stack.isEmpty()){
                stack.push(map.get(list.get(i)));
            }else{
                if(map.get(list.get(i))>stack.peek()){
                    stack.push(map.get(list.get(i)));
                }

            }

        }    
        System.out.println(map);    
        System.out.println(list);    
        System.out.println(stack);    
        return stack.size();
        

    }
}
