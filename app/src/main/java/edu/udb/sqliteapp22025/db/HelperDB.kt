package edu.udb.sqliteapp22025.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import edu.udb.sqliteapp22025.model.Categoria
import edu.udb.sqliteapp22025.model.Productos

class HelperDB(context: Context?) :
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    companion object {
        private const val DB_NAME = "tienda.sqlite"
        private const val DB_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(Categoria.CREATE_TABLE_CATEGORIA)
        db.execSQL(Productos.CREATE_TABLE_PRODUCTOS)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}

}