package day15.java;

/**
 * <pre>
 * abstract关键字的使用
 * 1.abstract:抽象的
 * 2.abstract可以用来修饰的结构：类、方法
 * 3. abstract修饰类：抽象类
 *     此类不能实例化, 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 *     开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 4. abstract修饰方法：抽象方法
 *    抽象方法只有方法的声明，没有方法体
 *    包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
 *       若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 *       若子类没有重写父类中的所有的抽象方法，则此子类也是一个抽象类，需要使用abstract修饰
 * @author capensis
 */
public class AbstractTest {
    public static void main(String[] args) {
        /*
            一旦Person类抽象了，就不可实例化
            AbstractPerson p1 = new AbstractPerson();
            p1.eat();
        */
    }
}

abstract class AbstractCreature {
    /**
     * 抽象方法
     */
    public abstract void breath();
}

abstract class AbstractPerson extends AbstractCreature {
    String name;
    int age;

    public AbstractPerson() {}

    public AbstractPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 抽象方法
     */
    public abstract void eat();

    //public void eat(){} 不能再定义与抽象方法同名的方法

    public void walk() {
        System.out.println("人走路");
    }
}


class Student extends AbstractPerson {

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {}

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }

    @Override
    public void breath() {
        System.out.println("学生应该呼吸新鲜的没有雾霾的空气");
    }
}