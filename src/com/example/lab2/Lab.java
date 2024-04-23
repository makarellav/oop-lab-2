package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public Lab(Task... tasks) {
        Collections.addAll(this.tasks, tasks);
    }

    public void solve() {
        var shouldExit = false;
        var scanner = new Scanner(System.in);

        while (!shouldExit) {
            System.out.println();
            System.out.println("Оберіть номер завдання або напишіть exit для виходу");

            for (var i = 0; i < tasks.size(); i++) {
                System.out.println(STR."\{i + 1}) \{tasks.get(i).describe()}");
            }

            System.out.println("Оберіть опцію: ");

            var input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("На все добре :)");

                shouldExit = true;
            } else {
                try {
                    var taskNum = Integer.parseInt(input);
                    var taskIndex = taskNum - 1;

                    var task = tasks.get(taskIndex);

                    task.solve();
                } catch (NumberFormatException _) {
                    System.out.println("Помилка: некоректний номер завдання");
                } catch (IndexOutOfBoundsException _) {
                    System.out.println("Помилка: не вдалося знайти завдання");
                }
            }
        }
    }
}
