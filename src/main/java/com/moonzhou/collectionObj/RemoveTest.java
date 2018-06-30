package com.moonzhou.collectionObj;

import java.util.ArrayList;
import java.util.List;

public class RemoveTest {

    public static void main(String[] args) {
        List<Beauty> list = new ArrayList<Beauty>();
        for (int i = 0; i < 20; i++) {
            Beauty beauty = new Beauty();
            switch (i % 4) {
                case 0:
                    beauty.setCup("A");
                    break;
                case 1:
                    beauty.setCup("B");
                    break;
                case 2:
                    beauty.setCup("C");
                    break;
                case 3:
                    beauty.setCup("D");
                    break;
                default:
                    beauty.setCup("A");
                    break;
            }
            
            list.add(beauty);
        }

        for (int i = 0; i < list.size(); i++) {
            Beauty beauty = list.get(i);
            if ("A".equals(beauty.getCup())) {
                list.remove(beauty);
            }
        }
        
        // 使用强制for循环list时，不能再遍历过程中增删list的内容。
        /*for (Beauty beauty : list) {
            if ("A".equals(beauty.getCup())) {
                list.remove(beauty);
            }
        }*/

        for (Beauty beauty : list) {
            System.out.println(beauty.getCup());
        }
    }

}

class Beauty {
    private String cup;

    public Beauty() {
        super();
    }

    public Beauty(String cup) {
        super();
        this.cup = cup;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }
}