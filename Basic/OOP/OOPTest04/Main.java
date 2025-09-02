//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Cat mary = new Cat("메리", 2, "하얀색");
        //mary.name = "메리"; //직접접근 (X)
        mary.setName("메리 고양이");
        System.out.println(mary.getName()); //간접접근 (0)

        mary.Meow();
        mary.Eat();

    }
}
