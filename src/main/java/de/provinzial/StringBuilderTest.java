package de.provinzial;

public class StringBuilderTest {

    public static void main(String[] args) {


        String str = "Das";
        str += " ist";
        str += " ein";
        str += " Haus";

        //StringBuilder sb = new StringBuilder("Das");
        StringBuilder sb = new StringBuilder(1000);
        sb.append("Das");
        sb.append(" ist").append(" ein").append(" Haus");

        str = sb.toString();

        System.out.println(sb);
    }


}
