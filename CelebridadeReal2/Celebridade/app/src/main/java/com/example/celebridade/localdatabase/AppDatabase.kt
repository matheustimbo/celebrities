package com.example.celebridade.localdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.celebridade.localdatabase.PackageDAO.CelebritiesINFOS
import com.example.celebridade.localdatabase.PackageDAO.celebritiesDAO
import com.example.celebridade.localdatabase.quote.InfoRoom

//---------------------------------------------------------------------------------------------------------------------------------------
/* EXEMPLO DE CRIAÇÃO DE DATAABSE

public class MyDBHandler extends SQLiteOpenHelper {
 //information of database
 private static final int DATABASE_VERSION = 1;
 private static final String DATABASE_NAME = "studentDB.db";
 public static final String TABLE_NAME = "Student";
 public static final String COLUMN_ID = "StudentID";
 public static final String COLUMN_NAME = "StudentName";
 //initialize the database
 public MyDBHandler(Context context, Stringname, SQLiteDatabase.CursorFactoryfactory, intversion) {
  super(context, DATABASE_NAME, factory, DATABASE_VERSION);
 }
 @Override
 public void onCreate(SQLiteDatabase db) {}
 @Override
 public void onUpgrade(SQLiteDatabase db, int i, int i1) {}
 public String loadHandler() {}
 public void addHandler(Student student) {}
 public Student findHandler(String studentname) {}
 public boolean deleteHandler(int ID) {}
 public boolean updateHandler(int ID, String name) {}
}
 */
//---------------------------------------------------------------------------------------------------------------------------------------

// Instanciando as entidades e passando como parametro as classes CelebritiesINFOS e InfoRoom
@Database(entities = [CelebritiesINFOS::class, InfoRoom::class], version = 3, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun celebrityDao(): celebritiesDAO

    //---------------------------------------------------------------------------------------------------------------------------------------
    /* Pegando como Exemplo de Instanciamneto da APPDATABASE
      companion object {
        private lateinit var instance: EventManager

        val managerInstance: EventManager
            get() {
                if (instance == null) {
                    instance = EventManager()
                }

                return instance
            }
    }

    fun sendEvent(eventName: String): Boolean {
        Log.d("Event Sent", eventName)
        return true;
    }
     */
    //---------------------------------------------------------------------------------------------------------------------------------------
    companion object {

        private var instance: AppDatabase? = null

        fun getInstance(context: Context) : AppDatabase {

            return instance?.let {it}?: kotlin.run {
                instance = Room.databaseBuilder(
                    context,
                    AppDatabase::class.java,
                    "PackageDAO-database"
                ).allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

                instance
            }!!
        }
    }
}