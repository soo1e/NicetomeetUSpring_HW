package Day1;

public class FootballPlayer_before {
    public static void main(String[] args) {
        String[] names = {"손흥민", "이강인"};
        int[] ages = {33, 23};
        String[] positions = {"FW", "MF"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("제 이름은 " + names[i] +"입니다. 나이는 " + ages[i] + "살 입니다. " + "포지션은 " + positions[i] + "입니다.");
        }
    }
}
