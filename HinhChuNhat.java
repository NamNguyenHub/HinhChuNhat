package thanhNam_19514681;

import java.util.Scanner;


public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	public double getChieuDai() {

		return chieuDai;
	}

	public void setChieuDai(double d) {
		if (d > 0) {
			this.chieuDai = d;
		} else {

			System.out.println("loi chieu dai");
		}

	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double r) {
		if (r <= 0) {
			System.out.println("Loi chieu rong");
		} else {
			this.chieuRong = r;
		}

	}

	public HinhChuNhat(double d, double r) {

		if (d > 0) {
			this.chieuDai = d;

		} else {
			System.out.println("loi chieu dai");
		}
		if (r <= 0) {
			System.out.println("Loi chieu rong");
		} else {
			this.chieuRong = r;
		}
	}

	public HinhChuNhat() {

	}

	// Xay dung phuong thuc
	public double getChuVi() {
		return (getChieuDai() + getChieuRong()) * 2;
	}

	public double getDienTich() {
		return getChieuDai() * getChieuRong();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		// Khoi tao doi tuong tu ham tao
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(10);
		h1.setChieuRong(8);
		System.out.println("Ket qua la:");
		System.out.println("chieu dai hcn:" + h1.getChieuDai());
		System.out.println("chieu rong hcn:" + h1.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la:" + h1.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: " + h1.getDienTich());
		// Khoi tao HCN h2 cap nhat cung
		
		HinhChuNhat h2 = new HinhChuNhat(10, 6);
		System.out.println("Ket qua la:");
		System.out.println("chieu dai hcn:" + h2.getChieuDai());
		System.out.println("chieu rong hcn:" + h2.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la:" + h2.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: " + h2.getDienTich());
		//Nhap mem
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu ban phim");
		System.out.println("Nhap chieu dai:");
		double d = sc.nextDouble();
		h1.setChieuDai(d);
		System.out.println("Nhap chieu rong:");
		double r = sc.nextDouble();
		h1.setChieuRong(r);
		System.out.println("Ket qua la:");
		System.out.println("chieu dai hcn:" + h1.getChieuDai());
		System.out.println("chieu rong hcn:" + h1.getChieuRong());
		System.out.println("Chu vi hinh chu nhat la:" + h1.getChuVi());
		System.out.println("Dien tich hinh chu nhat la: " + h1.getDienTich());
		
	}
}
