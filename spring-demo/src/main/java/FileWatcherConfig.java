import java.io.File;
import java.time.Duration;

import javax.annotation.PreDestroy;

import org.springframework.boot.devtools.filewatch.FileSystemWatcher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring FileSystemWatcher 后台开一个thread scan directory，比对上一次扫描的目录信息，发现不同触发listener。
 *
 * @author Zhang Yi
 */
@Configuration
public class FileWatcherConfig {
    @Bean
    public FileSystemWatcher fileSystemWatcher() {
        FileSystemWatcher fileSystemWatcher = new FileSystemWatcher(true, Duration.ofMillis(5000L),
            Duration.ofMillis(3000L));
        fileSystemWatcher.addSourceDirectory(new File("/path/to/folder"));
        fileSystemWatcher.addListener(new MyFileChangeListener());
        fileSystemWatcher.start();
        System.out.println("started fileSystemWatcher");
        return fileSystemWatcher;
    }

    @PreDestroy
    public void onDestroy() throws Exception {
        fileSystemWatcher().stop();
    }
}
