package homework_9.task_7;

import java.io.File;

public class List {

    public void search(String path) {
        File list = new File(path);
        File[] newList = list.listFiles();
        if (newList == null) return;
        for (File roots : list.listFiles()) {
            if (roots.isDirectory()) {
                search(roots.getPath());
                System.out.println(roots.getPath() + "== КАТАЛОГ==");
            } else {
                System.out.println(roots.getPath() + " ==Файл==");
            }
        }
    }
}
