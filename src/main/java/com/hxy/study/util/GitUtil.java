package com.hxy.study.util;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

public class GitUtil {
    public static Repository getRepositoryByPath(String filePath) throws IOException {
        FileRepositoryBuilder builder = new FileRepositoryBuilder();
        return builder.readEnvironment().findGitDir(new File(filePath)).build();
    }
}