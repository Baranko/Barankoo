package math;

public class Skills {
	
	private int rand1;
	private int rand2;
	private int rand3;

	private int dob1 = 0;
	private int dob2 = 0;
	
	private boolean check1 = false;
	private boolean check2 = false;
	
	private int shtrav = 0;
	
	private String str1 = null;
	private String str2 = null;
	private String str3 = null;
	
	private String op1 = null;
	private String op2 = null;
	private String op3 = null;
	
	private String header = null;
	
	private String opis;
	
	public Skills(int rand1, int rand2, int rand3)
	{
		switch (rand1)
		{
			case 0:
				this.str1 ="������";
				this.dob1 = -3;
				this.check1 = true;
				this.op1="�� �������� �������";
				break;
			case 1:
				this.str1 = "���������";
				this.dob1 = -3;
				this.check1 = false;
				this.op1="�� �������� �����������";
				break;
			case 2:
				this.str1 ="���������";
				this.op1 = "";
				break;
			case 3:
				this.str1 ="��������";
				this.dob1 = 3;
				this.check1 = false;
				this.op1="�� ��������� ����� �����������";
				break;
			case 4:
				this.str1 ="��������";
				this.dob1 = 3;
				this.check1 = true;
				this.op1="�� ��������� ����� �������";
				break;
		}
		switch (rand2)
		{
			case 0:
				this.str2="����";
				this.dob2 = 1;
				this.check2 = false;
				this.op2="������� ����������� �������";
				break;
			case 1:
				this.str2="������";
				this.dob2 = 1;
				this.check2 = true;
				this.op2="������� �������� �������";
				break;
			case 2:
				this.str2="�����";
				this.dob2 = 2;
				this.check2 = true;
				this.op2="������� �������� �������";
				break;
			case 3:
				this.str2="����";
				this.dob2 = -1;
				this.check2 = true;
				this.op2="������� �������� �������";
				break;
			case 4:
				this.str2="�����";
				this.dob2 = -1;
				this.check2 = false;
				this.op2="������� ����������� �������";
				break;
		}
		switch (rand3)
		{
			case 0:
				this.str3="������";
				this.op3=" � ������� ���� �����.";
				this.shtrav=2;
				break;
			case 1:
				this.str3="�����";
				this.op3=" � ������� ������ ����.";
				this.shtrav=1;
				break;
			case 2:
				this.str3="��������";
				this.shtrav=0;
				this.op3="... ��� ���� �����. ������� �� �������.";
				break;
			case 3:
				this.str3="���������";
				this.op3=" �  ������� ���� �����.";
				this.shtrav=3;
				break;
			case 4:
				this.str3="�������";
				this.op3=" � ������� ������� �����.";
				this.shtrav=4;
				break;
		}
		this.header = this.str1 + this.str2 + this.str3;
		this.opis = this.op1 + " " + this.op2 + this.op3;
	}

	public String getHeader() {
		return header;
	}
	public int getDob1() {
		return dob1;
	}
	public int getDob2() {
		return dob2;
	}
	public boolean getCheck1() {
		return check1;
	}
	public boolean getCheck2() {
		return check2;
	}
	public int getShtrav()
	{
		return shtrav;
	}
	public String getOpis() {
		return opis;
	}
}
