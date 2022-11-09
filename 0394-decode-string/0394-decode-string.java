class Solution {
    public String decodeString(String s) {
        Stack<String> result = new Stack<>();
        Stack<Integer> number = new Stack<>();
        char[] arr = s.toCharArray();
        int i=0;
        result.push("");
        while(i< arr.length){
            if(Character.isDigit(arr[i])){
                int start = i;
                while(Character.isDigit(arr[i+1])){
                    i++;
                }
                int num = Integer.valueOf(s.substring(start, i+1));
                number.push(num);
            } else if(arr[i] == '['){
                result.push("");
            } else if(arr[i] == ']'){
                int num = number.pop();
                String str = result.pop();
                StringBuilder sb = new StringBuilder();
                for(int j=0; j<num; j++){
                    sb.append(str);
                }
                result.push(result.pop() + sb.toString());
            }else{
                result.push(result.pop() + arr[i]);
            }
            i++;
        }
        return result.pop();
    }
}