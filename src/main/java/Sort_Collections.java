import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Project name(项目名称)：Collections类操作集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): Sort_Collections
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/20
 * Time(创建时间)： 10:21
 * Version(版本): 1.0
 * Description(描述)： 排序（正向和逆向）
 * Collections 提供了如下方法用于对 List 集合元素进行排序。
 * void reverse(List list)：对指定 List 集合元素进行逆向排序。
 * void shuffle(List list)：对 List 集合元素进行随机排序（shuffle 方法模拟了“洗牌”动作）。
 * void sort(List list)：根据元素的自然顺序对指定 List 集合的元素按升序进行排序。
 * void sort(List list, Comparator c)：根据指定 Comparator 产生的顺序对 List 集合元素进行排序。
 * void swap(List list, int i, int j)：将指定 List 集合中的 i 处元素和 j 处元素进行交换。
 * void rotate(List list, int distance)：当 distance 为正数时，将 list 集合的后 distance 个元素“整体”移到前面；
 * 当 distance 为负数时，将 list 集合的前 distance 个元素“整体”移到后面。该方法不会改变集合的长度。
 */

public class Sort_Collections
{
    public static void test()
    {
        LinkedList<Double> p = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        //System.out.println("请输入10个数：");
        DecimalFormat df = new DecimalFormat("##.#");
        Random r = new Random();
        for (int i = 0; i < 15; i++)
        {
            p.addLast(Double.valueOf(df.format(r.nextDouble() * 100)));
        }
        System.out.println("数量：" + p.size());
        System.out.println("输出：");
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("反转：");
        Collections.reverse(p);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("升序排序：");
        Collections.sort(p);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("降序：");
        Collections.reverse(p);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("随机：");
        Collections.shuffle(p);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("第二个元素和第三个元素交换：");
        Collections.swap(p, 1, 2);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("后3个元素移到最前面：");
        Collections.rotate(p, 3);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("前4个元素移到最后面：");
        Collections.rotate(p, -4);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("升序排序：");
        Collections.sort(p);
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    public static void main(String... args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        test();
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
