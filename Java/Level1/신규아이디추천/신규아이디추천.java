package Level1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        Solution sol=new Solution();
        System.out.println(sol.solution("...!@BaT#*..y.abcdefghijklm"));
    }
}

class Solution {
    public String solution(String new_id) {
        String answer = new_id;
        answer=answer.toLowerCase();
        
        String fuck="~!@#$%^&*()=+[{]}:?,<>/";
        for (int index = 0; index < fuck.length(); index++) {
            if(answer.contains(fuck.substring(index, index+1))){
                answer=answer.replace(fuck.substring(index, index+1), "");
            }
        }

        while (answer.contains("..")) {
            answer=answer.replace("..", ".");
        }

        answer=dotclear(answer);

        if(answer.equals("")) answer="a";

        if(answer.length()>=16) answer=answer.substring(0, 15);

        answer=dotclear(answer);

        while (answer.length()<=2) {
            answer=answer+answer.substring(answer.length()-1, answer.length());
        }

        return answer;
    }
    
    public String dotclear(String new_id) {
    	String answer=new_id;
    	if(answer.equals(".")) {
    		return answer="";
    	}else if(answer.equals("..")) {
    		return answer="";
    	}else {
    		if(answer.substring(0, 1).equals(".")){
                answer=answer.substring(1, answer.length());
            }

            if(answer.substring(answer.length()-1, answer.length()).equals(".")){
                answer=answer.substring(0, answer.length()-1);
            }
    	}
    	
    	return answer;
    }
}