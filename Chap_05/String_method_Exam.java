package Chap_05;

public class String_method_Exam {
    public static void main(String[] args) {
        String str = "hello";
        char chr = '1';
        char chr1 = 'b';

        // 문자열 길이 관련
        System.out.println(str.length());

        // 문자열 결합 관련
        System.out.println(str.concat(" world")); // 문자열 결합

        // 문자열 추출 관련
        System.out.println(str.charAt(3)); // 지정 위치 문자열 추출
        System.out.println(str.substring(3)); // 문자열 잘라내기

        // String to char
        System.out.println(Character.getNumericValue(chr));

        // ASCII CODE 관련
        System.out.println((int)(chr1-'a')); // a = 97

    }
}
