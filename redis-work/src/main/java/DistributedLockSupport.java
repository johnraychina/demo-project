import java.io.File;
import java.io.IOException;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @author Zhang Yi
 */
public class DistributedLockSupport {
    private static RedissonClient redisson;

    public void init() throws IOException {
        //ref: https://redisson.pro/
        // 1. Create config object
        Config config = new Config();
        config.useClusterServers()
            // use "rediss://" for SSL connection
            .addNodeAddress("redis://127.0.0.1:7181");

        // or read config from file
        config = Config.fromYAML(new File("config-file.yaml"));


        // 2. Create Redisson instance
        // Sync and Async API
        RedissonClient redisson = Redisson.create(config);
    }

    public <K, V> void getLock() {

        // 3. Get Redis based implementation of java.util.concurrent.ConcurrentMap
        RMap<K, V> map = redisson.getMap("myMap");

        // 4. Get Redis based implementation of java.util.concurrent.locks.Lock
        RLock lock = redisson.getLock("myLock");
    }
}
