package homework_9.task_7;

import java.io.File;

// название класса List не очень хорошо отображает его предназначение. Что-нибудь вроде FileSystem было бы гораздо понятнее
public class List {

    public void search(String path) { // думаю лучше в метод передавать File, а не String, тогда 9 строка не нужна будет
        File list = new File(path);
        File[] newList = list.listFiles();
        if (newList == null) return; // всегда используй скобки {} для блока if и др
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
