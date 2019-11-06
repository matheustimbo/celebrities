package com.example.celebridade.localdatabase.quote

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.celebridade.localdatabase.PackageDAO.CelebritiesINFOS


//---------------------------------------------------------------------------------------------------------------------------------------
/* COMO USAR ENTITY
 @Entity
 public class User {
   @PrimaryKey
   private final int uid;
   private String name;
   @ColumnInfo(name = "last_name")
   private String lastName;

   public User(int uid) {
       this.uid = uid;
   }
   public String getLastName() {
       return lastName;
   }
   public void setLastName(String lastName) {
       this.lastName = lastName;
   }
 }

 */
//---------------------------------------------------------------------------------------------------------------------------------------

@Entity(
    tableName = "quotes",
    foreignKeys = [
        ForeignKey(
            entity = CelebritiesINFOS::class,

            parentColumns = ["id"],

            childColumns = ["celebrityId"],

            //duas funções oferecidas pela foreikey para dar update ou dele nas informações

            onUpdate = ForeignKey.CASCADE,
            onDelete = ForeignKey.CASCADE
        )
    ]
)

/* EXEMPLO DE DATA CLASS
data class Person(val name: String) {
    var age: Int = 0

@ColumnInfo(colunm = "str") val str: value,
    @ColumnInfo(column = "str") val quote: String,
    @PrimaryKey(generatetabel = boolean) val str: value
}
 */
data class InfoRoom(


        @ColumnInfo(name = "celebrityId") val celebrityId: Long,

        @ColumnInfo(name = "quote") val quote: String,

        @PrimaryKey(autoGenerate = true) val id: Long = 0
)
