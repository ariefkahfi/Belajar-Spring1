package com.arief.Spring.Services;

import com.arief.Spring.Entity.Ruang;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Arief on 7/16/2017.
 */
public class RuangImplDAO implements RuangDAO {


    @Autowired
    private SessionFactory sessionFactory;

    public RuangImplDAO() {
    }

    public RuangImplDAO(SessionFactory sessionFactory){this.sessionFactory=sessionFactory;}

    @Transactional
    public void simpan(Ruang ruang) {
        sessionFactory.getCurrentSession().save(ruang);
        System.out.println("data disimpan(RuangImplDAO)");
    }

    @Transactional
    public List<Ruang> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Ruang").list();
    }

}
