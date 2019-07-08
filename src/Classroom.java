public class Classroom {

    public static void main(String[] args) {

        // la référence laetitia reçoit une nouvelle instance de la classe Wilder
        Wilder laetitia = new Wilder("Laetitia",true);
        System.out.println(laetitia.whoAmI());

        // utilisation de getters      
        //System.out.println("1. Duck name is : " + riri.getName());
        //System.out.println("2. He was " + String.valueOf(riri.getAge()));
        
        // utilisation d'un setter
        laetitia.setAware(false);
        System.out.println(laetitia.whoAmI());

        Wilder edwin = new Wilder("Edwin", false);
        System.out.println(edwin.whoAmI());
        edwin.setFirstname("Yannis");
        System.out.println(edwin.whoAmI());

        // méthode instanciée
        Wilder valentin = new Wilder("Valentin",false);
        System.out.println(valentin.whoAmI());

        // méthode statique
        //System.out.println("7. What the duck says : " + Duck.quack());

        // deux références vers un même objet
        Wilder alexandra = new Wilder("Alexandra", true);
        Wilder clement = alexandra;
        System.out.println(clement.whoAmI());

        // les deux pointent vers le même espace mémoire :
        clement.setFirstname("Clement");
        System.out.println(clement.whoAmI());
    }
}
