package org.dimigo.basic;

public class PrimitiveDataType {
	public static void main(String[] args) {
		
		String name = "������";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		
				
		System.out.println("<<������ ������>>");
		System.out.println("�̸� : " + name);
		if(gender)
			System.out.println("���� : ����");
		else
			System.out.println("���� ; ����");
		System.out.println("���� : " + age );
		System.out.println("Ű : " + height );
		System.out.println("������ : " + weight);
		System.out.println("������ : " + bloodtype);
		
	}

}
