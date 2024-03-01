package Controllers;

import java.util.List;

import Domen.Person;
import Domen.WorkingPerson;
// Выплата зарплаты. Информация из WPerson
public class AccountController {
    public  static <T extends WorkingPerson, V> void PaySalary(T person, V salary){// Сортировка для безопасности
        System.out.println(person.getName() + "Выплаченная зарплата: " + salary);  // вывод на консоль 

    }

/**
 * Нужно суммировать все возраста из выбранных списков и после этого поделить на кол-во. 
 */
public static <M extends Person> void averageAge(List<M> list){
    double sumTempAverageAge = 0;
    for (M m : list) {
        sumTempAverageAge = sumTempAverageAge + m.getAge();
    }
    double averageAge = sumTempAverageAge/ list.size();
    System.out.println("Средний возраст " + averageAge);
    

}

}
