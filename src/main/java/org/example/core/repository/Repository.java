package org.example.core.repository;

// SOLID (L) e (O)
public abstract class Repository {
    abstract void save(Object object);
    abstract void update(Object oldObject, Object newObject);
    abstract Object getById(int index);
    abstract void delete(int index);
}
