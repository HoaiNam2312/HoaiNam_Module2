package ss8_clean_code_refactoring.thuc_hanh.doi_ten_bien_tach_hang;

public class Calculator {
    public static int calculate(int firstOperand, int secondOperand, char operator) { // Muốn sửa tên ta bấm shift + F6
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
    
}
