
    public class Zombie extends Monster
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.println("Raaaauuughhhh");
    }

    @Override
    public void attack(){
        super.attack();
        growl();
   }


}

