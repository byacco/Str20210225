package Lesson4;

public class staff {

    public static void main(String[] args) {
        StaffMember g1 = new StaffMember("John Smith", "Lead Guitar",
                "8-800-666-00-00",
                60000,32);

        System.out.println("Welcome on scene our" + g1.getPosition() + " his name " + g1.getFio()
                + "you ca call him, " + g1.getPhoneNum() + " but he won't play lesser than "
                + g1.getSalary() + " after all, he is " + g1.getHowOld() + " years old.");

        StaffMember g2 = new StaffMember("Jane Doe", "Vocal",
                "8-800-700-55-55", 40000, 25);
        StaffMember g3 = new StaffMember("Jack Black", "Base",
                "8-800-700-55-56", 80000, 45);
        StaffMember g4 = new StaffMember("Richard Pick", "Drums",
                "8-800-700-55-57", 90000, 41);
        StaffMember g5 = new StaffMember("Rick Roll", "",
                "8-800-700-55-55", 50000, 34);



        StaffMember[] staffMembers = {g1, g2, g3, g4, g5};

        for (int i = 0; i < staffMembers.length; i++) {
            if (staffMembers[i].getHowOld() > 40) {
                System.out.println(staffMembers[i].getFio() + " " + staffMembers[i].getHowOld());
            } else {
                System.out.println("Ничего не найдено.");
            }
        }

        for (int i = 0; i < staffMembers.length; i++) {
            System.out.println(staffMembers[i].getUsrId() + " " + staffMembers[i].getFio() +
                    " " + staffMembers[i].getSalary() + " USD");
        }


    }
}
