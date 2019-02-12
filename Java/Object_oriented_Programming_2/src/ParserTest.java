interface Parseable {
    // 구문 분석작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴타입이 Parseable인터페이스이다.
    public static Parseable getParser(String type) {            //getParse()는 type의 따라 반화값이 다르게 해놓았다.
        if (type.equals("XML")) {
            return new XMLParser();     //  반환시 XMLParser 인스턴스를 반환한다.(주소값)
        } else {
            Parseable p = new HTMLParser(); //  반환시 HTMLParser 인스턴스를 반환한다.(주소값)
            return p;
            // return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable {          //Parseable 를 implements하고 parse메소드를 구현했다.
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {         ////Parseable 를 implements하고 parse메소드를 구현했다.
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

class ParserTest {
    public static void main(String args[]) {
        Parseable parser = ParserManager.getParser("XML");  //parse에 XMLParser인스텈스를 넣는다.
        parser.parse("document.xml");   //XMLParser인스턴스가 있기에 XMLParser()가 실행.
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
/*
document.xml- XML parsing completed.
document2.html-HTML parsing completed.
 */