package Alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

    private static Logger log = LogManager.getLogger(Demo.class.getName());

    public static void main(String args[]) {


        log.debug("I am debugging");

        if(2 < 0) {
            log.debug("Object is present");
        }

        else {
            log.info("Some information");
            log.error("Object is not present");
        }

        log.fatal("Fatal issue");
        log.warn("This is warning");

    }
}
