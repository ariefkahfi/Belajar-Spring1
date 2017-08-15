package com.arief.Spring.Services;

/**
 * Created by Arief on 7/16/2017.
 */

import com.arief.Spring.Entity.Pegawai;
import java.util.List;

public interface PegawaiDAO {
    void simpan(Pegawai pegawai);
    List<Pegawai> getAll();
}
