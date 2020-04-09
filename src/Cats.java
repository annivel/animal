public class Cats extends Animal {


    public void Cat(){
        this.runLimit = 200;
        this.swimLimit = 0;
        this.jumpLimit = 2;
        this.appetite = 10;
    }

    public void eat (int eat) {
        boolean result;
        if (appetite == eat){
            result = true;
            System.out.println("Это достаточное количество еды для кота");
        } else {
            result= false;
            System.out.println("недостаточное количество еды");
        }

        }
    }














