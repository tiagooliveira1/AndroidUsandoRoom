package com.example.troli.testeapp0205;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

/**
 * Created by troli on 02/05/2018.
 */

@Database(entities = {Lembrete.class}, version =3 )
public abstract class AppDatabase extends RoomDatabase {
    public abstract LembreteDAO lembreteDAO();

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context) {
        if(INSTANCE == null)
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "lembrete_db").fallbackToDestructiveMigration().build();
            // INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "lembrete_db").build();
            /* Usando esta linha abaixo, cada vez que alterar o VERSION do banco, ele destroi e recria tudo */
            //INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "lembrete_db").fallbackToDestructiveMigration.build();
        return INSTANCE;
    }
}
