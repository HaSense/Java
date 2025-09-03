package com.google.base;

import com.google.hero.Knight;

public class Main
{
    public static void main(String[] args) {
        Stroy stroy = new Stroy();
        stroy.initStoryWrite();

        
        Knight joy = new Knight("조이");
        System.out.println(joy.getName());
    }
}
