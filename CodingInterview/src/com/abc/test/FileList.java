package com.abc.test;

import java.io.File;
/**
 * 按树的结构递归列出目录结构
 * 本地新建一些目录和文件来模拟，效果如下：
 * A
        B
            E
                H
                I.txt
            F.txt
            G.txt
        C
        D.txt
 * @author Jerry
 *
 */
public class FileList {

	public static void main(String[] args) {
		File file = new File("e:/A");
		System.out.println(file.getName());
		tree(file, 1);
	}

	private static void tree(File f, int level) {
		String preStr = "";
		for (int i = 0; i < level; i++) {
			preStr += "    ";
		}
		File[] childs = f.listFiles();
		for (int i = 0; i < childs.length; i++) {
			System.out.println(preStr + childs[i].getName());
			if (childs[i].isDirectory()) {
				tree(childs[i], level + 1);
			}
		}
	}
}
