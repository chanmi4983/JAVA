import javax.swing.JOptionPane;

public class Rep03Replace2 {
    public static void main(String[] args) {
        // 성별, 몸무게, 키, 나이 입력 받기
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w):");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요:"));
        int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요:"));

        // 성별 유효성 검사: M, m, W, w가 아니면 종료
        if (!(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("W"))) {
            JOptionPane.showMessageDialog(null, "성별이 잘못 입력되었습니다.");
            return;
        }

        double bmr = 0;
        // 성별에 따른 공식 적용
        if (gender.equalsIgnoreCase("M")) {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
        } else {
            bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
        }

        // 초콜릿 개수 계산 (200kcal 기준, 정수형 변환)
        int chocolates = (int)(bmr / 200);

        // 결과 출력
        String result = String.format("하루에 필요한 칼로리: %.1f kcal\n하루에 필요한 초콜릿 수: %d개", bmr, chocolates);
        JOptionPane.showMessageDialog(null, result);
    }
}