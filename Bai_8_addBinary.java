public class Bai_8_addBinary {

    public String addBinary(String a, String b) {
            StringBuilder result = new StringBuilder();
            int carry = 0; // Biến nhớ

            int i = a.length() - 1;
            int j = b.length() - 1;

            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;

                if (i >= 0) {
                    sum += a.charAt(i) - '0';
                    i--;
                }

                if (j >= 0) {
                    sum += b.charAt(j) - '0';
                    j--;
                }

                carry = sum / 2; // Tính phần nhớ
                int bit = sum % 2; // Lấy bit kết quả

                result.insert(0, bit); // Thêm bit vào đầu chuỗi kết quả
            }

            return result.toString();
    }
}
