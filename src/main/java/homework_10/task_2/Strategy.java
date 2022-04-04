package homework_10.task_2;

import java.lang.constant.Constable;

public enum Strategy {

    LOWERCASE {
        public String rename(String name) {
            return name.toLowerCase();
        }
    },
    UPPERCASE {
        public String rename(String name) {
            return name.toUpperCase();
        }
    },
    UPPERFIRST {
        public String rename(String name) {
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }
    };

    abstract String rename(String name);
}
