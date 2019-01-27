public class Replace_ReplaceAll_ReplaceFirst_Ex {
    public static void main(String[] args) {

        String str = "개발자 되고싶다. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.";

        str = str.replace("." , "!");

        System.out.print(str);

        // result : 개발자 되고싶다! 실력이 어마무시한! 연봉도 억대로 받고싶다! 갈길이 멀다! 열심히 하자!
    }
}

/*
        replaceAll 은 replace와 비슷하나 특수문자로 변형할때는 문장 전체를 변환하는 값으로 다바꿔버린다.

        String str = "개발자 되고싶다. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.";
        str = str.replaceAll(".", "!");
        System.out.println(str);

        //결과값 : !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


    replaceFirst 는

        String str = "개발자 되고싶다. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.";

        str = str.replaceFirst(".", "!");
        System.out.print(str);
        // result : !발자 되고싶다. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.
        특수문자로 치환할려고하면 상관없이 그냥 문장 맨앞에 값이 바뀐다. 특수문자는 안된다.


        String str = "개발자 되고싶다. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.";

        str = str.replaceFirst("싶다", "말꺼다 반드시");
        System.out.print(str);
        // result : 개발자 되고말꺼다 반드시. 실력이 어마무시한. 연봉도 억대로 받고싶다. 갈길이 멀다. 열심히 하자.
        일반 문자로 치환은 치환할려는 문장에 치환값이 포함된 맨 앞에 있는 값이 바뀐다.

*/

