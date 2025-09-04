class A{
}
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main extends Object{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Java ");
        sb.append("Program Study");
        System.out.println(sb.toString());
//        A a = new A();
//        System.out.println(a.toString());

        sb.insert(4, "2");
        System.out.println(sb);

        sb.setCharAt(4, '6');
        System.out.println(sb);

        sb.replace(6, 13, "Book");
        System.out.println(sb);

        sb.delete(4, 5);
        System.out.println(sb);

        int length = sb.length();
        System.out.println("총 문자수 : " + length);

        String result = sb.toString();
        System.out.println(result);
    }
}






