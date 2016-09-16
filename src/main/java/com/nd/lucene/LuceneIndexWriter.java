package com.nd.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;

/**
 * Created by Administrator on 2016/7/31.
 */
public class LuceneIndexWriter {
//    private static IndexWriter indexWriter = LuceneIndexWriterUtils.getIndexWriter("./lucene");

//    public void addDoc(Document document) {
//        try {
//            indexWriter.addDocument(document);
//        } catch (IOException e) {
//            throw new RuntimeException("添加索引失败！");
//        }
//    }
    public static void main(String[] args) {
        Analyzer analyzer = new StandardAnalyzer();
//        try {
//            DirectoryReader.open(FSDirectory.open(Paths.get("/lucene")));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Directory directory = LuceneDirectoryUtils.getDirectionByPath("F:/lucene");
//        IndexWriter indexWriter = null;
//        try {
//            indexWriter = new IndexWriter(directory, indexWriterConfig);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Document document = new Document();
//        FieldType fieldType = new FieldType();
//        fieldType.setStored(true);
//        Field field = new Field("title", "标题测试test", fieldType);
//        Field field1 = new StringField("content", "我是测试内容", Field.Store.YES);
//        Field f = new LongPoint("age", 12);
//        document.add(field);
//        document.add(field1);
//        document.add(f);
//        try {
//            indexWriter.addDocument(document);
//            indexWriter.commit();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            IndexReader reader = StandardDirectoryReader.open(LuceneDirectoryUtils.getDirectionByPath("./lucene"));
//            IndexSearcher searcher = new IndexSearcher(reader);
//            Query query = new TermQuery(new Term("title", "标题"));
//            TopDocs docs = searcher.search(query, 5);
//            ScoreDoc[] scoreDocs =  docs.scoreDocs;
//            for (ScoreDoc scoreDoc : scoreDocs) {
//                Document doc = searcher.doc(scoreDoc.doc);
//                System.out.print(doc.get("title") + "," + doc.get("content") + "," + doc.get("age"));
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


}
