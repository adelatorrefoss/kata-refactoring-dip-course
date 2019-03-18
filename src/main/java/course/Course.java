package course;

public class Course {

    private static int SECONDS_PER_HOUR = 3600;

    public String name;
    public int durationSeconds;
    public String college;

    private long startTime;

    public Course(String name) {
        this.name = name;
        college = System.getenv("ENV_COLLEGE");
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        durationSeconds = Long.valueOf(System.currentTimeMillis() - startTime).intValue() / 1000;
    }

    public boolean isShort() {
        return durationSeconds < 2 * SECONDS_PER_HOUR;
    }


    public boolean isLong() {
        return !isShort();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    private void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public String getCollege() {
        return college;
    }

    private void setCollege(String college) {
        this.college = college;
    }
}
