package lldpractice.ProxyPattern;

public class ProxyPatternTest {

    public static void main(String[] args) {
        String url = "https://xyz.com/jfhewhhje";
        DatabaseConnectionProxy dcproxy = new DatabaseConnectionProxy(url);

        /*

        ///////
        //////
        //////




         */


        System.out.println(dcproxy.getVideo());
    }
}
