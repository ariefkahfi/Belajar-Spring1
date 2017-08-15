package com.arief.Spring.Entity;

import javax.persistence.*;

/**
 * Created by Arief on 7/16/2017.
 */
@Entity
@Table(name = "ruang_pegawai")
public class Ruang {


    @Id
    @Column(name = "nomor_ruang")
    private int nomorRuang;


    @Column(name = "jenis_ruang")
    private String jenisRuang;



    @OneToOne
    private Pegawai pegawai;


    public Ruang(){}

    public Ruang(int nomorRuang, String jenisRuang, Pegawai pegawai) {
        this.nomorRuang = nomorRuang;
        this.jenisRuang = jenisRuang;
        this.pegawai = pegawai;
    }



    public Ruang(String jenisRuang, Pegawai pegawai) {
        this.jenisRuang = jenisRuang;
        this.pegawai = pegawai;
    }


    @Override
    public String toString() {
        return "Ruang{" +
                "nomorRuang=" + nomorRuang +
                ", jenisRuang='" + jenisRuang + '\'' +
                '}';
    }

    public int getNomorRuang() {
        return nomorRuang;
    }

    public void setNomorRuang(int nomorRuang) {
        this.nomorRuang = nomorRuang;
    }

    public String getJenisRuang() {
        return jenisRuang;
    }

    public void setJenisRuang(String jenisRuang) {
        this.jenisRuang = jenisRuang;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }
}
