package Mock_test;

/*
Write a function that compresses a string, by looking for consecutive identical characters and returning a string made up of the count of repeats followed by the character for each distinct character in the string

For example
    aa => 2a
    --> aabbcc => 2a2b2c
    ccccabbbaa => 4c1a3b2a


public String compress (String old){

        StringBuilder sb = new StringBuilder();
        int count=1;
        for (int i=0; i<old.length-1; i++){
        if(old[i+1])==old[i];{
        count++;
        if((i+1)==old.length-1)
        sb.append(count+old[i]);
        else {
        sb.append(count+old[i]);
        count=1;
        }
        }
        return sb.toString;
        }
*/
public class CharCount {
    public String compress(String givenString) {
        StringBuilder sb = new StringBuilder();
        int length = givenString.length() - 1;
        int count = 1;
        for (int i = 0; i < length; i++) {
            if (givenString.charAt(i + 1) == givenString.charAt(i)) {
                count++;
            } else {
                sb.append(count).append(givenString.charAt(i));
                count = 1;
            }
        }
        sb.append(count).append(givenString.charAt(length));
        return sb.toString();
    }
}
