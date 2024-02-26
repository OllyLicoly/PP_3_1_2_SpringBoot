package com.example.PP_3_1_2_SpringBoot.dao;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import com.example.PP_3_1_2_SpringBoot.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }


    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void deleteUser(Long id) {
        Query query = entityManager.createQuery ("delete from User " +
                "where id=:userID");
        query.setParameter("userID", id).executeUpdate();
    }
}