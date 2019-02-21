import java.util.*;

public class dlhjs {
    /*
12
Junkyu 50 60 100
Sangkeun 80 60 50
Sunyoung 80 70 100
Soong 50 60 90
Haebin 50 60 100
Kangsoo 60 80 100
Donghyuk 80 60 100
Sei 70 70 70
Wonseob 70 70 90
Sanghyun 70 70 80
nsj 80 80 80
Taewhan 50 60 90
*/
    public static void main(String[] args) {
        String getStr = "12\n" +
                "Junkyu 50 60 100\n" +
                "Sangkeun 80 60 50\n" +
                "Sunyoung 80 70 100\n" +
                "Soong 50 60 90\n" +
                "Haebin 50 60 100\n" +
                "Kangsoo 60 80 100\n" +
                "Donghyuk 80 60 100\n" +
                "Sei 70 70 70\n" +
                "Wonseob 70 70 90\n" +
                "Sanghyun 70 70 80\n" +
                "nsj 80 80 80\n" +
                "Taewhan 50 60 90";

        String[] arr = getStr.split("\n");
        String[] arr2 = new String[200];
        for (int i = 1; i < arr.length; i++) {
            System.out.print("   "+arr[i]);
            System.out.println();
            arr2 = arr[i].split(" ");
        }
        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr2.length; k++) {
                System.out.print(arr2[k] + " ");
            }
            System.out.println();
        }


    }
}