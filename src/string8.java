import java.util.Scanner;



public class string8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //문자열 입력 받은 후 대문자 또느 소문자로 변경
        //변수 선언 후 A에는 문자만 체크해서 앞에서 부터 넣고, B에는 뒤에서부터 넣는다.
        //팰린드롬은 앞에서 읽든, 뒤에서 읽든 동일하므로 해당 문자열 체크
        String str = sc.nextLine();

        String compareA = "";
        String compareB = "";

        str = str.toUpperCase();

        for(int i = 0; i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                compareA += String.valueOf(str.charAt(i));
            }
        }

        for(int i = str.length()-1; i>=0;i--){
            if(Character.isLetter(str.charAt(i))){
                compareB += String.valueOf(str.charAt(i));
            }
        }
        String result = "";

        if(compareA.equals(compareB)){
            result = "YES";
        }
        else
            result = "NO";

        System.out.println(result);
    }
}
