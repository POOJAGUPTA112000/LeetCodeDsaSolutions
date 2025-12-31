1class Solution {
2    public String shortestCompletingWord(String licensePlate, String[] words) {
3        ArrayList<String> arr = new ArrayList<>();
4        HashMap<Character,Integer> map=new HashMap<>();
5        for(char c : licensePlate.toCharArray()){
6            if(Character.isAlphabetic(c)){
7                map.put(Character.toLowerCase(c),map.getOrDefault(Character.toLowerCase(c),0)+1);
8            }
9        }
10        System.out.println(map);
11        for(String str : words){
12            HashMap<Character,Integer> h = new HashMap<>();
13            for( char  s : str.toCharArray()){
14                h.put(Character.toLowerCase(s),h.getOrDefault(Character.toLowerCase(s),0)+1);
15            }
16            System.out.println(h);
17            boolean flag =true;
18            for(Map.Entry<Character,Integer> entry : map.entrySet()){
19                if(h.containsKey(entry.getKey())){
20                        if(h.get(entry.getKey())>=entry.getValue()){
21                            continue;
22                        }else{
23                            flag=false;
24                            break;
25                        }
26                }else{
27                    flag=false;
28                    break;
29                }
30            }
31            if(flag==true){
32                arr.add(str);
33            }
34        }
35        Collections.sort(arr , (a,b)-> a.length() - b.length());
36        return arr.get(0);
37    }
38}