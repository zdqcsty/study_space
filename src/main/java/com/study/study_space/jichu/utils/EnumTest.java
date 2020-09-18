package com.study.study_space.jichu.utils;

/**
 * 也可以充分利用枚举默认构造方法私有化的性质来**实现单例**。由于里面的成员变量都是final修饰的，因此不会有线程不安全的问题。
 * 参考资料:https://zhuanlan.zhihu.com/p/63859957
 */

public class EnumTest {
    enum Week {
        //本文的枚举类变量，枚举类实例，name属性指的就是MONDAY
        //这类的变量
        MONDAY(0, "星期一"),
        TUESDAY(1, "星期二"),
        WEDNESDAY(2, "星期三"),
        THURSDAY(3, "星期四"),
        FRIDAY(4, "星期五"),
        SATURDAY(5, "星期六"),
        //最后一个类型必须要用分号结束
        SUNDAY(6, "星期日");

        private int num;
        private String desc;

        /**
         * 构造方法必然是private修饰的
         * 就算不写，也是默认的
         *
         * @param num
         * @param desc
         */
        private Week(int num, String desc) {
            this.num = num;
            this.desc = desc;
        }

        public String getDesc() {
            return desc;
        }

        public int getNum() {
            return num;
        }
    }

    public static void main(String[] args) {
        //通过values()获取枚举数组
        Week[] weeks = Week.values();
        //遍历Week枚举类
        for (Week day : weeks) {
            System.out.println("name:" + day.name() +
                    ",desc:" + day.getDesc());
        }
        //不符合则抛出java.lang.IllegalArgumentException
        System.out.println(Week.valueOf("MONDAY"));
        //返回对应的name属性
        System.out.println(Week.FRIDAY.toString());
        //返回4，根据我们定义的次序，从0开始。如果在定义时调换FRIDAY
        //的次序，返回的数字也会对应的变化
        System.out.println(Week.FRIDAY.ordinal());
    }
}
