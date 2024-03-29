package com.example.jxxy.lx.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.jxxy.lx.common.MoblieShopApp;

public class SpTools {

    private static final String CONFIG_FILE_NAME = "mobileshop_config_file";

    public static void putBoolean(String key, boolean value) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static boolean getBoolean(String key, boolean defValue) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        return sp.getBoolean(key, defValue);
    }

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void putString(String key, String value) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static String getString(String key, String defValue) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        return sp.getString(key, defValue);
    }

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void putInt(String key, int value) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static int getInt(String key, int defValue) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        return sp.getInt(key, defValue);
    }

    /**
     * @param key   关键字
     * @param value 对应的值
     */
    public static void putLong(String key, long value) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        sp.edit().putLong(key, value).commit();//提交保存键值对

    }

    /**
     * @param key      关键字
     * @param defValue 设置的默认值
     * @return
     */
    public static long getLong(String key, long defValue) {
        SharedPreferences sp = MoblieShopApp.getContext().getSharedPreferences(CONFIG_FILE_NAME, Context.MODE_PRIVATE);
        return sp.getLong(key, defValue);
    }
}
