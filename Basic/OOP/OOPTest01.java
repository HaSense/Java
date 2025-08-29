

class Car
{
    //1.멤버 변수
    String brand;
    int speed;
    String color;
    //2.생성자
    Car()   //defalt 생성자
    {
    }
    //인자, 매개변수, 파라미터 등이 있는 생성자
    Car(String brand, int speed, String color)
    {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
    }
    //3.멤버 메소드
    public void Run() {
        System.out.println("차가 달린다!!!");
    }
}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class OOPTest01 {
    public static void main(String[] args) {
        Car myCar1 = new Car(); //디폴트 생성자로 객체 생성
        System.out.println(myCar1.speed); // 0
        Car myCar2 = new Car("현대", 240, "하얀색");
        System.out.println(myCar2.speed); // 240
    }
}
