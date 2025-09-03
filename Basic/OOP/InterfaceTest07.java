//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
interface Vehicle {
    void run();
}
class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println("택시가 달립니다.");
    }
}
//운전자 클래스
class Driver{
    public void drive(Vehicle v) {
        v.run();
    }
}
public class Main {
    public static void main(String[] args) {
        Driver tom = new Driver();

        Bus bus1 = new Bus();
        Taxi taxi1 = new Taxi();

        //tom.drive(bus1);
        tom.drive(taxi1);

    }
}












