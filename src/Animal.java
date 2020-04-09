public class Animal {

    int runLimit;
    int swimLimit;
    double jumpLimit;
    int appetite;

    public Animal() {
    }

    public void run(int run){
        boolean result = true;
        result = run <= runLimit;
        System.out.println("run: " + result);
    }


    public void swim(int swim){
        boolean result;
        result = swim <= swimLimit;
        System.out.println("swim: " + result);
    }

    public void jump( double jump){
        boolean result;
        result = jump <=jumpLimit;
        System.out.println("jump: " + result);
    }




    public static void main(String[] args) {
        Dogs ovcharka = new Dogs(1000, 100, 3); // нестандартные ограничения
        Cats cat = new Cats(); //дефолтная кошка со стандартными ограничениями
        Dogs dogs = new Dogs(1, 1, 1);


        ovcharka.run(10);
        cat.run(1);
        ovcharka.swim(8);
        cat.swim(5);
        ovcharka.jump(1);
        cat.jump(1.5);
         cat.eat(15);






    }
}







