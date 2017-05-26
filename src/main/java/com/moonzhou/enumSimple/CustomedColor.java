package com.moonzhou.enumSimple;

/**
 * 
 * @author moon-zhou
 * @since 2017-05-26
 *
 */
public enum CustomedColor {
    
    C_RED("红色", 1), C_GREEN("绿色", 2), C_BLANK("白色", 3), C_YELLO("黄色", 4);

    private String name;
    private int index;

    private CustomedColor( String name , int index ){
        this.name = name ;
        this.index = index ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
