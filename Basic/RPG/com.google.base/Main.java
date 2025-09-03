package com.google.base;

import com.google.hero.Knight;

public class Main
{
    public static void main(String[] args) {
        Story story = new Story();
        story.initStoryWrite();

        Knight joy = new Knight("조이");
        System.out.println(joy.getName());
    }
}
