// Given a string str, insert the difference of ASCII values of every pair of consecutive characters between them.
// Example
// Input:
// abecd
// Output:
// a1b3e-2c1d

class InsertASCIIDifference {
    public static void main(String args[]) {
        String s = "abecd";
        String ans = "";
        for(int i = 0; i < s.length() - 1; i++) {
            char chC = s.charAt(i);
            char chN = s.charAt(i+1);
            ans = ans + chC + (chN - chC); 
        }
        ans = ans + s.charAt(s.length() - 1);
        System.out.print("ans : " + ans);
    }
}