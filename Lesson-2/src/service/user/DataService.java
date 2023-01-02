package service.user;

import data.User;

public interface DataService<U extends User> {
   void create(U user); 
   U read(U user);
}
