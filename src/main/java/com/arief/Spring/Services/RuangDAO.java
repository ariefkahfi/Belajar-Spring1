package com.arief.Spring.Services;

/**
 * Created by Arief on 7/16/2017.
 */
import com.arief.Spring.Entity.Ruang;
import java.util.List;
public interface RuangDAO {
    void simpan(Ruang ruang);
    List<Ruang> getAll();
}
