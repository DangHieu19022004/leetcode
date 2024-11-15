import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        // Nếu chỉ có 1 hàng hoặc số hàng lớn hơn chiều dài chuỗi, trả về chuỗi ban đầu
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        // Tạo danh sách để chứa các hàng
        List<List<Character>> listArr = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            listArr.add(new ArrayList<>()); // Thêm một hàng mới
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Điền từng ký tự vào các hàng theo thứ tự zigzag
        for (char c : s.toCharArray()) {
            listArr.get(currentRow).add(c);

            // Đổi chiều khi đến hàng đầu hoặc cuối
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Cập nhật hàng hiện tại
            currentRow += goingDown ? 1 : -1;
        }

        // Ghép tất cả các hàng thành một chuỗi
        StringBuilder result = new StringBuilder();
        for (List<Character> row : listArr) {
            for (char c : row) {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String args[]) {
        ZigzagConversion convert = new ZigzagConversion();
        System.out.println(convert.convert("PAYPALISHIRING", 3)); // Kết quả mong đợi: "PAHNAPLSIIGYIR"
    }
}
