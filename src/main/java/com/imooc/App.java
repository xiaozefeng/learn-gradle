package com.imooc;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * 程序入口
 *
 * @author xiaozefeng
 * @date 2018/5/3 下午9:12
 */
@Slf4j
public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            log.info("please input todo item name");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            log.info("{}", todoItem);
        }
    }
}
