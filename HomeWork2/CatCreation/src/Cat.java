public class Cat {
    Boolean isHome; // домашний или дворовый
    String eyesColor; // цвет глаз
    String catBreed; // порода котана
    String catName; // имя
    String furColor; // цвет шерсти
    int age; // возраст

    //конструктор дворового безымянного кота, гордого героя улиц, который не носит плащ
    public Cat () {
        this.catBreed = "Гордый дворянин";
        this.catName = "Любое";
        this.isHome = false;
    }

    //конструктор домашнего котейки
    public Cat(String catName, String catBreed, int age){
        this.catBreed = catBreed;
        this.catName = catName;
        this.age = age;
        this.isHome = true;
    }

    // мурчалка - запускается только при определённом воздействии на кота
    private void purCat (){
        System.out.println();
        System.out.println(catName + " наелся вкусняшек");
        System.out.println(catName  + " снизошёл помурчать с вами");
        System.out.println("мур-мур-мур");

    }

    // шипит - запускает по внешнему воздействию
    private void hissCat (){
        System.out.println();
        System.out.println(catName + " сильно вами недоволен");
        System.out.println("ш-ш-ш-ш");
        System.out.println(catName + " вас поцарапал");

    }

    //открытый метод - покрмить кота
    public void feedTheCat(){
        System.out.println("Кормим кота вкусняхами:");
        purCat();

        System.out.println();
        System.out.println("У кота проснулось игривое настроение");
        funCat();
    }

    //наказать кота - дать тапком промеж ушей
    public void punishTheCat (){
        System.out.println();
        System.out.println("Ругаемся на кота за шалости:");
        hissCat();
    }

    //кот развлекается
    public void funCat (){
        System.out.println();

        System.out.println(catName + " играется со всем подряд");
        System.out.println(catName + " уронил всё что возможно");
        System.out.println(catName + " порвал шторы");
        System.out.println(catName + " поцарапал обои");
        System.out.println(catName + " уснул в земле из опрокинутого цветочного горшка");
        System.out.println();
    }
}
