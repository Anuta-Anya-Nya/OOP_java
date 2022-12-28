package service.user;

import data.User;

public interface DataService<U extends User> {
   void create(User user); 
   User read(User user);
}
