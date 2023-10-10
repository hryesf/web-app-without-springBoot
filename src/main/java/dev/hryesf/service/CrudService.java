package dev.hryesf.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T> {
    List<T> list();

    // CRUD ==> Create, Read, Update, Delete
    Optional<T> get(int id);
    T create(T t);
    void update(int id, T t);
    void delete(int id);
}
