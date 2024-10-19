package repository;

import dto.Admin;

public interface CrudDao <T> extends SuperDao {
    boolean save(T t);
}
