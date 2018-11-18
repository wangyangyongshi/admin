import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author 王二小
 * @date 2018/11/18 23:30
 */
//实现接口限流
public class CurrentLimiting {

    // 计数
    public static AtomicLong atomicLong = new AtomicLong(0L);
    // 最大请求数量
    static int limit = 10;
    // 请求数量
    static int reqAmonut = 15;

    public static void main(String[] args) throws InterruptedException {
        // 多线程并发模拟
        final CountDownLatch latch = new CountDownLatch(1);
        for (int i = 1; i <= reqAmonut; i++) {
            final int t = i;
            new Thread(new Runnable() {

                public void run() {
                    try {
                        //调用thread.join() 方法必须等thread 执行完毕，当前线程才能继续往下执行
                        //而CountDownLatch通过计数器提供了更灵活的控制，只要检测到计数器为0当前线程就
                        // 可以往下执行而不用管相应的thread是否执行完毕
                        latch.await();
                        // 计数器加1，并判断最大请求数量
                        System.out.println(atomicLong.getAndIncrement());
                        if (atomicLong.getAndIncrement() > limit) {
                            System.out.println(t + "线程：限流了");
                            return;
                        }
                        System.out.println(t + "线程：业务处理");
                        // 休眠1秒钟，模拟业务处理
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        // 计数器减1
                        atomicLong.decrementAndGet();
                    }
                }
            }).start();
        }
        latch.countDown();
    }
}
