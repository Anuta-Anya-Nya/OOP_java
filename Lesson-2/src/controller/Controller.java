package controller;

public interface Controller<U, I> {
    void create(U entity);

    void save(U entity);

    U findById(I id);
}

