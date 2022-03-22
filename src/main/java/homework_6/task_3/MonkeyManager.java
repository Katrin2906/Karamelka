package homework_6.task_3;

public class MonkeyManager {
    // что-то пошло не так, у тебя все названия полей класса с большой буквы, а должны начинаться с маленькой BananasBranches -> bananasBranches
    
    // BananasBranches, Bananas и т.д. скорее всего должны быть классами с одноименным названием, а не Integer/Boolean, посмотри как Саша Козлов решил задачу
    private Integer BananasBranches;
    private Integer Bananas;
    private Integer CoconutBranches;
    private Integer Coconut;
    private Boolean CoconutMonkey;
    private Boolean BananaMonkey;

    public Integer BananaTree(Integer BananasBranches, Integer Bananas, Boolean BananaMonkey) {
        this.Bananas = Bananas;
        this.BananaMonkey = BananaMonkey;
        this.BananasBranches=BananasBranches;
        return ((BananasBranches + 1) * Bananas);
    }

    public Integer CoconutTree(Integer CoconutBranches, Integer Coconut, Boolean CoconutMonkey) {
        this.CoconutMonkey = CoconutMonkey;
        this.Coconut = Coconut;
        this.CoconutBranches=CoconutBranches;
        return ((CoconutBranches + 1) * Coconut);
    }

    public Integer BothTrees() {
        return ((BananasBranches + 1) * Bananas) + ((CoconutBranches + 1) * Coconut);
    }

    public String TreeCount() {
        if (CoconutMonkey == true) { // if (CoconutMonkey) {
            return "Кокосов выросло" + ((CoconutBranches + 1) * Coconut);
        }

        if (BananaMonkey == true) { //  if (BananaMonkey) {
            return "Бананов выросло " + ((BananasBranches + 1) * Bananas);
        }

        if (CoconutMonkey == true && BananaMonkey == true) { //if (CoconutMonkey && BananaMonkey)
            return "Всего фруктов " + ((CoconutBranches + 1) * Coconut) + ((BananasBranches + 1) * Bananas);
        }
        return "Посчитано";
    }


    @Override
    public String toString() {
        return "MonkeyManager{" +
                "BananasBranches=" + BananasBranches +
                ", Bananas=" + Bananas +
                ", CoconutBranches=" + CoconutBranches +
                ", Coconut=" + Coconut +
                ", CoconutMonkey=" + CoconutMonkey +
                ", BananaMonkey=" + BananaMonkey +
                '}';
    }
}

