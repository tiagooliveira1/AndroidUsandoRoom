package com.example.troli.testeapp0205;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by troli on 02/05/2018.
 */

@Entity
public class Lembrete {

    @PrimaryKey(autoGenerate = true)
    private long ID;
    private String texto;
    @ColumnInfo(name = "data_lembrete")
    private long dataLembrete;


    private long importancia;

    public Lembrete() {}

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public long getDataLembrete() {
        return dataLembrete;
    }

    public void setDataLembrete(long dataLembrete) {
        this.dataLembrete = dataLembrete;
    }
    public long getImportancia() {
        return importancia;
    }

    public void setImportancia(long importancia) {
        this.importancia = importancia;
    }
}
