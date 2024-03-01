package Controllers;

import Domen.WorkingPerson;
// Выплата зарплаты. Информация из WPerson
public class AccountController {
    public  static <T extends WorkingPerson, V> void PaySalary(T person, V salary){// Сортировка для безопасности
        System.out.println(person.getName() + "Выплаченная зарплата: " + salary);

    }

public static void averageAge(){

}

}
