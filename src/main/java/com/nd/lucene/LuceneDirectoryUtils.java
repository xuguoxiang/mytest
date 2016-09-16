package com.nd.lucene;

import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/8/7.
 */
public class LuceneDirectoryUtils {
    private static Map<String, Directory> path2DirectoryMap = null;

    public static Directory getDirectionByPath(String path) {
        if (null == path2DirectoryMap) {
            path2DirectoryMap = new HashMap<>();
        }
        Directory directory = path2DirectoryMap.get(path);
        if (null == directory) {
            try {
                directory = FSDirectory.open(Paths.get(path));
                path2DirectoryMap.put(path, directory);
            } catch (IOException e) {
                throw new RuntimeException("创建目录失败！");
            }
        }
        return directory;
    }


}
