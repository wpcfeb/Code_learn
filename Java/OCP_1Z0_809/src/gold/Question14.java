package gold;

import gold.bean.Bird;
import gold.bean.Penguin;

import java.util.function.Consumer;
import java.util.function.Supplier;

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
 * Date  : 2017/12/18 16:51
 * desc  :
 * Copyright(©) 2017 by xiaomo.
 */
public class Question14 {
    public static void main(String[] args) {
        fly(Bird::new);
        fly(Penguin::new);

    }

    static void fly(Supplier<Bird> birdConsumer) {
        birdConsumer.get().fly();
    }

}
