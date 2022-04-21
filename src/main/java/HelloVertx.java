import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

import java.util.logging.Logger;

public class HelloVertx extends AbstractVerticle {

    public void start(Future<Void> future){
        Logger.getLogger(HelloVertx.class.getName()).info("Getting Started with Vertx");

    }
}
