package com.arief.Spring.Services;

import com.arief.Spring.Entity.Pegawai;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Arief on 7/16/2017.
 */
public class PegawaiImplDAO implements PegawaiDAO {


    @Autowired
    private SessionFactory sessionFactory;

    public PegawaiImplDAO(){}
    public PegawaiImplDAO(SessionFactory sessionFactory){this.sessionFactory=sessionFactory;}

    @Transactional
    public void simpan(Pegawai pegawai) {
        sessionFactory.getCurrentSession().save(pegawai);
        System.out.println("data disimpan(PegawaiImplDAO)");
    }

    @Transactional
    public List<Pegawai> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Pegawai").list();
    }
}
