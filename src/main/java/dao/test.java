package dao;

import java.io.File;
import java.util.List;

public class test {

	/**
	 * @������main���Է���
	 * @���ߣ����� @ʱ�䣺2012-08-29 ����17:12:15
	 * @������@param args
	 * @������@throws Exception
	 * @����ֵ��void
	 */
	public static void main(String[] args) throws Exception {
		ReadExecl poi = new ReadExecl();
		// List<List<String>> list = poi.read("d:/aaa.xls");
		List<List<String>> list = poi.read("aa.xlsx");
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print("��" + (i) + "��\t");
				List<String> cellList = list.get(i);
				for (int j = 0; j < cellList.size(); j++) {
					System.out.print(" ��" + (j + 1) + "��ֵ��");
					System.out.print(cellList.get(j)+"\t");
				}
				System.out.println();
			}
		}
	}
}
