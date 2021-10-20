import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * Project name(项目名称)：Collections类操作集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): Copy_Collections
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/20
 * Time(创建时间)： 11:46
 * Version(版本): 1.0
 * Description(描述)： Collections 类的 copy() 静态方法用于将指定集合中的所有元素复制到另一个集合中。
 * 执行 copy() 方法后，目标集合中每个已复制元素的索引将等同于源集合中该元素的索引。
 * copy() 方法的语法格式如下：
 * void copy(List < super T> dest,List< extends T> src)
 * 其中，dest 表示目标集合对象，src 表示源集合对象。
 * 注意：目标集合的长度至少和源集合的长度相同，如果目标集合的长度更长，则不影响目标集合中的其余元素。
 * 如果目标集合长度不够而无法包含整个源集合元素，程序将抛出 IndexOutOfBoundsException 异常。
 */

public class Copy_Collections
{
    public static void main(String... args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        LinkedList<Double> p = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        //System.out.println("请输入10个数：");
        DecimalFormat df = new DecimalFormat("##.#");
        Random r1 = new Random();
        for (int i = 0; i < 15; i++)
        {
            p.addLast(Double.valueOf(df.format(r1.nextDouble() * 100)));
        }
        System.out.println("数量：" + p.size());
        System.out.println("输出：");
        for (Double d : p)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        LinkedList<Double> p1 = new LinkedList<Double>();
        for (int i = 0; i < 20; i++)
        {
            p1.add(0.0);
        }
        System.out.println("新集合大小：" + p1.size());
        System.out.println("输出新集合：");
        for (Double d : p1)
        {
            System.out.print(d + " ");
        }
        System.out.println();
        System.out.println("复制到新集合：");
        Collections.copy(p1, p);
        System.out.println("输出新集合：");
        for (Double d : p1)
        {
            System.out.print(d + " ");
        }
        System.out.println();
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
