package VendingMachine;

public class vendingMachine {

	public static void main(String[] args) {
			
	}
}

class �������Ա�{
	private int �������Ա�=0;
	private Long �������Ա�=0L;
	private Long ����ݾ�=0L;
	
	public �������Ա�(int �������Ա�) {
		this.�������Ա�=�������Ա�;
		����ݾ�+=�������Ա�;
	}
	public �������Ա�(Long �������Ա�) {
		this.�������Ա�=�������Ա�;
		����ݾ�+=�������Ա�;
	}
	public �������Ա�(int �������Ա�, Long �������Ա�){
		this.�������Ա�=�������Ա�;
		this.�������Ա�=�������Ա�;
		
		�������Ա�+=�������Ա�;
		�������Ա�+=�������Ա�;
		
		����ݾ�=�������Ա�+�������Ա�;
	}
}
class ��ư{
	��� n = new ���();
	boolean �Ƹ޸�ī���ư;
	boolean ������ӹ�ư;
	boolean ��ũĿ�ǹ�ư;
	boolean �ܵ���ȯ��ư;
	boolean ���̽�_��_���ù�ư;
	
	void �Ƹ޸�ī��() {
		n.�Ƹ޸�ī�븸���();
	}
	void �������() {
		n.������Ӹ����();
	}
	void ��ũĿ��() {
		n.��ũĿ�Ǹ����();
	}
	void  �ܵ���ȯ() {
		n.�ܵ���ȯ();
	}
	
}
class ���{
	int �߰ſ;
	int ������ӽ÷�;
	int Ŀ�ǰ���;
	int ����;
	int ����;
	int ������;
	void �Ƹ޸�ī�븸���() {
		������--;
		����--;
		Ŀ�ǰ���--;
		�߰ſ--;
		System.out.println("�Ƹ޸�ī��");
	}
	void ������Ӹ����() {
		������ӽ÷�--;
		������--;
		Ŀ�ǰ���--;
		�߰ſ--;
		System.out.println("�������");
	}
	void ��ũĿ�Ǹ����() {
		����--;
		������--;
		Ŀ�ǰ���--;
		�߰ſ--;
		System.out.println("��ũĿ��");
	}
	void �ܵ���ȯ() {
		System.out.println("�ܵ���ȯ");
	}
}
