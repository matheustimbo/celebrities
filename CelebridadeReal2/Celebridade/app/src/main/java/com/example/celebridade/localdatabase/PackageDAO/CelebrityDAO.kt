package com.example.celebridade.localdatabase.PackageDAO

import androidx.room.*
import com.example.celebridade.localdatabase.quote.InfoRoom

@Dao
interface celebritiesDAO {
    //ADICIONAR (PEGAR) TODAS AS INFORMAÇÕES DA LISTA(Infos das celebridades)
    @Query("SELECT * FROM celebrities")
    fun getEveryone(): List<CelebritiesINFOS>

    //Pega as informações e atribui ao id das perguntas
    @Query("SELECT * FROM quotes WHERE celebrityId = :celebrityId")//mudar possivelmente "quotes
    fun getAllInfos(celebrityId: Long): List<InfoRoom>


//---------------------------------------------------------------------------------------------------------------------------------------
    /* INSERT DO DAO
     @Dao
 public interface MyDao {
     @Insert(onConflict = OnConflictStrategy.REPLACE)
     public void insertUsers(User... users);
     @Insert
     public void insertBoth(User user1, User user2);
     @Insert
     public void insertWithFriends(User user, List<User> friends);
 }


     */
//---------------------------------------------------------------------------------------------------------------------------------------


    //Inserindo as informações a cada celebridade
    @Insert
    fun add(vararg celebritiesINFOS: CelebritiesINFOS)

    //Inserindo as informações na lista infoRoom(onde ficam as chamadas para as imagens e as perguntas
    @Insert
    fun addInfos(infoRoom: List<InfoRoom>)

//---------------------------------------------------------------------------------------------------------------------------------------

    /* QUERY SELECT
    class UserName {
     public String name;
     @ColumnInfo(name = "last_name")
     public String lastName;

     @Query("SELECT last_name, name FROM user WHERE uid = :userId LIMIT 1")
     public abstract UserName findOneUserName(int userId);
 }
     */

//---------------------------------------------------------------------------------------------------------------------------------------

    //Excluir uma celebridade
    @Query("DELETE FROM celebrities")
    fun excluCelebritiesfun()

    //excluir celebridade pelo id
    @Query("DELETE FROM celebrities WHERE id = :id")
    fun excluCelebritiesfun2(id: Long)

    //excluir as informações(as perguntas)
    @Query("DELETE FROM quotes")
    fun excluInfos()

    //excluir as perguntas pelo ID
    @Query("DELETE FROM quotes WHERE id = :id")
    fun excluInfos2(id: Long)
//---------------------------------------------------------------------------------------------------------------------------------------
    /*
      @Query("SELECT * FROM user WHERE uid IN(:userIds)")
     public abstract List findByIds(int[] userIds);
     */
//---------------------------------------------------------------------------------------------------------------------------------------
}