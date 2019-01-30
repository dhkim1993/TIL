class ArrayEx16 {
    public static void main(String[] args) {



        System.out.println("매개변수의 개수 : " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
/*
Tripui-MacBookPro:TIL voldemort$ java ArrayEx16 abc 123 "456"
매개변수의 개수 : 3
args[0] = "abc"
args[1] = "123"
args[2] = "456"
Tripui-MacBookPro:TIL voldemort$ java ArrayEx16
매개변수의 개수 : 0

 */