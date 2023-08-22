// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class hogwarts {

    public static void compareStudents(Student student1, Student student2) {
        int magicalPower1 = student1.getMagic();
        int magicalPower2 = student2.getMagic();

        int teleportDistance1 = student1.getTeleportation();
        int teleportDistance2 = student2.getTeleportation();
        if (magicalPower1 > magicalPower2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по силе магии.");
        } else if (magicalPower1 < magicalPower2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по силе магии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }

        if (teleportDistance1 > teleportDistance2) {
            System.out.println(student1.getName() + " превосходит " + student2.getName() + " по трансгерссии.");
        } else if (teleportDistance1 < teleportDistance2) {
            System.out.println(student2.getName() + " превосходит " + student1.getName() + " по трансгрессии.");
        } else {
            System.out.println("Сравнение между " + student1.getName() + " и " + student2.getName() + " невозможно, так как их силы равны.");
        }
    }
}


