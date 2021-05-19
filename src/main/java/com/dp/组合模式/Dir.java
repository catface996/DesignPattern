package com.dp.组合模式;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

/**
 * @author by catface
 * @date 2021/5/19 5:51 下午
 */
@Getter
public class Dir {

    private String name;

    private List<Dir> dirs = new ArrayList<>();

    public Dir(String name) {
        this.name = name;
    }

    public void add(Dir dir) {
        dirs.add(dir);
    }

    public void print(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print('-');
        }
        System.out.println(name);
        for (Dir dir : dirs) {
            dir.print(depth + 1);
        }
    }

}
