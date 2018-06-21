package e.harrison.engimamachine;

/*
    creates an array of chars of the string that is inputted, gets length of string.
 */

public class chars {
    private String string;
    private char[] cArray;

    // makes a char array of string
    public chars(String string){
        this.string = string;
        this.cArray = string.toCharArray();

    }

    // gets length of string
    public int getStringLength(){
        int length;

        length = this.string.length();
        return length;
    }


}
