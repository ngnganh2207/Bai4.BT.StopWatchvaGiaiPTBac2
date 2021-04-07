public class StopWatch {
    private double startTime;
    private double endTime;

    StopWatch() {
    }

    public void start() {
        this.startTime = System.currentTimeMillis();//lấy ra thời gian hiện tại của hệ thống theo milis giây
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                System.out.println(i);
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
