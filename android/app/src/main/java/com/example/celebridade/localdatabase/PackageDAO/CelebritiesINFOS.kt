package com.example.celebridade.localdatabase.PackageDAO

import androidx.room.*

    /* DATA CLASS TESTER, data classe para setar name, imagem e long ID
    data class User(
    val name : String,
    val surname : String = "",
    val age : Int = 0
    )
    User("Steve")
    User("Steve", "Jobs")
    User("Steve", "Jobs", 56)
    User("Steve",56) // This wont compile
    */
@Entity(tableName = "celebrities")
data class CelebritiesINFOS(
    //Coluna de informções da tabela
    //Nome
    @ColumnInfo(name = "name") val name: String,
    //Imagem
    @ColumnInfo(name = "image") val image: Int,
    //AutoGenerate da primary key
    @PrimaryKey(autoGenerate = true) val id: Long = 0
//---------------------------------------------------------------------------------------------------------------------------------------
    /*
    @Entity
data class Person(
        @PrimaryKey(autoGenerate = true)
        val uid: Long,
        val firstName: String = "",
        val lastName: Int = "",
        val email: String,Long,Double,Float = ""
)

@Entity(foreignKeys = arrayOf(ForeignKey(entity = Person::class,
                        parentColumns = arrayOf("uid"),
                        childColumns = arrayOf("ownerId"),
                        onDelete = ForeignKey.CASCADE)))
     */
//---------------------------------------------------------------------------------------------------------------------------------------
)
