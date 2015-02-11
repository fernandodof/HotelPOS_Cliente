package br.com.pos.hotel.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.persistence.*;

/**
 *
 * @author Fernando
 * @param <T>
 */
public interface GenericDAO<T> {

    public boolean save(T entity);

    public T find(Class<T> classType, T entity);

    public boolean update(T entity);

    public boolean delete(T entity);

    public T getById(Class<T> classTClass, Object id);

    public T simpleQuery(String query, Map<Integer, Serializable> map);

    public EntityManager getEntityManager();

    public List<T> getAll(Class<T> classType);

    public Object executeNativeQuery(String query);

    public T getSingleResultOfNamedQuery(String namedQuery, Map<String, Object> map);

    public T getSingleResultOfNamedQuery(String namedQuery);

    public List<T> getListResultOfNamedQuery(String namedQuery);

    public List<T> getListResultOfNamedQuery(String namedQuery, Map<String, Object> map);

    public List<T> getListResultOfNamedQueryWithLimit(String namedQuery, int min, int max);
}
