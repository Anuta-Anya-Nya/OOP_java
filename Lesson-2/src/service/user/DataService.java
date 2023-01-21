package service.user;

import java.util.List;

import data.User;

public interface DataService<U extends User> {
   void create(U user);

   U findById(Integer id);

   U findByFio(String fio);

   void sortUsers(List<U> users);

   void sortUsersByName(List<U> users);

   U findByBirth(int birth);

   void DeleteUser(U user);

}
