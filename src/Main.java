public class Main {
    public static void main(String[] args){
        Quadrilatere carre=new Quadrilatere();
        System.out.println("le perimetre d'un carre:"+carre.calculerPerimetreCarre());
        System.out.println("la surface d'un carre:"+carre.calculerSurface());

        System.out.println("**********************Affichage du deuxieme carre**********************");
        Quadrilatere carre2=new Quadrilatere(5.5);
        System.out.println("le perimetre d'un carre:"+carre2.calculerPerimetreCarre());
        System.out.println("la surface d'un carre:"+carre2.calculerSurface());

    }
}
