
public class AObj {

//	System.out.println("AAA");
//	System.out.println("AAA");
	
	// ~ 기능이 필요합니다. 개발해주세요
	
	Ainterface ainterface;
	
	public AObj() {
		ainterface = new AinterfaceImpl();
	}
	
	public void funcAA() {
		// 다른 객체로 위임한다
		ainterface.funcA();
		ainterface.funcA();
		
	}
}
