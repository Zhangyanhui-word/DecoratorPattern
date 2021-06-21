package decoratorpattern;
	 
	/**
	 * ���������[ConcreteDecorator]֮��T����
	 */
	public class TShirts extends Finery {
		@Override
		public void show() {
			System.out.print("T��    ");// ��ʵ�ʿ����У���Ӧ��Ϊ�������ݽ��д���Ĺ��̡�
			super.show();// ���ദ��Ĺ���
		}
	}
	 
	/**
	 * ���������[ConcreteDecorator]֮����㡯
	 */
	class BigTrouser extends Finery{
		@Override
		public void show() {
			System.out.print("���    ");
			super.show();
		}
	}
	 
	/**
	 * ���������[ConcreteDecorator]֮������Ь��
	 */
	class Sneakers extends Finery{
		@Override
		public void show() {
			System.out.print("����Ь    ");
			super.show();
		}
	}
	 
	/**
	 * ���������[ConcreteDecorator]֮����װ��
	 */
	class Suit extends Finery{
		@Override
		public void show() {
			System.out.print("��װ    ");
			super.show();
		}
	}
	 
	/**
	 * ���������[ConcreteDecorator]֮�������
	 */
	class Tie extends Finery{
		@Override
		public void show() {
			System.out.print("���    ");
			super.show();
		}
	}
	 
	/**
	 * ���������[ConcreteDecorator]֮��ƤЬ��
	 */
	class LeatherShoes extends Finery{
		@Override
		public void show() {
			System.out.print("ƤЬ    ");
			super.show();
		}
	}
