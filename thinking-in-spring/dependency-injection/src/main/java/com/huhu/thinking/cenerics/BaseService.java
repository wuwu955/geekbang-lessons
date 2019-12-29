package com.huhu.thinking.cenerics;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * @author zhou.wu
 * @version v1.0
 * @package com.huhu.thinking
 * @description: 公共服务类 泛型限定式依赖注入
 * @date 2019/12/29 5:08 PM
 */
public abstract class BaseService<M, ID extends Serializable> {

    @Autowired
    private BaseRepository<M, Long> repository;


    public void save(M m) {
        repository.save(m);
    }

}


