# Lab 04 Assignment

> 学号：71216002
>
> 姓名：金俊河

## 提交要求（以下内容在最终提交的作业中可以删除，仅作参考）

#### Question1

------------------------------------
initialize A1
initialize A2
initialize A3
initialize A4
initialize A5
initialize A6
copy from A6
initialize B1
initialize A8
main begins
initialize A9
initialize A6
copy from A6
initialize B2
initialize A8
main ends
-------------------------------------

#### Question2

对于非静态属性，它的初始化方法有两种：

- 在属性定义处显式初始化（如本例中的 a6）；
- 在构造方法或非静态方法中初始化（如本例中的 a8）；

> 这段代码能够证明“在属性定义处初始化的属性，比在方法中初始化的属性先被初始化”吗？
能够证明“在属性定义处初始化的属性，比在方法中初始化的属性先被初始化”
> 这段代码能够证明“在属性定义处初始化的属性，初始化顺序等同于他们在类定义中出现的顺序”吗？
不能证明“在属性定义处初始化的属性，初始化顺序等同于他们在类定义中出现的顺序”

#### Question3

> 请尝试仿照 Q2 的内容，描述静态属性的初始化方式和实际初始化时的顺序。
静态属性的初始化发生在实例属性的初始化之前，且只发生一次，实例属性在每次创建实例对象会进行初始化。实际初始化时的顺序是先进行类初始化,再进行实例初始化;先父类再子类,多个代码块的执行顺序是:写在前面的代码块先执行。

#### Question4

> 已知 static 属性的初始化、static 块的执行，只在 JVM 进行类加载的时候执行。这段代码能够证明 “在类的实例第一次被构造、或类的静态属性和静态方法第一次被访问时，JVM 会执行类加载”吗？如果不能，请尝试修改代码并证明。
> 不能。

#### Question5

> 其他的外部类可以通过`new Singleton()`来构造一个新的`Singleton`变量吗？
> 不能，如果将类的构造函数设为私有的，外部类就无法调用该构造函数，也就无法生成多个实例。

#### Question6

> 本题给出的 Singleton 类的写法被称为单例模式，是因为这个类最多只可能有 1 个实例同时存在。为什么只可能有 1 个？这个唯一的实例在什么时候被构造？
因为有一个该单例对象的静态成员变量，私有的构造函数，只能被自身实例化；在程序启动或单例模式类被加载的时候，单例模式实例就已经被创建。

#### Question7

> 请写出任意一种外部类调用 Singleton 类的 foo()的方法。

public static class Singleton{
    private static Singleton uniqueInstance ;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            instauniqueInstancence = new Singleton();
        }

        return uniqueInstance;
    }
}