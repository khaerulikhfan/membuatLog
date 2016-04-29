/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICE;

import DAO.HelloWorldDao;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;



/**
 *
 * @author SB 604-14
 */
public class HelloWorldService {
    private static final Logger logger = Logger.getLogger(HelloWorldService.class);
    private HelloWorldDao helloWorldDao;
    
    public void setHelloWorldDao(HelloWorldDao helloWorldDao){
        this.helloWorldDao = helloWorldDao;
    }
    
    public void deleteTheWorld(Integer id){
        logger.log(Level.WARN, "Method deleteTheWorld dijalankan");
        try{
            helloWorldDao.delete(id);
        }catch (IllegalArgumentException e){
            logger.error(e.getMessage(), e);
        }
    }

    public void saveTheWorld() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
