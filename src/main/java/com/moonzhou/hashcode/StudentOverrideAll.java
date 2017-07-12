package com.moonzhou.hashcode;

public class StudentOverrideAll {
    private int age;
    private String name;

    public StudentOverrideAll() {
    }

    public StudentOverrideAll(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 这个方法返回对象的散列码，返回值是int类型的散列码。
     * 
     * 对象的散列码是为了更好的支持基于哈希机制的Java集合类，例如 HashTable, HashMap, HashSet 等。
     * 
     * 关于hashCode方法，一致的约定是：
     * 重写了euqls方法的对象必须同时重写hashCode()方法
     * 如果2个对象通过equals调用后返回是true，那么这个2个对象的hashCode方法也必须返回同样的int型散列码
     * 如果2个对象通过equals返回false，他们的hashCode返回的值允许相同。(然而，程序员必须意识到，hashCode返回独一无二的散列码，会让存储这个对象的hashtables更好地工作。)
     * 
     * 
     * 在equals方法中作为评判依据的字段， 在hashCode方法中，这些字段也要参与hash值的运算，作为hash运算的中间参数。这是为了遵守：2个对象equals，那么 hashCode一定相同规则。
     * 
     * 
     * 第一：在某个运行时期间，只要对象的（字段的）变化不会影响equals方法的决策结果，那么，在这个期间，无论调用多少次hashCode，都必须返回同一个散列码。
     * 第二：通过equals调用返回true 的2个对象的hashCode一定一样。
     * 第三：通过equasl返回false 的2个对象的散列码不需要不同，也就是他们的hashCode方法的返回值允许出现相同的情况。
     * 总结一句话：等价的(调用equals返回true)对象必须产生相同的散列码。不等价的对象，不要求产生的散列码不相同。
     * 
     * hashCode编写指导：在编写hashCode时，你需要考虑的是，最终的hash是个int值，而不能溢出。不同的对象的hash码应该尽量不同，避免hash冲突。
     *     1、定义一个int类型的变量 hash,初始化为 **。
     *     2、接下来让你认为重要的字段（equals中衡量相等的字段）参入散列运，算每一个重要字段都会产生一个hash分量，为最终的hash值做出贡献（影响）
     *     3、最后把所有的分量都总和起来，注意并不是简单的相加。选择一个倍乘的数字31，参与计算。然后不断地递归计算，直到所有的字段都参与了
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println("hashCode : " + result);
        return result;
    }

    /**
     * Object类中默认的实现方式是  :   return this == obj  。那就是说，只有this 和 obj引用同一个对象，才会返回true。
     * 
     * 自反性:  x.equals(x) 一定是true
     * 对null:  x.equals(null) 一定是false
     * 对称性:  x.equals(y)  和  y.equals(x)结果一致
     * 传递性:  a 和 b equals , b 和 c  equals，那么 a 和 c也一定equals
     * 一致性:  在某个运行时期间，2个对象的状态的改变不会不影响equals的决策结果，那么，在这个运行时期间，无论调用多少次equals，都返回相同的结果
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StudentOverrideAll other = (StudentOverrideAll) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}
