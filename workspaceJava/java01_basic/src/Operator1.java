class  Operator1
{
	public static void main(String[] args) 
	{
		//������ : ���������, ����(��)������, ��������, ���׿�����, ���Կ�����, ����Ʈ������, ���׿�����
		//1. ��������� : +, -, *, /(��, �Ǽ�), %(������)

		int num1 = 10;
		int num2 = 3;

		int result1 = num1 % num2;
		System.out.println("result1 = " + result1);

		//2. ���׿����� : ++(1����), --(1����), 

		int a = 10;
		a = a + 1;	// 1�����ϴ� ����
		System.out.println("a=" + a);

		//a++;	// 1�����ϴ� ����
		++a;
		System.out.println("a=" + a);

		//--a;		a = a - 1;
		a--; // 1�����ϴ� ����
		System.out.println("a=" + a);

		int b = a++;	// 11, 12
		System.out.println("b=" + b + ", a=" + a);

		int c = ++a;	// 13, 13
		System.out.println("c=" + c + ", a=" + a);

		int result2 = b + c++;	// 11+13=24		c->14
		//int result2 = b + ++c;	// 11+14=25		c->14
		System.out.println("result2=" + result2 + ", c=" + c);

		//3. ���Կ����� 
		//a = 13
		a += 4;		//a = a + 4;	17		a+=1; a=a+1;
		//b = 11
		b -= 3;		//a = a - 3;	8
		//c = 14
		c *= 2;		//c = c * 2;	28
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		c += a + b;		// c = c + a + b;	53
		System.out.println("c=" + c);

		//4. �񱳿����� : >, >=, <, <=, ==, !=
		int x = 200;
		int y = 300;

		boolean boo = x > y; //false
		boolean boo2 = x < y; //true
		System.out.println("boo= " + boo);
		System.out.println("boo2= " + boo2);

		//5. ���׿����� ���=(���ǽ�)?���϶�:�����϶�
		//�޿��� 10000�� �̻��϶��� ���ʽ��� 50%
		//�޿��� 10000�� �̸��϶��� ���ʽ��� 90%�� ���� ��� ���ʽ��� ������ ���.
		int sal = 9000;	//�޿�
						
		double bonus = (sal >= 10000) ? sal*0.5 : sal*0.9 ;
		System.out.println("sal=" + sal + ", bonus=" + bonus);

		//6. �������� : &&(and), ||(or), !(not)
		int ave = 51;
		String grade = (ave>=70 && ave<80) ? "c" : "�� ��";
		System.out.println("grade=" + grade);


		char ch = 'A';	// char�� ������ �����ϴ�.
		//ch++;	ch += 1;
		ch = (char)(ch + 1);
		System.out.println("ch=" + ch);

		char ch2 = (char)85;
		System.out.println("ch2=" + ch2);

	}
}
