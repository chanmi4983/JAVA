import javax.swing.JOptionPane;

public class Rep03Replace3 {
    public static void main(String[] args) {
        while (true) {
            // 성별 입력 및 종료 조건 확인
            String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w, 종료는 Q, q):");
            
            // 종료 조건: Q나 q를 입력하거나 Cancel을 눌렀을 때
            if (gender == null || gender.equalsIgnoreCase("Q")) {
                JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
                break;
            }

            // 성별 유효성 검사
            if (!(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("W"))) {
                JOptionPane.showMessageDialog(null, "성별 입력이 잘못되었습니다. M, m 또는 W, w를 입력하세요.");
                continue; 
            }

            // 몸무게 입력 및 양수 체크
            String weightInput = JOptionPane.showInputDialog("몸무게를 입력하세요:");
            double weight = Double.parseDouble(weightInput);
            if (weight <= 0) {
                JOptionPane.showMessageDialog(null, "몸무게는 양수여야 합니다. 다시 입력해주세요.");
                continue;
            }

            // 키 입력 및 양수 체크
            String heightInput = JOptionPane.showInputDialog("키를 입력하세요:");
            double height = Double.parseDouble(heightInput);
            if (height <= 0) {
                JOptionPane.showMessageDialog(null, "키는 양수여야 합니다. 다시 입력해주세요.");
                continue;
            }

            // 나이 입력
            String ageInput = JOptionPane.showInputDialog("나이를 입력하세요:");
            int age = Integer.parseInt(ageInput);

            // 칼로리 계산 (남성: +5, 여성: -161)
            //
            //
            //
            double bmr = 0;
            if (gender.equalsIgnoreCase("M")) {
                bmr = (10 * weight) + (6.25 * height) - (5 * age) + 5;
            } else {
                bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
            }

            // 초콜릿 개수 계산 (정수형)
            int chocolates = (int)(bmr / 200);

            // 최종 결과 메시지 구성 및 출력
            String result = "성별: " + gender + "\n" +
                            "몸무게: " + weight + "\n" +
                            "키: " + height + "\n" +
                            "나이: " + age + "\n\n" +
                            "하루에 필요한 칼로리: " + bmr + " kcal\n" +
                            "하루에 필요한 초콜릿 수: " + chocolates + "개";
            
            JOptionPane.showMessageDialog(null, result);
        }
    }
}