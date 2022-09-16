package com.Marine;

import com.Marine.util.FileUtil;
import com.Marine.util.TokenizerUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;


public class Test1 {
    //相同性测试
    @Test
    public void testSame(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    //原先文本和增加文本的对比
    @Test
    public void testAdd(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_add.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    //原先文本和删除部分文字的文本对比
    @Test
    public void testDelete(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_del.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    @Test
    public void testDis(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_dis_1.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    @Test
    public void testDis10(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    @Test
    public void testDis15(){
        String path = "D:\\软工第二次作业\\testData\\orig.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_dis_15.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    //空白文件路径
    @Test
    public void testNullFilePath(){
        String path = "";
        String path2 = "";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }

    @Test
    public void testCommon(){
        String path = "D:\\软工第二次作业\\testData\\orig_0.8_dis_15.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
    @Test
    public void testCommon2(){
        String path = "D:\\软工第二次作业\\testData\\orig_0.8_dis_5.txt";
        String path2 = "D:\\软工第二次作业\\testData\\orig_0.8_dis_10.txt";
        Map<String, List<Integer>> stringListMap1 = TokenizerUtil.CountWord ( path );
        Map<String, List<Integer>> stringListMap2 = TokenizerUtil.CountWord ( path2 );
        Double similarity = TokenizerUtil.CosCount ( stringListMap1,stringListMap2 );
        FileUtil.writeFile ( "D:\\软工第二次作业\\testData\\res.txt",String.valueOf ( similarity ) );
        System.out.println (similarity );
    }
}
