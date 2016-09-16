package com.nd.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;

import java.io.IOException;

/**
 * Created by Administrator on 2016/8/7.
 */
public class LuceneIndexWriterUtils {
    private static IndexWriter indexWriter = null;
    public static IndexWriter getIndexWriter(String path){
        if (null == indexWriter) {
            Analyzer analyzer = new StandardAnalyzer();
            IndexWriterConfig indexWriterConfig = new IndexWriterConfig(analyzer);
            Directory directory = LuceneDirectoryUtils.getDirectionByPath(path);
            IndexWriter indexWriter = null;
            try {
                indexWriter = new IndexWriter(directory, indexWriterConfig);
            } catch (IOException e) {
                throw new RuntimeException("创建indexWriter失败！");
            }
        }
        return indexWriter;
    }
}
