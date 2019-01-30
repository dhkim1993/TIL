class ArrayEx15 {
    public static void main(String[] args) {

        String source = "SOSHELP";
        String[] morse = {".-", "-...", "-.-.", "-..", "."
                , "..-.", "--.", "....", "..", ".---"
                , "-.-", ".-..", "--", "-.", "---"
                , ".--.", "--.-", ".-.", "...", "-"
                , "..-", "...-", ".--", "-..-", "-.--"
                , "--.."};

        String result = "";

        for (int i = 0; i < source.length(); i++) {
            result += morse[source.charAt(i) - 'A'];
        }
        /*
        result += morse[source.charAt(0)-'A']
        result += morse['S'-'A']
        result += morse[83-65=18] =="..."
        이렇게 반복한다.
         */
        System.out.println("source:" + source);
        System.out.println("morse:" + result);
    }
}
/*
source:SOSHELP
morse:...---.........-...--.

 */