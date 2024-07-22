package data;

/**
 *
 * @author quang
 */
public class HangHoa {

    private String mahang;
    private String tenhang;
    private String mausac;
    private int soLuong;
    private final String nxb = "Kim Dong";

    public HangHoa(String mahang, String tenhang, String mausac, int soLuong) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.mausac = mausac;
        this.soLuong = soLuong;
    }

    public String getMahang() {
        return mahang;
    }

    public void setMahang(String mahang) {
        if (!mahang.isEmpty()) {
            this.mahang = mahang;

        } else {
            System.out.println("mã hàng rỗng.");
        }

    }

    public String kiemtraSoLuong() {
        if (soLuong == 0) {
            return "Hết hàng";
        } else if (soLuong < 0) {
            return "Hàng khan hiếm";
        } else if (soLuong > 100) {
            return "Hàng tích trữ quá số lượng";
        } else {
            return "còn hàng";
        }
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
        this.tenhang = tenhang;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public static void inTieuDe() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-30s|\n", "MÃ HÀNG", "TÊN HÀNG", "MÀU SẮC", "SỐ LƯỢNG", "NXB", "TÌNH TRẠNG HÀNG");

    }

    public void inDuLieu() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10d|%-10s|%-30s|\n", mahang, tenhang, mausac, soLuong, nxb, kiemtraSoLuong());

    }

}
