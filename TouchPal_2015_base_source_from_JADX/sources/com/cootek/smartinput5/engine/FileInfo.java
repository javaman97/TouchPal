package com.cootek.smartinput5.engine;

import java.io.FileDescriptor;

public class FileInfo {
    public String absPath;
    public FileDescriptor fileDes;
    public long length;

    FileInfo(FileDescriptor fileDescriptor, long j, String str) {
        this.fileDes = fileDescriptor;
        this.length = j;
        this.absPath = str;
    }
}
