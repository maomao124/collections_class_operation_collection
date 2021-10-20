import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Project name(项目名称)：Collections类操作集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): find_Collections
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/20
 * Time(创建时间)： 10:52
 * Version(版本): 1.0
 * Description(描述)： 查找、替换操作
 * Collections 还提供了如下常用的用于查找、替换集合元素的方法。
 * int binarySearch(List list, Object key)：使用二分搜索法搜索指定的 List 集合，以获得指定对象在 List 集合中的索引。
 * 如果要使该方法可以正常工作，则必须保证 List 中的元素已经处于有序状态。
 * Object max(Collection coll)：根据元素的自然顺序，返回给定集合中的最大元素。
 * Object max(Collection coll, Comparator comp)：根据 Comparator 指定的顺序，返回给定集合中的最大元素。
 * Object min(Collection coll)：根据元素的自然顺序，返回给定集合中的最小元素。
 * Object min(Collection coll, Comparator comp)：根据 Comparator 指定的顺序，返回给定集合中的最小元素。
 * void fill(List list, Object obj)：使用指定元素 obj 替换指定 List 集合中的所有元素。
 * int frequency(Collection c, Object o)：返回指定集合中指定元素的出现次数。
 * int indexOfSubList(List source, List target)：返回子 List 对象在父 List 对象中第一次出现的位置索引；
 * 如果父 List 中没有出现这样的子 List，则返回 -1。
 * int lastIndexOfSubList(List source, List target)：返回子 List 对象在父 List 对象中最后一次出现的位置索引；
 * 如果父 List 中没有岀现这样的子 List，则返回 -1。
 * boolean replaceAll(List list, Object oldVal, Object newVal)：使用一个新值 newVal 替换 List 对象的所有旧值 oldVal。
 */

public class find_Collections
{
    public static void main(String... args)
    {
        LinkedList<Integer> p = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入7个数据：");
        for (int i = 0; i < 7; i++)
        {
            p.addLast(input.nextInt());
        }
        System.out.println("输出：");
        for (Integer i : p)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("最大值：" + Collections.max(p));
        System.out.println("最小值：" + Collections.min(p));
        System.out.println("升序排序：");
        Collections.sort(p);
        for (Integer i : p)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("二分搜索：");
        System.out.print("关键字：");
        int key = input.nextInt();
        System.out.println("索引为：" + Collections.binarySearch(p, key));
        System.out.println("返回指定集合中指定元素的出现次数:");
        System.out.print("输入关键字：");
        key = input.nextInt();
        System.out.println("出现次数：" + Collections.frequency(p, key));
        System.out.println("使用一个新值 newVal 替换 List 对象的所有旧值 oldVal");
        int newVal;
        int oldVal;
        System.out.print("请输入新值：");
        newVal = input.nextInt();
        System.out.println("请输入旧值：");
        oldVal = input.nextInt();
        System.out.println(Collections.replaceAll(p, oldVal, newVal));
        for (Integer i : p)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("使用指定元素 is 替换指定 List 集合中的所有元素:");
        System.out.print("请输入is的值：");
        int is = input.nextInt();
        Collections.fill(p, is);
        for (Integer i : p)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
