package Lesson4;

// TODO
//  1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//  2 Конструктор класса должен заполнять эти поля при создании объекта;
//  3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//  4 Вывести при помощи методов из пункта 3 ФИО и должность.
//  5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//  6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
//  7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.




public class StaffMember {

    // Поля класса с которыми работает конструктор
    private String fio;
    private String position;
    private String phoneNum;
    private int salary;
    private int age;
    boolean salaryUp;
    private static int id = 0;
    private int usrId;

    // Конструктор
   StaffMember(String fio, String position, String phoneNum, int salary, int age){
       this.fio = fio;
       this.position = position;
       this.phoneNum = phoneNum;
       this.salary = salary;
       this.age = age;
       this.usrId = ++id;
   }

   int getHowOld() {
       return age;
   }

   int getSalary() {
       return (int) salary;
   }

   String getPhoneNum() {
       return phoneNum;
   }

   void setSalary(int pay){
       this.salary = this.salary + pay;
   }

   String getFio() {
       return fio;
   }

   String getPosition() {
       return position;
   }

   int getUsrId() {
       return usrId;
   }




    static void main(String[] args) {

    }


}
