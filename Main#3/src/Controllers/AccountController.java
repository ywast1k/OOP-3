package Controllers;

import Domen.WorkingPerson;
// Выплата зарплаты. Информация из WPerson
public class AccountController {
    public  static <T extends WorkingPerson, V> void PaySalary(T person, V salary){// подключение person
        System.out.println(person.getName() + "Выплаченная зарплата: " + salary);

    }
}
