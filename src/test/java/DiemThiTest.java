import org.junit.Assert;
import org.junit.Test;

public class DiemThiTest {
    /*
    Input: diemToan, diemVan, diemAnh

    Phương pháp 1: Kiểm thử theo phân tích giá trị biên
                min(diemToan) <= diemToan <= max(diemToan)
                min(diemVan) <= diemVan <= max(diemVan)
                min(diemAnh) <= diemAnh <= max(diemAnh)
        diemToan: min(diemToan), min(diemToan)+, nom(diemToan), max(diemToan)-, max(diemToan)
        diemVan: min(diemVan), min(diemVan)+, nom(diemVan), max(diemVan)-, max(diemVan)
        diemAnh: min(diemAnh), min(diemAnh)+, nom(diemAnh), max(diemAnh)-, max(diemAnh)
        Vì các điểm có miền giá trị tương tự nhau nên ta chọn các giá trị như sau:
            min = 0, min+ = 0.1, max- = 9.9, max = 10
        Với điểm chuẩn là 36.9 thì mỗi điểm ít nhất phải >= 6.9 thì mới có thể đỗ,
        nên ta chọn giá trị nom như sau:
            nom = 6.9
        Các testcase từ testcase1 đến testcase125

    Phương pháp 2: Kiểm thử theo phân hoạch tương đương
        Phân vùng 1: Nhập giá trị hợp lệ (0 <= diemToan, diemVan, diemAnh <= 10)
        Phân vùng 2: Nhập giá trị không hợp lệ (diemToan, diemVan, diemAnh < 0)
        Phân vùng 3: Nhập giá trị không hợp lệ (diemToan, diemVan, diemAnh > 10)
        => Chọn các giá trị của điểm theo từng vùng
        Case 1: diemToan = 5 || diemVan = 5 || diemAnh = 5
        Case 2: diemToan = -1 || diemVan = -1 || diemAnh = -1
        Case 3: diemToan = 11 || diemVan = 11 || diemAnh = 11

        Các testcase từ testcase126 đến testcase 152
     */

