package com.stilt.stoytek.stilt.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by frodeja on 08/03/17.
 */

public class SoundlevelInfoDataSource {

    private SQLiteDatabase db;
    private SoundlevelInfoSQLiteHelper dbHelper;

    private static final String[] allColumns = {
            SoundlevelInfoSQLiteHelper.COLUMN_ID,
            SoundlevelInfoSQLiteHelper.COLUMN_TEXT,
            SoundlevelInfoSQLiteHelper.COLUMN_SOUNDLEVEL
    };

    public SoundlevelInfoDataSource(Context context) {
        dbHelper = new SoundlevelInfoSQLiteHelper(context);
    }

    public void open() {
        db = dbHelper.getReadableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    /* TODO: Implement this method */
    public String getFunFact(double eqdBLevel) {
        return null;
    }

    public String getFooFact() {
        return "<placeholder>";
    }


}
