/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import org.apache.log4j.Logger;


/**
 *
 * @author SB 604-14
 */
public class HelloWorldDao {
    private static final Logger logger = Logger.getLogger(HelloWorldDao.class);
    
    public void save(){
        logger.info("Menjalankan method save");
    }
    
    public void delete(Integer id) throws IllegalArgumentException{
        logger.info("menjalankan method delete");
        
        if (logger.isDebugEnabled()){
            logger.debug("ID : "+id);
        }
        
        if(id <0){
            throw new IllegalArgumentException("ID tidak boleh kurang dari nol");
        }
    }
}
