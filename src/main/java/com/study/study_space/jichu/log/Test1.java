package jichu.log;

import org.apache.log4j.Logger;

public class Test1 {

    public static final Logger LOGGER=Logger.getLogger(Test1.class);

    public static void main(String[] args){

        LOGGER.debug("hahah");
        LOGGER.debug("hahah");
        LOGGER.info("hahah");
        LOGGER.info("hahah");
        try {
            getException();
        } catch (Exception e) {
            LOGGER.error("err"+e);
        }
    }

    public static void getException() throws Exception {

        System.out.println("hah");
        throw new Exception();
    }


}
