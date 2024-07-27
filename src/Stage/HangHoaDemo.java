package Stage;

import data.HangHoa;

import java.util.*;

/**
 *
 * @author quang
 */
public class HangHoaDemo {

    public static void main(String[] args) {
        List<HangHoa> list = fakeData();
        hienthiThongTin(list);
        sapXepTheoMahang(list);
        hienthiThongTin(list);
        checkMaHang(list);
        hienthiThongTin(list);

    }

    public static List<HangHoa> fakeData() {
        HangHoa hh1 = new HangHoa("old2020", "Truyện", "Vàng", 20);
        HangHoa hh2 = new HangHoa("old2020", "Truyện", "Xanh", 150);
        HangHoa hh3 = new HangHoa("newVer2021", "Vở ghi", "Đen", -3);
        HangHoa hh4 = new HangHoa("Old2020", "Truyện", "Hồng", 30);
        HangHoa hh5 = new HangHoa("LA2019", "Tạp chí", "Nâu", 300);

        List<HangHoa> list = new ArrayList();
        list.add(hh1);
        list.add(hh2);
        list.add(hh3);
        list.add(hh4);
        list.add(hh5);

        return list;

    }

    public static void hienthiThongTin(List<HangHoa> arr) {
        HangHoa.inTieuDe();
        for (HangHoa x : arr) {
            x.inDuLieu();
        }
    }

    public static void sapXepTheoMahang(List<HangHoa> arr) {
        System.out.println("Sau khi sap xep theo ma hang: ");
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getMahang().compareToIgnoreCase(arr.get(j).getMahang()) > 0) {
                    HangHoa t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }
                if (arr.get(i).getMahang().compareToIgnoreCase(arr.get(j).getMahang()) == 0) {
                    if (arr.get(i).getSoLuong() > arr.get(j).getSoLuong()) {
                        HangHoa t = arr.get(i);
                        arr.set(i, arr.get(j));
                        arr.set(j, t);
                    }

                }

            }
        }
    }

    public static void checkMaHang(List<HangHoa> arr) {
        Scanner sc = new Scanner(System.in);
        String maHang;
        System.out.print("Nhap vao mot ma hang: ");
        maHang = sc.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if (maHang.equalsIgnoreCase(arr.get(i).getMahang())) {
                arr.get(i).inDuLieu();
                System.out.print("Sua ma hang: ");
                arr.get(i).setMahang(sc.nextLine());
                System.out.print("Sua ten hang: ");
                arr.get(i).setTenhang(sc.nextLine());
                System.out.print("Sua mau sac: ");
                arr.get(i).setMausac(sc.nextLine());
                System.out.print("Sua so luong: ");
                arr.get(i).setSoLuong(Integer.parseInt(sc.nextLine()));
            }

        }
        System.out.println("Sau khi chinh sua thong tin:");
    }

}
