public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer2 + boxer1);
        System.out.println(boxer2 - boxer1);

        System.out.println(boxer2 % boxer1);
        System.out.println("-------------------------------");
        var workersTotal = 640 / 8;
        System.out.println("Всего работников в компании - " + workersTotal + " человек");
        System.out.println("-------------------------------");
        var t = 640 / (workersTotal + 94);
        System.out.println("Если в компании работает " + (workersTotal + 94) + " человек, то всего " + t + " часов работы может быть поделено между сотрудниками");
    }
}