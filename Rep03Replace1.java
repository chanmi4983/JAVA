import javax.swing.JOptionPane;

public class Rep03Replace1 {
    public static void main(String[] args) {
        // JOptionPane을 사용하여 입력 받기 [cite: 25]
        String gender = JOptionPane.showInputDialog("성별을 입력하세요 (남자는 M, m, 여자는 W, w):");
        String weightStr = JOptionPane.showInputDialog("몸무게를 입력하세요:");
        String heightStr = JOptionPane.showInputDialog("키를 입력하세요:");
        String ageStr = JOptionPane.showInputDialog("나이를 입력하세요:");

        // 입력받은 정보 출력 
        String message = "성별: " + gender + "\n" +
                         "몸무게: " + weightStr + "\n" +
                         "키: " + heightStr + "\n" +
                         "나이: " + ageStr;
        
        JOptionPane.showMessageDialog(null, message);
    }
}