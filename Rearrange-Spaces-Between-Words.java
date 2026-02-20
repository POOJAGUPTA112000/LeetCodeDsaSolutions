1class Solution {
2    public String reorderSpaces(String text) {
3        ArrayList<String> arr = new ArrayList<>();
4        int count = 0;
5        StringBuilder str = new StringBuilder("");
6
7        // Step 1: Count spaces & extract words
8        for (int i = 0; i < text.length(); i++) {
9            if (text.charAt(i) == ' ') {
10                count++;
11                if (!str.isEmpty()) {
12                    arr.add(str.toString());
13                    str.setLength(0);
14                }
15            } else {
16                str.append(text.charAt(i));
17            }
18        }
19
20        // Add last word (very important)
21        if (!str.isEmpty()) {
22            arr.add(str.toString());
23        }
24
25        // Step 2: Handle edge case (only one word)
26        if (arr.size() == 1) {
27            return arr.get(0) + " ".repeat(count);
28        }
29
30        // Step 3: Calculate spaces
31        int space = count / (arr.size() - 1);
32        int extra = count % (arr.size() - 1);
33
34        // Step 4: Build answer
35        str.setLength(0);
36        for (int i = 0; i < arr.size(); i++) {
37            str.append(arr.get(i));
38            if (i < arr.size() - 1) {
39                str.append(" ".repeat(space));
40            }
41        }
42
43        // Add extra spaces at end
44        str.append(" ".repeat(extra));
45
46        return str.toString();
47    }
48}