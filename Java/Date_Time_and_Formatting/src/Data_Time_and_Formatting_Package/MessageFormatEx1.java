package Data_Time_and_Formatting_Package;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name:{0} \nTel:{1} \nAge:{2} \nBirthday:{3}";
        Object[] arguments = {"개동팔", "02-4444-4444", "27", "0404"};

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
/*
Name:개동팔
Tel:02-4444-4444
Age:27
Birthday:0404
 */