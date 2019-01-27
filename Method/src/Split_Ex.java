public class Split_Ex {
    public static void main(String[] args) {

        String str = "나는 굉장히 뛰어난 개발자가 될것이다. 세계를 돌아다니며 개발자로 살고 싶다.";

        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "] = " + arr[i]);


    }
}
/*
arr[0] = 나는
arr[1] = 굉장히
arr[2] = 뛰어난
arr[3] = 개발자가
arr[4] = 될것이다.
arr[5] = 세계를
arr[6] = 돌아다니며
arr[7] = 개발자로
arr[8] = 살고
arr[9] = 싶다.

//문법
문자열배열 = 대상문자열.split("기준문자");

//예제
String str = "";

for(int i=0;i<5;i++) {
str += i+"#";
}

String[] array = str.split("#");

for(int i=0;i<array.length;i++) {
System.out.println(array[i]);
}

//결과값
//array[0] = 1
//array[1] = 2
//array[2] = 3
//array[3] = 4


//1. 쉼표(,)로 문자열 잘라서 배열에 넣기
String str = "A,B,C,D";
String[] array = str.split(",");

//출력
for(int i=0;i<array.length;i++) {
System.out.println(array[i]);
}

//결과값
//array[0] = A
//array[1] = B
//array[2] = C
//array[3] = D

 */