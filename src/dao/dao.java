package dao;

import bean.Bean;

import java.util.List;

/**
 * Created by falling on 16/5/28.
 */
public interface DAO {
    void save(Bean bean);
    void delete();
    void update();
    Object get();
    List getForList();

}
