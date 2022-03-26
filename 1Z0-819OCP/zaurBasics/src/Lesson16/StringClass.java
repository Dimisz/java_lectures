package Lesson16;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class StringClass {
    public static void main(String[] args) {
        String s1 = new String("hi");
        String s2 = new String("hi");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

}
