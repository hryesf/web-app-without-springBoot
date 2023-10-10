package dev.hryesf.repository;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();
}
