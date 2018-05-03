package com.example.troli.testeapp0205;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by troli on 02/05/2018.
 */
@Dao
public interface LembreteDAO {

    @Insert
    public long inserir(Lembrete lembrete);

    @Query("SELECT * from Lembrete")
    public List<Lembrete> findAll();

    @Query("SELECT * FROM Lembrete where ID == :id")
    public Lembrete findByID(long id);

    @Delete
    public int excluir(Lembrete lembrete);

    @Update
    public int editar(Lembrete lembrete);

    @Query("SELECT * FROM Lembrete where importancia == :importancia")
    public Lembrete findByImportancia(long importancia);

    @Query("DELETE FROM Lembrete")
    public void deleteAll();


}
