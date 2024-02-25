package chen.example.exam1.test;

import chen.example.exam1.pojo.Fruit;

import java.util.ArrayList;
import java.util.List;

/**
 * 工银澳门项目笔试题
 */
public class GyamPro {
    /*1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。
    现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？
    请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

    2、超市增加了一种水果芒果，其定价为 20 元/斤。
    现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

    3、超市做促销活动，草莓限时打 8 折。
    现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。

    4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。
    现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？
    请编写函数，对于 D 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。
    */

    /**
     * 顾客购买水果计算总价算法
     * @param list 购买的多种水果
     * @param isOrtherPromotion 是否包含其他促销方案
     * @param minPrice 满足促销方案的最低价格
     * @param promotionPrice 促销方案的优惠价格
     * @return
     */
    public static Double getTotalPrice(List<Fruit> list,boolean isOrtherPromotion,Double minPrice ,Double promotionPrice) {
        Double totalPrice;
        //遍历list中的各类水果，分别计算其总价格后相加
        totalPrice = list.stream().map(f -> {
            if (f != null && f.getWeight() >= 0) {
                f.setTotalPrice(f.getPrice() * f.getWeight() * f.getDiscount());
            }
            return f;
        }).mapToDouble(Fruit::getTotalPrice).sum();
        //购物满 100 减 10 块
        if (isOrtherPromotion) {
            if (totalPrice >= minPrice)
                totalPrice = totalPrice - promotionPrice;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit("苹果", 8.0, 10, 1.0);
        Fruit strawberry = new Fruit("草莓", 13.0, 10, 1.0);

        List<Fruit> arrayList = new ArrayList();
        arrayList.add(apple);
        arrayList.add(strawberry);
//        试题1
        System.out.println("顾客A购买水果总价为：" + getTotalPrice(arrayList,false,null,null));
//        试题2
        Fruit mango = new Fruit("芒果",20.0,10,1.0);
        arrayList.add(mango);
        System.out.println("顾客B购买水果总价为：" + getTotalPrice(arrayList,false,null,null));
//        试题3 草莓8折
        if (arrayList.contains(strawberry)) {
            arrayList.remove(strawberry);
            strawberry.setDiscount(0.8);
            arrayList.add(strawberry);
        }
        System.out.println("顾客c购买水果总价为：" + getTotalPrice(arrayList,false,null,null));
//        试题4
        System.out.println("顾客d购买水果总价为：" + getTotalPrice(arrayList,true,100.0,10.0));
    }
}
