package gold.bean;

import java.util.function.Predicate;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 * author: xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 2017/12/13 20:14
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public interface CourseFilter extends Predicate<String> {

    public default boolean test(String str){
        return str.equals("Java");
    }

}
