public class ArrayEx5 {
    public static void main(String[] args){

        int sum =0;
        int i;
        float average = 0f;

        int[] score = {100, 88, 100, 100 ,90};

        for(i=0; i<score.length; i++){
            sum += score[i];
        }

        average = sum / (float)score.length; // sum은 int고 score를 (float)를 안붙이면 int / int 는 결과도 int 가 되기에 float를 붙여 소수까지 구함

        System.out.println("총점 : "+sum);
        System.out.println("평균 : "+average);

    }
}
/*
총점 : 478
평균 : 95.6

 */