    @Test
    public void testcase1() {
        DiemThi diemThi = new DiemThi(0, 0, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase2() {
        DiemThi diemThi = new DiemThi(0, 0, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase3() {
        DiemThi diemThi = new DiemThi(0, 0, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase4() {
        DiemThi diemThi = new DiemThi(0, 0, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase5() {
        DiemThi diemThi = new DiemThi(0, 0, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase6() {
        DiemThi diemThi = new DiemThi(0, 0.1, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase7() {
        DiemThi diemThi = new DiemThi(0, 0.1, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase8() {
        DiemThi diemThi = new DiemThi(0, 0.1, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase9() {
        DiemThi diemThi = new DiemThi(0, 0.1, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase10() {
        DiemThi diemThi = new DiemThi(0, 0.1, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase11() {
        DiemThi diemThi = new DiemThi(0, 6.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase12() {
        DiemThi diemThi = new DiemThi(0, 6.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase13() {
        DiemThi diemThi = new DiemThi(0, 6.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase14() {
        DiemThi diemThi = new DiemThi(0, 6.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase15() {
        DiemThi diemThi = new DiemThi(0, 6.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase16() {
        DiemThi diemThi = new DiemThi(0, 9.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase17() {
        DiemThi diemThi = new DiemThi(0, 9.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase18() {
        DiemThi diemThi = new DiemThi(0, 9.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase19() {
        DiemThi diemThi = new DiemThi(0, 9.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase20() {
        DiemThi diemThi = new DiemThi(0, 9.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase21() {
        DiemThi diemThi = new DiemThi(0, 10, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase22() {
        DiemThi diemThi = new DiemThi(0, 10, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase23() {
        DiemThi diemThi = new DiemThi(0, 10, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase24() {
        DiemThi diemThi = new DiemThi(0, 10, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase25() {
        DiemThi diemThi = new DiemThi(0, 10, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase26() {
        DiemThi diemThi = new DiemThi(0.1, 0, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase27() {
        DiemThi diemThi = new DiemThi(0.1, 0, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase28() {
        DiemThi diemThi = new DiemThi(0.1, 0, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase29() {
        DiemThi diemThi = new DiemThi(0.1, 0, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase30() {
        DiemThi diemThi = new DiemThi(0.1, 0, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase31() {
        DiemThi diemThi = new DiemThi(0.1, 0.1, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase32() {
        DiemThi diemThi = new DiemThi(0.1, 0.1, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase33() {
        DiemThi diemThi = new DiemThi(0.1, 0.1, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase34() {
        DiemThi diemThi = new DiemThi(0.1, 0.1, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase35() {
        DiemThi diemThi = new DiemThi(0.1, 0.1, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase36() {
        DiemThi diemThi = new DiemThi(0.1, 6.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase37() {
        DiemThi diemThi = new DiemThi(0.1, 6.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase38() {
        DiemThi diemThi = new DiemThi(0.1, 6.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase39() {
        DiemThi diemThi = new DiemThi(0.1, 6.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase40() {
        DiemThi diemThi = new DiemThi(0.1, 6.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase41() {
        DiemThi diemThi = new DiemThi(0.1, 9.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase42() {
        DiemThi diemThi = new DiemThi(0.1, 9.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase43() {
        DiemThi diemThi = new DiemThi(0.1, 9.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase44() {
        DiemThi diemThi = new DiemThi(0.1, 9.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase45() {
        DiemThi diemThi = new DiemThi(0.1, 9.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase46() {
        DiemThi diemThi = new DiemThi(0.1, 10, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase47() {
        DiemThi diemThi = new DiemThi(0.1, 10, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase48() {
        DiemThi diemThi = new DiemThi(0.1, 10, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase49() {
        DiemThi diemThi = new DiemThi(0.1, 10, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase50() {
        DiemThi diemThi = new DiemThi(0.1, 10, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase51() {
        DiemThi diemThi = new DiemThi(6.9, 0, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase52() {
        DiemThi diemThi = new DiemThi(6.9, 0, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase53() {
        DiemThi diemThi = new DiemThi(6.9, 0, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase54() {
        DiemThi diemThi = new DiemThi(6.9, 0, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase55() {
        DiemThi diemThi = new DiemThi(6.9, 0, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase56() {
        DiemThi diemThi = new DiemThi(6.9, 0.1, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase57() {
        DiemThi diemThi = new DiemThi(6.9, 0.1, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase58() {
        DiemThi diemThi = new DiemThi(6.9, 0.1, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase59() {
        DiemThi diemThi = new DiemThi(6.9, 0.1, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase60() {
        DiemThi diemThi = new DiemThi(6.9, 0.1, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase61() {
        DiemThi diemThi = new DiemThi(6.9, 6.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase62() {
        DiemThi diemThi = new DiemThi(6.9, 6.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase63() {
        DiemThi diemThi = new DiemThi(6.9, 6.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase64() {
        DiemThi diemThi = new DiemThi(6.9, 6.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase65() {
        DiemThi diemThi = new DiemThi(6.9, 6.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase66() {
        DiemThi diemThi = new DiemThi(6.9, 9.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase67() {
        DiemThi diemThi = new DiemThi(6.9, 9.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase68() {
        DiemThi diemThi = new DiemThi(6.9, 9.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase69() {
        DiemThi diemThi = new DiemThi(6.9, 9.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase70() {
        DiemThi diemThi = new DiemThi(6.9, 9.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase71() {
        DiemThi diemThi = new DiemThi(6.9, 10, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase72() {
        DiemThi diemThi = new DiemThi(6.9, 10, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase73() {
        DiemThi diemThi = new DiemThi(6.9, 10, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase74() {
        DiemThi diemThi = new DiemThi(6.9, 10, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase75() {
        DiemThi diemThi = new DiemThi(6.9, 10, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase76() {
        DiemThi diemThi = new DiemThi(9.9, 0, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase77() {
        DiemThi diemThi = new DiemThi(9.9, 0, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase78() {
        DiemThi diemThi = new DiemThi(9.9, 0, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase79() {
        DiemThi diemThi = new DiemThi(9.9, 0, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase80() {
        DiemThi diemThi = new DiemThi(9.9, 0, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase81() {
        DiemThi diemThi = new DiemThi(9.9, 0.1, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase82() {
        DiemThi diemThi = new DiemThi(9.9, 0.1, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase83() {
        DiemThi diemThi = new DiemThi(9.9, 0.1, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase84() {
        DiemThi diemThi = new DiemThi(9.9, 0.1, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase85() {
        DiemThi diemThi = new DiemThi(9.9, 0.1, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase86() {
        DiemThi diemThi = new DiemThi(9.9, 6.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase87() {
        DiemThi diemThi = new DiemThi(9.9, 6.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase88() {
        DiemThi diemThi = new DiemThi(9.9, 6.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase89() {
        DiemThi diemThi = new DiemThi(9.9, 6.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase90() {
        DiemThi diemThi = new DiemThi(9.9, 6.9, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase91() {
        DiemThi diemThi = new DiemThi(9.9, 9.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase92() {
        DiemThi diemThi = new DiemThi(9.9, 9.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase93() {
        DiemThi diemThi = new DiemThi(9.9, 9.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase94() {
        DiemThi diemThi = new DiemThi(9.9, 9.9, 9.9);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase95() {
        DiemThi diemThi = new DiemThi(9.9, 9.9, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase96() {
        DiemThi diemThi = new DiemThi(9.9, 10, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase97() {
        DiemThi diemThi = new DiemThi(9.9, 10, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase98() {
        DiemThi diemThi = new DiemThi(9.9, 10, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase99() {
        DiemThi diemThi = new DiemThi(9.9, 10, 9.9);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase100() {
        DiemThi diemThi = new DiemThi(9.9, 10, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase101() {
        DiemThi diemThi = new DiemThi(10, 0, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase102() {
        DiemThi diemThi = new DiemThi(10, 0, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase103() {
        DiemThi diemThi = new DiemThi(10, 0, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase104() {
        DiemThi diemThi = new DiemThi(10, 0, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase105() {
        DiemThi diemThi = new DiemThi(10, 0, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase106() {
        DiemThi diemThi = new DiemThi(10, 0.1, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase107() {
        DiemThi diemThi = new DiemThi(10, 0.1, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase108() {
        DiemThi diemThi = new DiemThi(10, 0.1, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase109() {
        DiemThi diemThi = new DiemThi(10, 0.1, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase110() {
        DiemThi diemThi = new DiemThi(10, 0.1, 10);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase111() {
        DiemThi diemThi = new DiemThi(10, 6.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase112() {
        DiemThi diemThi = new DiemThi(10, 6.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase113() {
        DiemThi diemThi = new DiemThi(10, 6.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase114() {
        DiemThi diemThi = new DiemThi(10, 6.9, 9.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase115() {
        DiemThi diemThi = new DiemThi(10, 6.9, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase116() {
        DiemThi diemThi = new DiemThi(10, 9.9, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase117() {
        DiemThi diemThi = new DiemThi(10, 9.9, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase118() {
        DiemThi diemThi = new DiemThi(10, 9.9, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase119() {
        DiemThi diemThi = new DiemThi(10, 9.9, 9.9);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase120() {
        DiemThi diemThi = new DiemThi(10, 9.9, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase121() {
        DiemThi diemThi = new DiemThi(10, 10, 0);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase122() {
        DiemThi diemThi = new DiemThi(10, 10, 0.1);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase123() {
        DiemThi diemThi = new DiemThi(10, 10, 6.9);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase124() {
        DiemThi diemThi = new DiemThi(10, 10, 9.9);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase125() {
        DiemThi diemThi = new DiemThi(10, 10, 10);
        String expected = "Đỗ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase126() {
        DiemThi diemThi = new DiemThi(5, 5, 5);
        String expected = "Trượt";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase127() {
        DiemThi diemThi = new DiemThi(5, 5, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase128() {
        DiemThi diemThi = new DiemThi(5, 5, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase129() {
        DiemThi diemThi = new DiemThi(5, -1, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase130() {
        DiemThi diemThi = new DiemThi(5, -1, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase131() {
        DiemThi diemThi = new DiemThi(5, -1, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase132() {
        DiemThi diemThi = new DiemThi(5, 11, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase133() {
        DiemThi diemThi = new DiemThi(5, 11, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase134() {
        DiemThi diemThi = new DiemThi(5, 11, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase135() {
        DiemThi diemThi = new DiemThi(-1, 5, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase136() {
        DiemThi diemThi = new DiemThi(-1, 5, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase137() {
        DiemThi diemThi = new DiemThi(-1, 5, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase138() {
        DiemThi diemThi = new DiemThi(-1, -1, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase139() {
        DiemThi diemThi = new DiemThi(-1, -1, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase140() {
        DiemThi diemThi = new DiemThi(-1, -1, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase141() {
        DiemThi diemThi = new DiemThi(-1, 11, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase142() {
        DiemThi diemThi = new DiemThi(-1, 11, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase143() {
        DiemThi diemThi = new DiemThi(-1, 11, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase144() {
        DiemThi diemThi = new DiemThi(11, 5, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase145() {
        DiemThi diemThi = new DiemThi(11, 5, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase146() {
        DiemThi diemThi = new DiemThi(11, 5, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase147() {
        DiemThi diemThi = new DiemThi(11, -1, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase148() {
        DiemThi diemThi = new DiemThi(11, -1, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase149() {
        DiemThi diemThi = new DiemThi(11, -1, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase150() {
        DiemThi diemThi = new DiemThi(11, 11, 5);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase151() {
        DiemThi diemThi = new DiemThi(11, 11, -1);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase152() {
        DiemThi diemThi = new DiemThi(11, 11, 11);
        String expected = "Nhập giá trị không hợp lệ";
        String actual = diemThi.ketQua();
        Assert.assertEquals(expected, actual);
    }
}
