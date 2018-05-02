package com.example.troli.testeapp0205;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by troli on 02/05/2018.
 */

@Database(entities = {Lembrete.class}, version =1 )
public abstract class AppDatabase extends RoomDatabase {
    private LembreteDAO lembreteDAO;

    private static AppDatabase INSTANCE;

    public AppDatabase getDatabase(Context context) {
        if(INSTANCE == null)
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "lembrete_db").build();
        return INSTANCE;
    }
}
