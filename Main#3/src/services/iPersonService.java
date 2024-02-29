package services;

import java.util.List;

public interface iPersonService<T> {

    // -- Сборка информации из сервис файлов
    public List<T> getAll();
    public void create(String name, int age);
    
    
}
