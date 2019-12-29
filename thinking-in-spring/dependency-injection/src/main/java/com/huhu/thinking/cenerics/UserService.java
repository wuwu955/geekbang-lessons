package com.huhu.thinking.cenerics;

import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author zhou.wu
 * @version v1.0
 * @package com.huhu.thinking
 * @description: 泛型限定式依赖注入
 * @date 2019/12/29 5:11 PM
 */
@Service
public class UserService extends BaseService<User, Long> {


    @Override
    public void save(User m) {
        super.save(m);
    }
}
