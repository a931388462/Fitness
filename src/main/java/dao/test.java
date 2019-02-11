package dao;

import java.io.File;
import java.util.List;

public class test {

	/**
	 * @描述：main测试方法
	 * @作者：建宁 @时间：2012-08-29 下午17:12:15
	 * @参数：@param args
	 * @参数：@throws Exception
	 * @返回值：void
	 */
	public static void main(String[] args) throws Exception {
		ReadExecl poi = new ReadExecl();
		// List<List<String>> list = poi.read("d:/aaa.xls");
		List<List<String>> list = poi.read("aa.xlsx");
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				System.out.print("第" + (i) + "行\t");
				List<String> cellList = list.get(i);
				for (int j = 0; j < cellList.size(); j++) {
					System.out.print(" 第" + (j + 1) + "列值：");
					System.out.print(cellList.get(j)+"\t");
				}
				System.out.println();
			}
		}
	}
}
