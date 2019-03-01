import java.util.StringTokenizer;
public class Split_and_StringTokenizer {
    public static void main(String[] args) {
        String str = "1@2#3@4&&5";

        String aa[] = str.split("#|@|&");

        System.out.println("split 출력");
        System.out.println("aa.length : " + aa.length);
        for(int i=0; i<aa.length; i++){
            System.out.println("aa["+ i + "] : "+ aa[i]);
        }

        StringTokenizer st = new StringTokenizer(str,"#|@|&");

        System.out.println("\nStringTokenizer 출력");

        while(st.hasMoreTokens()){
            System.out.print(st.nextToken() + " ");
        }
    }
}
/*
split 출력
aa.length : 6
aa[0] : 1
aa[1] : 2
aa[2] : 3
aa[3] : 4
aa[4] :
aa[5] : 5

StringTokenizer 출력
1 2 3 4 5
 */