/*
[6-21] Tv클래스를 주어진 로직대로 완성하시오. 완성한 후에 실행해서 주어진 실행결과 와 일치하는지 확인하라.
[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.
 */
public class Practice_6_21 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    }
}

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        if (isPowerOn == true)
            isPowerOn = false;
        else
            isPowerOn = true;
// (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
    }

    void volumeUp() {
        if (volume < MAX_VOLUME)
            volume++;
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
    }

    void volumeDown() {
        if (volume > MIN_VOLUME)
            volume--;
// (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
    }

    void channelUp() {

        if (channel == MAX_CHANNEL)
            channel = MIN_CHANNEL;
        channel++;
// (4) channel의 값을 1증가시킨다.
// 만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
    }

    void channelDown() {
        if (channel == MIN_CHANNEL)
            channel = MAX_CHANNEL;
        channel--;
// (5) channel의 값을 1감소시킨다.
// 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
    }
}
/*
[실행결과]
CH:100, VOL:0 CH:99, VOL:0 CH:100, VOL:100
 */


