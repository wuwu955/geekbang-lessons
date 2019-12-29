package com.huhu.thinking.cenerics;

import org.geekbang.thinking.in.spring.ioc.overview.domain.User;
import org.springframework.stereotype.Repository;

/**
 * @author zhou.wu
 * @version v1.0
 * @package com.huhu.thinking
 * @description: 泛型限定式依赖注入 demo
 * @date 2019/12/29 5:54 PM
 */
@Repository
public class UserRepository extends BaseRepository<User, Long> {


}
