public class TvTest4 {
    public static void main(String[] args){

        Tv4[] tvArr = new Tv4[3];

        for(int i=0; i<tvArr.length; i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i+10;
        }

        for(int i=0; i<tvArr.length;i++){
            tvArr[i].channelUp();
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}

class Tv4{

    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channerDown(){
        --channel;
    }
}
/*
tvArr[0].channel=11
tvArr[1].channel=12
tvArr[2].channel=13
 */