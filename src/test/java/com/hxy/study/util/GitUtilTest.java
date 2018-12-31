package com.hxy.study.util;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class GitUtilTest {
    private String filePath = "E:\\tmp\\git\\test";

    @Test
    public void test() {
        try {
            Repository repositoryByPath = GitUtil.getRepositoryByPath(filePath);
            Git git = new Git(repositoryByPath);
            List<Ref> call = git.branchList().call();
            System.out.println(call);
        } catch (IOException | GitAPIException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void shellTest() {
        try {
            String cmd = "cmd /c \"C: && cd Program Files && dir\"";
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec(cmd);
            InputStream is = process.getInputStream();
            InputStreamReader isr = new InputStreamReader(is, "gbk"); //gbk：解决输出乱码
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                Thread.sleep(100);
            }
            is.close();
            isr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
