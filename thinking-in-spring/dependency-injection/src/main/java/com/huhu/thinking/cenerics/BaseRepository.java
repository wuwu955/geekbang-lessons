package com.huhu.thinking.cenerics;

import java.io.Serializable;

/**
 * @author zhou.wu
 * @version v1.0
 * @package com.huhu.thinking
 * @description: 抽象类 /or 接口都行 接口主要是 mybatis 接口代理子类就可以了
 * @date 2019/12/29 5:05 PM
 */
public abstract class BaseRepository<M, ID extends Serializable> {

    public void save(M m) {
        System.out.println("=====repository save:" + m);
    }


}



