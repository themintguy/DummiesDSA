package Basics.Strings;

public class Count1 {
    static void main() {
        String str = "rumesh@36";
        int letter =0;
        int numbers=0;
        int specialC=0;

        for(int i =0;i<str.length();i++){
            char c = str.charAt(i);

            if(c>='a'&& c<='z' || c>='A' && c<='Z'){
                letter++;
            } else if (c>='0' && c<='9') {
                numbers++;
            }
            else{
                specialC++;
            }
        }
        System.out.println("count of letters in String is : " + letter);
        System.out.println("count of Numbers in String is : " + numbers);
        System.out.println("count of SPecial characters  in String is : " + specialC);
    }
}
