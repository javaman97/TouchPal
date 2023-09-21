package com.cootek.common.utils;

import android.os.Environment;
import java.io.File;
import java.io.FilenameFilter;

public class ExternalStorage {
    private static final String DIR_TEMP = ".temp";
    private static final String TOUCHPAL_DIR = "TouchPalProduct";
    public static boolean isBusy = false;

    public static File getDirectory(String str) {
        if (!Environment.getExternalStorageState().equals("mounted") || isBusy) {
            return null;
        }
        File file = new File(Environment.getExternalStorageDirectory(), TOUCHPAL_DIR);
        if (!file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            file2.delete();
        }
        if (file2.exists()) {
            return file2;
        }
        file2.mkdir();
        return file2;
    }

    public static File getSdcardRoot() {
        return Environment.getExternalStorageDirectory();
    }

    public static File getTempFile(String str) {
        File directory = getDirectory(".temp");
        if (directory == null) {
            return null;
        }
        trimTempFolder();
        if (str == null) {
            str = "";
        }
        return new File(directory, System.currentTimeMillis() + str);
    }

    private static void trimTempFolder() {
        File directory = getDirectory(".temp");
        if (directory != null) {
            final long currentTimeMillis = System.currentTimeMillis();
            File[] listFiles = directory.listFiles(new FilenameFilter() {
                public boolean accept(File file, String str) {
                    long j;
                    try {
                        j = Long.parseLong(str.split("\\.")[0]);
                    } catch (NumberFormatException e) {
                        j = 0;
                    }
                    long j2 = currentTimeMillis - j;
                    if (j2 < 0 || j2 > 86400000) {
                        return true;
                    }
                    return false;
                }
            });
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
                File[] fileArr = null;
            }
        }
    }
}
