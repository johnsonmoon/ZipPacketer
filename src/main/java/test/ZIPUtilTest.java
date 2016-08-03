package test;

import com.xuyihao.zip.packeter.ZIPUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xuyh at 2016/08/03 下午 01:33.
 */
public class ZIPUtilTest {
    public static void main(String args[]){
        //test1();
        test2();
    }

    public static void test2(){
        System.out.println(ZIPUtil.generateDirectoryFilesToZipPackage("E:\\JUnitTestPath", "C:\\Users\\Administrator\\Desktop\\new.zip"));
    }

    public static void test1(){
        String basePath = "E:\\JUnitTestPath\\";
        String zipName = "newZIP.zip";
        String zipPathName = basePath + zipName;
        List<String> containedFileName = new ArrayList<String>();
        List<String> containedFilePathName = new ArrayList<String>();
        containedFileName.add("CiDatasAll.xlsx");
        containedFileName.add("CiImportTestFile - 非法输入测试.xlsx");
        containedFileName.add("CiImportTestFile.xlsx");
        containedFileName.add("test.xlsx");
        containedFileName.add("u2dy20hqdiugh2igidy9c90d7WarningFile.xlsx");
        containedFileName.add("Y_Application&Y_Business&Y_service&Y_Cluster&Y_Mysql&Y_Nginx&Y_Oracle&Y_Redis&Y_Tomcat&Y_Router&Y_Server&Y_Switch2016-7-2--15-49-12(Template).xlsx");
        containedFileName.add("Y_Application&Y_Business&Y_service&Y_Cluster&Y_Mysql&Y_Nginx&Y_Oracle&Y_Redis&Y_Tomcat&Y_Router&Y_Server&Y_Switch2016-7-2--15-51-48(Data).xlsx");
        containedFileName.add("导入导出CI接口(包含导出错误信息文件).xlsx");
        for(String name : containedFileName){
            containedFilePathName.add(basePath + name);
        }
        System.out.println(ZIPUtil.generateZipPackage(zipPathName, containedFilePathName, containedFileName));
    }
}
