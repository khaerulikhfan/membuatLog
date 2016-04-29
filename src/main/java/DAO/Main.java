/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import SERVICE.HelloWorldService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * @author SB 604-14
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args){
        logger.info("Menginstankan dao");
        HelloWorldDao dao = new HelloWorldDao();
        
        logger.info("Menginstankan service");
        HelloWorldService service = new HelloWorldService();
      
        logger.debug("Merangkai object");
        service.setHelloWorldDao(dao);
        
        logger.info("save the world");
        service.saveTheWorld();
        
        
        //jalankan method delete, skenario normal
        logger.trace("Akan menghapus World 10");
        service.deleteTheWorld(10);
        
        //jalankan method delete, skenario error
        logger.trace("Akan menghjapus world -7");
        service.deleteTheWorld(-7);
    }
}
