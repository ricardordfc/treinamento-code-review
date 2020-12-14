package br.com.teste.treinamentocodereveiw.main;

import java.util.*;

public class Main {

    public Integer x=0;

    public String doMagic(Integer a, Integer b, List<Integer> l, String s) {
        Integer c =0;
        if(a > 0) c+=a;
        if(a<0) c-=a;
        if(b   <0) c-=b;
        if(b> 0) c+=b;
        //while(a >b){
        for(int i = 0; i < c; i++) {
            if(l.get(i) > 0) {
                x += l.get(i);
            }
            if(l.get(i) == 0) {
                x+= l.get(i);
            }
            if(l.get(i) < 0) {
                x -= l.get(i);
            }
        }
        s=s.toLowerCase();
        if(s.equals("final")) {
            return "final";
        } else {
            return s + ":" + " " + x;
        }

        /*
        for(int i = 0; i < c; i++) {
            if(l.get(i) > 0) {
                x += l.get(i);
            }
            if(l.get(i) == 0) {
                x+= l.get(i);
            }
            if(l.get(i) < 0) {
                x -= l.get(i);
            }
        }
           return "soma:" + " " + x;
         */
    }

    public static void main(String[] args) {
        List l =  new ArrayList();
        l.add(3);
        l.add(10);
        l.add(5);
        l.add(-2);
        l.add(-3);
        l.add(77);
        l.add(0);
        l.add(-4);
        System.out.println((new Main()).doMagic(5, 3, l, "Soma"));
    }
}
