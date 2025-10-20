class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> digits = new TreeSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                digits.add(s.charAt(i) - '0');
            }
        }
        
        if (digits.size() < 2) return -1; // less than 2 unique digits
        
        digits.pollLast(); // remove the largest
        return digits.last(); // now the largest is the second-highest
    }
}
