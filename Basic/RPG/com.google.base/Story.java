package com.google.base;

public class Story {

    // 타이핑 효과를 내는 메소드
    private void typeWriter(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c); // 줄바꿈 없음
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // 안전하게 인터럽트 처리
                throw new RuntimeException(e);
            }
        }
        System.out.println(); // 한 문장이 끝나면 줄바꿈
    }

    public void initStoryWrite() {
        typeWriter("때는 B.C 5700년 어둠이 내리고 악이 판치는 곳이다.", 50);
        typeWriter("어둠이 내린 시기에 영웅이 등장해 이겨내리라.", 50);
        typeWriter("이제 영웅이 등장할 시기이니..", 50);
        System.out.println();
        typeWriter("당신 영웅의 이름은 무엇인가? :  ", 50);

    }

}

