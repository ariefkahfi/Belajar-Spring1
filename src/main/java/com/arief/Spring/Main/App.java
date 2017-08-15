package com.arief.Spring.Main;

import com.arief.Spring.Entity.Pegawai;
import com.arief.Spring.Entity.Ruang;
import com.arief.Spring.Konfig.MainBeans;
import com.arief.Spring.Services.PegawaiDAO;
import com.arief.Spring.Services.RuangDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Arief on 7/16/2017.
 */
public class App {



    public static void main(String []args){


        ApplicationContext context = new AnnotationConfigApplicationContext(MainBeans.class);

        PegawaiDAO pegawaiDAO = (PegawaiDAO)context.getBean("pegawaiDAO");
        RuangDAO ruangDAO = (RuangDAO)context.getBean("ruangDAO");




    }
}
