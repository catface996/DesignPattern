package com.dp.适配器模式;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author by catface
 * @date 2021/5/21 11:34 上午
 */
public class ReadFile {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/main/resources/text.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }

}
