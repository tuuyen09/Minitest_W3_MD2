public class ParttimeEmployee extends Employee{
    private float time;

    public ParttimeEmployee() {
    }

    public ParttimeEmployee(float time) {
        this.time = time;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
    @Override
    public double salary(){
        return getTime() * 100000;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                "time=" + time +
                '}';
    }
}
