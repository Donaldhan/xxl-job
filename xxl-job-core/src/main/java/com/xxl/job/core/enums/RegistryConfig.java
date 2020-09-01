package com.xxl.job.core.enums;

/**
 * Created by xuxueli on 17/5/10.
 */
public class RegistryConfig {

    /**
     *
     */
    public static final int BEAT_TIMEOUT = 30;
    /**
     *  节点存活超时时间，上次更新到当前存活时间，没有超时DEAD_TIMEOUT的都算存活节点
     */
    public static final int DEAD_TIMEOUT = BEAT_TIMEOUT * 3;

    public enum RegistType{ EXECUTOR, ADMIN }

}
