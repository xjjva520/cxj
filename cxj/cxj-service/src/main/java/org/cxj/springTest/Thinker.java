package org.cxj.springTest;

import org.cxj.dao.pojo.Pojo;

/**
 * 简单的模拟思想拦截。拦截思考者所想
 * aop-模拟实例
 * @author Administrator
 *
 */
public interface Thinker {
   void thinkOfSomething(Pojo thoughts);
}
