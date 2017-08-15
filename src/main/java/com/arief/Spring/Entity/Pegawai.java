package com.arief.Spring.Entity;

import javax.persistence.*;

/**
 * Created by Arief on 7/16/2017.
 */
@Entity
@Table(name = "data_pegawai")
public class Pegawai {


    @Id
    @Column(name = "id_pegawai")
    private int idPegawai;


    @Column(name = "nama_pegawai")
    private String namaPegawai;


    @OneToOne(mappedBy = "pegawai")
    private Ruang ruang;

    public Pegawai(){}

    public Pegawai(int idPegawai, String namaPegawai, Ruang ruang) {
        this.idPegawai = idPegawai;
        this.namaPegawai = namaPegawai;
        this.ruang = ruang;
    }



    public Pegawai(String namaPegawai, Ruang ruang) {
        this.namaPegawai = namaPegawai;
        this.ruang = ruang;
    }

    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    public String getNamaPegawai() {
        return namaPegawai;
    }

    public void setNamaPegawai(String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }

    public Ruang getRuang() {
        return ruang;
    }

    public void setRuang(Ruang ruang) {
        this.ruang = ruang;
    }

    @Override
    public String toString() {
        return "Pegawai{" +
                "idPegawai=" + idPegawai +
                ", namaPegawai='" + namaPegawai + '\'' +
                ", ruang=" + ruang +
                '}';
    }
}
