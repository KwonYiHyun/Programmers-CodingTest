package Level1.신고결과받기;

import java.util.ArrayList;
import java.util.HashMap;

public class 신고결과받기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1[]= {"muzi", "frodo", "apeach", "neo"};
		String s2[]= {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k=2;
		Solution2 sol=new Solution2();
		sol.solution(s1, s2, k);
	}

}

class Solution2 {
	
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer= new int[id_list.length];
        
        ArrayList<String> l=new ArrayList<String>();
        
        for (int i = 0; i < report.length; i++) {
			if(!l.contains(report[i])) {
				l.add(report[i]);
			}
		}
        
        HashMap<String, String> map=new HashMap<String, String>();
        
        for (int i = 0; i < l.size(); i++) {
			if(map.containsKey(l.get(i).split(" ")[1])) {
				int val=Integer.parseInt(map.get(l.get(i).split(" ")[1]))+1;
				map.remove(l.get(i).split(" ")[1]);
				map.put(l.get(i).split(" ")[1], String.valueOf(val));
			}else {
				map.put(l.get(i).split(" ")[1], "1");
			}
		}
        
        ArrayList<String> name=new ArrayList<String>();
        
        for (int i = 0; i < l.size(); i++) {
        	if(map.containsKey(l.get(i).split(" ")[1])) {
        		if (Integer.parseInt(map.get(l.get(i).split(" ")[1]))>=k) {
        			if(!name.contains(l.get(i).split(" ")[1])) {
        				name.add(l.get(i).split(" ")[1]);
        			}
				}
        	}
		}
        
        for (int i = 0; i < name.size(); i++) {
			System.out.println("name = "+name.get(i));
		}
        
        
        
        return answer;
    }
    
}