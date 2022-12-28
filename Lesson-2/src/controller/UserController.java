package controller;

import data.User;

public interface UserController<U extends User, I> extends Controller<U,I>{
    U findByFio(String fio);
}
