package cn.sxt.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
/**
 * �ļ��ַ������
 * @author �����˸���
 * //����ԭ��
 * 1���ֽ�������
 * �����ַ���------��ֹ����
 * 2���ַ�����ͳһ
 */
public class TestCharStream02 {

	public static void main(String[] args){
		File dest=new File("abc1.txt");
		Writer d=null;
		try {
			d=new FileWriter(dest);
			String str="2019ȫ���о����ȼ�����yayayy";
		//	char[] dt2=str.toCharArray();//�ַ���------>�ַ�����
		//	d.write(dt2, 0, dt2.length);
		//	d.flush();

			d.write(str);
			d.append("nanan").append("�㻹��SCE");		//���������ַ���
			d.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if(null!=d){
				d.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
