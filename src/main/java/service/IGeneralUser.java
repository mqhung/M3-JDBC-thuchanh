package service;

import java.util.List;

public interface IGeneralUser<T> {
    public void insert(T t);

    public T select(int id);

    public List<T> selectAll();

    public boolean delete(int id);

    public boolean update(T t);

}
