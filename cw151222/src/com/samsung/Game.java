package com.samsung;

import com.samsung.model.Story;
import com.samsung.model.Character;
import com.samsung.model.Situation;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Character manager;
        Story story;

            Scanner in = new Scanner(System.in);
            System.out.println("Вы прошли собеседование и вот-вот станете сотрудником Корпорации. \n "
                    + "Осталось уладить формальности - подпись под договором (Введите ваше имя):");
            manager = new Character(in.next());
            story = new Story();
            while (true) {
                manager.a += story.current_situation.dA;
                manager.k += story.current_situation.dK;
                manager.r += story.current_situation.dR;
                System.out.println("=====\nКарьера:" + manager.k + "\tАктивы:"
                        + manager.a + "\tРепутация:" + manager.r + "\n=====");
                System.out.println("============="
                        + story.current_situation.subject + "==============");
                System.out.println(story.current_situation.text);
                if (story.isEnd()) {
                    System.out
                            .println("====================the end!===================");
                    return;
                }
                story.go(in.nextInt());
            }

        }
    }

